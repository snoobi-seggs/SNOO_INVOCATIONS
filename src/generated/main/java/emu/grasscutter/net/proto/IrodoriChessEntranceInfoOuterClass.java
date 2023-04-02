// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessEntranceInfo.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessEntranceInfoOuterClass {
  private IrodoriChessEntranceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessEntranceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessEntranceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> 
        getMonsterInfoListList();
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getMonsterInfoList(int index);
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    int getMonsterInfoListCount();
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder> 
        getMonsterInfoListOrBuilderList();
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 entrance_point_id = 2;</code>
     * @return The entrancePointId.
     */
    int getEntrancePointId();
  }
  /**
   * <pre>
   * Name: NBGICJDBGIO
   * </pre>
   *
   * Protobuf type {@code IrodoriChessEntranceInfo}
   */
  public static final class IrodoriChessEntranceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessEntranceInfo)
      IrodoriChessEntranceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessEntranceInfo.newBuilder() to construct.
    private IrodoriChessEntranceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessEntranceInfo() {
      monsterInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessEntranceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessEntranceInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 16: {

              entrancePointId_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                monsterInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          monsterInfoList_ = java.util.Collections.unmodifiableList(monsterInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.internal_static_IrodoriChessEntranceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.internal_static_IrodoriChessEntranceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.class, emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.Builder.class);
    }

    public static final int MONSTER_INFO_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> monsterInfoList_;
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> getMonsterInfoListList() {
      return monsterInfoList_;
    }
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder> 
        getMonsterInfoListOrBuilderList() {
      return monsterInfoList_;
    }
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    @java.lang.Override
    public int getMonsterInfoListCount() {
      return monsterInfoList_.size();
    }
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getMonsterInfoList(int index) {
      return monsterInfoList_.get(index);
    }
    /**
     * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
        int index) {
      return monsterInfoList_.get(index);
    }

    public static final int ENTRANCE_POINT_ID_FIELD_NUMBER = 2;
    private int entrancePointId_;
    /**
     * <code>uint32 entrance_point_id = 2;</code>
     * @return The entrancePointId.
     */
    @java.lang.Override
    public int getEntrancePointId() {
      return entrancePointId_;
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
      if (entrancePointId_ != 0) {
        output.writeUInt32(2, entrancePointId_);
      }
      for (int i = 0; i < monsterInfoList_.size(); i++) {
        output.writeMessage(4, monsterInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entrancePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entrancePointId_);
      }
      for (int i = 0; i < monsterInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, monsterInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo other = (emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo) obj;

      if (!getMonsterInfoListList()
          .equals(other.getMonsterInfoListList())) return false;
      if (getEntrancePointId()
          != other.getEntrancePointId()) return false;
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
      if (getMonsterInfoListCount() > 0) {
        hash = (37 * hash) + MONSTER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterInfoListList().hashCode();
      }
      hash = (37 * hash) + ENTRANCE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntrancePointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo prototype) {
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
     * Name: NBGICJDBGIO
     * </pre>
     *
     * Protobuf type {@code IrodoriChessEntranceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessEntranceInfo)
        emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.internal_static_IrodoriChessEntranceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.internal_static_IrodoriChessEntranceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.class, emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.newBuilder()
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
          getMonsterInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (monsterInfoListBuilder_ == null) {
          monsterInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          monsterInfoListBuilder_.clear();
        }
        entrancePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.internal_static_IrodoriChessEntranceInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo build() {
        emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo result = new emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo(this);
        int from_bitField0_ = bitField0_;
        if (monsterInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            monsterInfoList_ = java.util.Collections.unmodifiableList(monsterInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.monsterInfoList_ = monsterInfoList_;
        } else {
          result.monsterInfoList_ = monsterInfoListBuilder_.build();
        }
        result.entrancePointId_ = entrancePointId_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo.getDefaultInstance()) return this;
        if (monsterInfoListBuilder_ == null) {
          if (!other.monsterInfoList_.isEmpty()) {
            if (monsterInfoList_.isEmpty()) {
              monsterInfoList_ = other.monsterInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMonsterInfoListIsMutable();
              monsterInfoList_.addAll(other.monsterInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.monsterInfoList_.isEmpty()) {
            if (monsterInfoListBuilder_.isEmpty()) {
              monsterInfoListBuilder_.dispose();
              monsterInfoListBuilder_ = null;
              monsterInfoList_ = other.monsterInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              monsterInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonsterInfoListFieldBuilder() : null;
            } else {
              monsterInfoListBuilder_.addAllMessages(other.monsterInfoList_);
            }
          }
        }
        if (other.getEntrancePointId() != 0) {
          setEntrancePointId(other.getEntrancePointId());
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
        emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> monsterInfoList_ =
        java.util.Collections.emptyList();
      private void ensureMonsterInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monsterInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo>(monsterInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder> monsterInfoListBuilder_;

      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> getMonsterInfoListList() {
        if (monsterInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsterInfoList_);
        } else {
          return monsterInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public int getMonsterInfoListCount() {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.size();
        } else {
          return monsterInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo getMonsterInfoList(int index) {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.get(index);
        } else {
          return monsterInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder setMonsterInfoList(
          int index, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.set(index, value);
          onChanged();
        } else {
          monsterInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder setMonsterInfoList(
          int index, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder addMonsterInfoList(emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(value);
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder addMonsterInfoList(
          int index, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo value) {
        if (monsterInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(index, value);
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder addMonsterInfoList(
          emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder addMonsterInfoList(
          int index, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder builderForValue) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          monsterInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder addAllMonsterInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo> values) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsterInfoList_);
          onChanged();
        } else {
          monsterInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder clearMonsterInfoList() {
        if (monsterInfoListBuilder_ == null) {
          monsterInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          monsterInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public Builder removeMonsterInfoList(int index) {
        if (monsterInfoListBuilder_ == null) {
          ensureMonsterInfoListIsMutable();
          monsterInfoList_.remove(index);
          onChanged();
        } else {
          monsterInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder getMonsterInfoListBuilder(
          int index) {
        return getMonsterInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder getMonsterInfoListOrBuilder(
          int index) {
        if (monsterInfoListBuilder_ == null) {
          return monsterInfoList_.get(index);  } else {
          return monsterInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder> 
           getMonsterInfoListOrBuilderList() {
        if (monsterInfoListBuilder_ != null) {
          return monsterInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsterInfoList_);
        }
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder addMonsterInfoListBuilder() {
        return getMonsterInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder addMonsterInfoListBuilder(
          int index) {
        return getMonsterInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriChessMonsterInfo monster_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder> 
           getMonsterInfoListBuilderList() {
        return getMonsterInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder> 
          getMonsterInfoListFieldBuilder() {
        if (monsterInfoListBuilder_ == null) {
          monsterInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfo.Builder, emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.IrodoriChessMonsterInfoOrBuilder>(
                  monsterInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          monsterInfoList_ = null;
        }
        return monsterInfoListBuilder_;
      }

      private int entrancePointId_ ;
      /**
       * <code>uint32 entrance_point_id = 2;</code>
       * @return The entrancePointId.
       */
      @java.lang.Override
      public int getEntrancePointId() {
        return entrancePointId_;
      }
      /**
       * <code>uint32 entrance_point_id = 2;</code>
       * @param value The entrancePointId to set.
       * @return This builder for chaining.
       */
      public Builder setEntrancePointId(int value) {
        
        entrancePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entrance_point_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntrancePointId() {
        
        entrancePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessEntranceInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessEntranceInfo)
    private static final emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessEntranceInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessEntranceInfo>() {
      @java.lang.Override
      public IrodoriChessEntranceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessEntranceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessEntranceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessEntranceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessEntranceInfoOuterClass.IrodoriChessEntranceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessEntranceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessEntranceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036IrodoriChessEntranceInfo.proto\032\035Irodor" +
      "iChessMonsterInfo.proto\"j\n\030IrodoriChessE" +
      "ntranceInfo\0223\n\021monster_info_list\030\004 \003(\0132\030" +
      ".IrodoriChessMonsterInfo\022\031\n\021entrance_poi" +
      "nt_id\030\002 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessEntranceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessEntranceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessEntranceInfo_descriptor,
        new java.lang.String[] { "MonsterInfoList", "EntrancePointId", });
    emu.grasscutter.net.proto.IrodoriChessMonsterInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
