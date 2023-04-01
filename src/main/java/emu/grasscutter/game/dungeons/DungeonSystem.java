package emu.grasscutter.game.dungeons;

import emu.grasscutter.GameConstants;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.SceneType;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.BaseGameSystem;
import emu.grasscutter.server.game.GameServer;
import emu.grasscutter.server.packet.send.PacketDungeonEntryInfoRsp;
import emu.grasscutter.server.packet.send.PacketPlayerEnterDungeonRsp;
import emu.grasscutter.utils.Position;
import java.util.List;

public final class DungeonSystem extends BaseGameSystem {
    private static final BasicDungeonSettleListener basicDungeonSettleObserver =
            new BasicDungeonSettleListener();

    public DungeonSystem(GameServer server) {
        super(server);
    }

    public void getEntryInfo(Player player, int pointId) {
        var entry = GameData.getScenePointEntryById(player.getScene().getId(), pointId);

        if (entry == null) {
            // Error
            player.sendPacket(new PacketDungeonEntryInfoRsp());
            return;
        }

        player.sendPacket(new PacketDungeonEntryInfoRsp(player, entry.getPointData()));
    }

    public boolean enterDungeon(Player player, int pointId, int dungeonId) {
        var data = GameData.getDungeonDataMap().get(dungeonId);
        if (data == null) {
            return false;
        }

        Grasscutter.getLogger()
                .debug(
                        "{}({}) is trying to enter dungeon {}",
                        player.getNickname(),
                        player.getUid(),
                        dungeonId);

        var sceneId = data.getSceneId();
        player.getScene().setPrevScene(sceneId);

        if (player.getWorld().transferPlayerToScene(player, sceneId, data)) {
            player.getScene().addDungeonSettleObserver(basicDungeonSettleObserver);
            player.getQuestManager().triggerEvent(QuestContent.QUEST_CONTENT_ENTER_DUNGEON, data.getId());
        }

        player.getScene().setPrevScenePoint(pointId);
        player.sendPacket(new PacketPlayerEnterDungeonRsp(pointId, dungeonId));
        return true;
    }

    /** used in tower dungeons handoff */
    public boolean handoffDungeon(
            Player player, int dungeonId, List<DungeonSettleListener> dungeonSettleListeners) {
        var data = GameData.getDungeonDataMap().get(dungeonId);
        if (data == null) {
            return false;
        }

        Grasscutter.getLogger()
                .debug(
                        "{}({}) is trying to enter tower dungeon {}",
                        player.getNickname(),
                        player.getUid(),
                        dungeonId);

        if (player.getWorld().transferPlayerToScene(player, data.getSceneId(), data)) {
            dungeonSettleListeners.forEach(player.getScene()::addDungeonSettleObserver);
        }

        return true;
    }

    public void exitDungeon(Player player) {
        var scene = player.getScene();

        if (scene == null || scene.getSceneType() != SceneType.SCENE_DUNGEON) {
            return;
        }

        // Get previous scene
        var prevScene = scene.getPrevScene() > 0 ? scene.getPrevScene() : 3;

        // Get previous position
        var dungeonData = scene.getDungeonData();
        var prevPos = new Position(GameConstants.START_POSITION);

        if (dungeonData != null) {
            var entry = GameData.getScenePointEntryById(prevScene, scene.getPrevScenePoint());

            if (entry != null) {
                prevPos.set(entry.getPointData().getTranPos());
            }
        }

        // clean temp team if it has
        player.getTeamManager().cleanTemporaryTeam();
        player.getTowerManager().clearEntry();

        // Transfer player back to world
        player.getWorld().transferPlayerToScene(player, prevScene, prevPos);
        player.sendPacket(new BasePacket(PacketOpcodes.PlayerQuitDungeonRsp));
    }
}
