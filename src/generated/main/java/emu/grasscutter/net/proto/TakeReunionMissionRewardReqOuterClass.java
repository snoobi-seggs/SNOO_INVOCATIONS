// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeReunionMissionRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeReunionMissionRewardReqOuterClass {
  private TakeReunionMissionRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeReunionMissionRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeReunionMissionRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_id = 3;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>uint32 reward_index = 4;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();

    /**
     * <code>uint32 mission_id = 1;</code>
     * @return The missionId.
     */
    int getMissionId();
  }
  /**
   * <pre>
   * Name: KEMGFBIJKCM
   * CmdId: 5052
   * </pre>
   *
   * Protobuf type {@code TakeReunionMissionRewardReq}
   */
  public static final class TakeReunionMissionRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeReunionMissionRewardReq)
      TakeReunionMissionRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeReunionMissionRewardReq.newBuilder() to construct.
    private TakeReunionMissionRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeReunionMissionRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeReunionMissionRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeReunionMissionRewardReq(
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
            case 8: {

              missionId_ = input.readUInt32();
              break;
            }
            case 24: {

              rewardId_ = input.readUInt32();
              break;
            }
            case 32: {

              rewardIndex_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.internal_static_TakeReunionMissionRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.internal_static_TakeReunionMissionRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.class, emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.Builder.class);
    }

    public static final int REWARD_ID_FIELD_NUMBER = 3;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 3;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int REWARD_INDEX_FIELD_NUMBER = 4;
    private int rewardIndex_;
    /**
     * <code>uint32 reward_index = 4;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      return rewardIndex_;
    }

    public static final int MISSION_ID_FIELD_NUMBER = 1;
    private int missionId_;
    /**
     * <code>uint32 mission_id = 1;</code>
     * @return The missionId.
     */
    @java.lang.Override
    public int getMissionId() {
      return missionId_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (missionId_ != 0) {
        output.writeUInt32(1, missionId_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(3, rewardId_);
      }
      if (rewardIndex_ != 0) {
        output.writeUInt32(4, rewardIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (missionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, missionId_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, rewardId_);
      }
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, rewardIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq other = (emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq) obj;

      if (getRewardId()
          != other.getRewardId()) return false;
      if (getRewardIndex()
          != other.getRewardIndex()) return false;
      if (getMissionId()
          != other.getMissionId()) return false;
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
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + REWARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (37 * hash) + MISSION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMissionId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: KEMGFBIJKCM
     * CmdId: 5052
     * </pre>
     *
     * Protobuf type {@code TakeReunionMissionRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeReunionMissionRewardReq)
        emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.internal_static_TakeReunionMissionRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.internal_static_TakeReunionMissionRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.class, emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        rewardId_ = 0;

        rewardIndex_ = 0;

        missionId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.internal_static_TakeReunionMissionRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq build() {
        emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq buildPartial() {
        emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq result = new emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq(this);
        result.rewardId_ = rewardId_;
        result.rewardIndex_ = rewardIndex_;
        result.missionId_ = missionId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq other) {
        if (other == emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq.getDefaultInstance()) return this;
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
        }
        if (other.getMissionId() != 0) {
          setMissionId(other.getMissionId());
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
        emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 3;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 3;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 reward_index = 4;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
      public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 reward_index = 4;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_index = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
        onChanged();
        return this;
      }

      private int missionId_ ;
      /**
       * <code>uint32 mission_id = 1;</code>
       * @return The missionId.
       */
      @java.lang.Override
      public int getMissionId() {
        return missionId_;
      }
      /**
       * <code>uint32 mission_id = 1;</code>
       * @param value The missionId to set.
       * @return This builder for chaining.
       */
      public Builder setMissionId(int value) {
        
        missionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mission_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionId() {
        
        missionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeReunionMissionRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeReunionMissionRewardReq)
    private static final emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq();
    }

    public static emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeReunionMissionRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeReunionMissionRewardReq>() {
      @java.lang.Override
      public TakeReunionMissionRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeReunionMissionRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeReunionMissionRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeReunionMissionRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeReunionMissionRewardReqOuterClass.TakeReunionMissionRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeReunionMissionRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeReunionMissionRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TakeReunionMissionRewardReq.proto\"Z\n\033T" +
      "akeReunionMissionRewardReq\022\021\n\treward_id\030" +
      "\003 \001(\r\022\024\n\014reward_index\030\004 \001(\r\022\022\n\nmission_i" +
      "d\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeReunionMissionRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeReunionMissionRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeReunionMissionRewardReq_descriptor,
        new java.lang.String[] { "RewardId", "RewardIndex", "MissionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
