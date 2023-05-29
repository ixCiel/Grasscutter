// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GAFGDOHOCNP.proto

package emu.grasscutter.net.proto;

public final class GAFGDOHOCNPOuterClass {
    private GAFGDOHOCNPOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GAFGDOHOCNPOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GAFGDOHOCNP)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 KAMHGILECDD = 12;</code>
         *
         * @return The kAMHGILECDD.
         */
        int getKAMHGILECDD();

        /**
         * <code>uint32 start_time = 11;</code>
         *
         * @return The startTime.
         */
        int getStartTime();

        /**
         * <code>bool is_paused = 1;</code>
         *
         * @return The isPaused.
         */
        boolean getIsPaused();
    }
    /** Protobuf type {@code GAFGDOHOCNP} */
    public static final class GAFGDOHOCNP extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GAFGDOHOCNP)
            GAFGDOHOCNPOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GAFGDOHOCNP.newBuilder() to construct.
        private GAFGDOHOCNP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GAFGDOHOCNP() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GAFGDOHOCNP();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GAFGDOHOCNP(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            {
                                isPaused_ = input.readBool();
                                break;
                            }
                        case 88:
                            {
                                startTime_ = input.readUInt32();
                                break;
                            }
                        case 96:
                            {
                                kAMHGILECDD_ = input.readInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.internal_static_GAFGDOHOCNP_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass
                    .internal_static_GAFGDOHOCNP_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.class,
                            emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.Builder.class);
        }

        public static final int KAMHGILECDD_FIELD_NUMBER = 12;
        private int kAMHGILECDD_;
        /**
         * <code>int32 KAMHGILECDD = 12;</code>
         *
         * @return The kAMHGILECDD.
         */
        @java.lang.Override
        public int getKAMHGILECDD() {
            return kAMHGILECDD_;
        }

        public static final int START_TIME_FIELD_NUMBER = 11;
        private int startTime_;
        /**
         * <code>uint32 start_time = 11;</code>
         *
         * @return The startTime.
         */
        @java.lang.Override
        public int getStartTime() {
            return startTime_;
        }

        public static final int IS_PAUSED_FIELD_NUMBER = 1;
        private boolean isPaused_;
        /**
         * <code>bool is_paused = 1;</code>
         *
         * @return The isPaused.
         */
        @java.lang.Override
        public boolean getIsPaused() {
            return isPaused_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (isPaused_ != false) {
                output.writeBool(1, isPaused_);
            }
            if (startTime_ != 0) {
                output.writeUInt32(11, startTime_);
            }
            if (kAMHGILECDD_ != 0) {
                output.writeInt32(12, kAMHGILECDD_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isPaused_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isPaused_);
            }
            if (startTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, startTime_);
            }
            if (kAMHGILECDD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(12, kAMHGILECDD_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP other =
                    (emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP) obj;

            if (getKAMHGILECDD() != other.getKAMHGILECDD()) return false;
            if (getStartTime() != other.getStartTime()) return false;
            if (getIsPaused() != other.getIsPaused()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + KAMHGILECDD_FIELD_NUMBER;
            hash = (53 * hash) + getKAMHGILECDD();
            hash = (37 * hash) + START_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getStartTime();
            hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsPaused());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /** Protobuf type {@code GAFGDOHOCNP} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GAFGDOHOCNP)
                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNPOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass
                        .internal_static_GAFGDOHOCNP_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass
                        .internal_static_GAFGDOHOCNP_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.class,
                                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                kAMHGILECDD_ = 0;

                startTime_ = 0;

                isPaused_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass
                        .internal_static_GAFGDOHOCNP_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP build() {
                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP buildPartial() {
                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP result =
                        new emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP(this);
                result.kAMHGILECDD_ = kAMHGILECDD_;
                result.startTime_ = startTime_;
                result.isPaused_ = isPaused_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP) {
                    return mergeFrom((emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP other) {
                if (other
                        == emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP.getDefaultInstance())
                    return this;
                if (other.getKAMHGILECDD() != 0) {
                    setKAMHGILECDD(other.getKAMHGILECDD());
                }
                if (other.getStartTime() != 0) {
                    setStartTime(other.getStartTime());
                }
                if (other.getIsPaused() != false) {
                    setIsPaused(other.getIsPaused());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int kAMHGILECDD_;
            /**
             * <code>int32 KAMHGILECDD = 12;</code>
             *
             * @return The kAMHGILECDD.
             */
            @java.lang.Override
            public int getKAMHGILECDD() {
                return kAMHGILECDD_;
            }
            /**
             * <code>int32 KAMHGILECDD = 12;</code>
             *
             * @param value The kAMHGILECDD to set.
             * @return This builder for chaining.
             */
            public Builder setKAMHGILECDD(int value) {

                kAMHGILECDD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 KAMHGILECDD = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearKAMHGILECDD() {

                kAMHGILECDD_ = 0;
                onChanged();
                return this;
            }

            private int startTime_;
            /**
             * <code>uint32 start_time = 11;</code>
             *
             * @return The startTime.
             */
            @java.lang.Override
            public int getStartTime() {
                return startTime_;
            }
            /**
             * <code>uint32 start_time = 11;</code>
             *
             * @param value The startTime to set.
             * @return This builder for chaining.
             */
            public Builder setStartTime(int value) {

                startTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 start_time = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStartTime() {

                startTime_ = 0;
                onChanged();
                return this;
            }

            private boolean isPaused_;
            /**
             * <code>bool is_paused = 1;</code>
             *
             * @return The isPaused.
             */
            @java.lang.Override
            public boolean getIsPaused() {
                return isPaused_;
            }
            /**
             * <code>bool is_paused = 1;</code>
             *
             * @param value The isPaused to set.
             * @return This builder for chaining.
             */
            public Builder setIsPaused(boolean value) {

                isPaused_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_paused = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsPaused() {

                isPaused_ = false;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:GAFGDOHOCNP)
        }

        // @@protoc_insertion_point(class_scope:GAFGDOHOCNP)
        private static final emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP();
        }

        public static emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GAFGDOHOCNP> PARSER =
                new com.google.protobuf.AbstractParser<GAFGDOHOCNP>() {
                    @java.lang.Override
                    public GAFGDOHOCNP parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GAFGDOHOCNP(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GAFGDOHOCNP> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GAFGDOHOCNP> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GAFGDOHOCNPOuterClass.GAFGDOHOCNP getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GAFGDOHOCNP_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GAFGDOHOCNP_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021GAFGDOHOCNP.proto\"I\n\013GAFGDOHOCNP\022\023\n\013KA"
                    + "MHGILECDD\030\014 \001(\005\022\022\n\nstart_time\030\013 \001(\r\022\021\n\ti"
                    + "s_paused\030\001 \001(\010B\033\n\031emu.grasscutter.net.pr"
                    + "otob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GAFGDOHOCNP_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GAFGDOHOCNP_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GAFGDOHOCNP_descriptor,
                        new java.lang.String[] {
                            "KAMHGILECDD", "StartTime", "IsPaused",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}