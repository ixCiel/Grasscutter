package emu.grasscutter.server.packet.recv;

import emu.grasscutter.GameConstants;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.avatar.AvatarSkillDepotData;
import emu.grasscutter.data.excels.world.WorldAreaData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.AvatarChangeElementTypeReqOuterClass.AvatarChangeElementTypeReq;
import emu.grasscutter.net.proto.RetcodeOuterClass.Retcode;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketAbilityChangeNotify;
import emu.grasscutter.server.packet.send.PacketAvatarChangeElementTypeRsp;
import emu.grasscutter.server.packet.send.PacketAvatarFightPropNotify;
import emu.grasscutter.server.packet.send.PacketAvatarSkillDepotChangeNotify;

@Opcodes(PacketOpcodes.AvatarChangeElementTypeReq)
public class HandlerAvatarChangeElementTypeReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarChangeElementTypeReq req = AvatarChangeElementTypeReq.parseFrom(payload);

        WorldAreaData area = GameData.getWorldAreaDataMap().get(req.getAreaId());

        if (area == null
                || area.getElementType() == null
                || area.getElementType().getDepotValue() <= 0) {
            session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
            return;
        }

        // Get current avatar, should be one of the main characters
        EntityAvatar mainCharacterEntity =
                session.getPlayer().getTeamManager().getCurrentAvatarEntity();
        Avatar mainCharacter = mainCharacterEntity.getAvatar();

        int skillDepotId = area.getElementType().getDepotValue();
        switch (mainCharacter.getAvatarId()) {
            case GameConstants.MAIN_CHARACTER_MALE -> skillDepotId += 500;
            case GameConstants.MAIN_CHARACTER_FEMALE -> skillDepotId += 700;
            default -> {
                session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
                return;
            }
        }

        // Sanity checks for skill depots
        AvatarSkillDepotData skillDepot = GameData.getAvatarSkillDepotDataMap().get(skillDepotId);
        if (skillDepot == null || skillDepot.getId() == mainCharacter.getSkillDepotId()) {
            session.send(new PacketAvatarChangeElementTypeRsp(Retcode.RET_SVR_ERROR_VALUE));
            return;
        }

        // Set skill depot
        mainCharacter.setSkillDepotData(skillDepot);

        // Success
        session.send(new PacketAvatarChangeElementTypeRsp());

        // Ability change packet
        session.send(new PacketAvatarSkillDepotChangeNotify(mainCharacter));
        session.send(new PacketAbilityChangeNotify(mainCharacterEntity));
        session.send(new PacketAvatarFightPropNotify(mainCharacter));
    }
}
