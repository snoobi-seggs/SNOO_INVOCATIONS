// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOLOAFAFAJJ.proto

package emu.grasscutter.net.proto;

public final class IOLOAFAFAJJOuterClass {
  private IOLOAFAFAJJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IOLOAFAFAJJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IOLOAFAFAJJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BLAKMJNEEJD = 15;</code>
     * @return The bLAKMJNEEJD.
     */
    int getBLAKMJNEEJD();

    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);
  }
  /**
   * <pre>
   * Name: IOLOAFAFAJJ
   * CmdId: 3079
   * </pre>
   *
   * Protobuf type {@code IOLOAFAFAJJ}
   */
  public static final class IOLOAFAFAJJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IOLOAFAFAJJ)
      IOLOAFAFAJJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IOLOAFAFAJJ.newBuilder() to construct.
    private IOLOAFAFAJJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IOLOAFAFAJJ() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IOLOAFAFAJJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IOLOAFAFAJJ(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sceneTagIdList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneTagIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              bLAKMJNEEJD_ = input.readUInt32();
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
          sceneTagIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.internal_static_IOLOAFAFAJJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.internal_static_IOLOAFAFAJJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.class, emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.Builder.class);
    }

    public static final int BLAKMJNEEJD_FIELD_NUMBER = 15;
    private int bLAKMJNEEJD_;
    /**
     * <code>uint32 BLAKMJNEEJD = 15;</code>
     * @return The bLAKMJNEEJD.
     */
    @java.lang.Override
    public int getBLAKMJNEEJD() {
      return bLAKMJNEEJD_;
    }

    public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
      }
      if (bLAKMJNEEJD_ != 0) {
        output.writeUInt32(15, bLAKMJNEEJD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
      }
      if (bLAKMJNEEJD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, bLAKMJNEEJD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ other = (emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ) obj;

      if (getBLAKMJNEEJD()
          != other.getBLAKMJNEEJD()) return false;
      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
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
      hash = (37 * hash) + BLAKMJNEEJD_FIELD_NUMBER;
      hash = (53 * hash) + getBLAKMJNEEJD();
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENE_TAG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ prototype) {
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
     * Name: IOLOAFAFAJJ
     * CmdId: 3079
     * </pre>
     *
     * Protobuf type {@code IOLOAFAFAJJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IOLOAFAFAJJ)
        emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.internal_static_IOLOAFAFAJJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.internal_static_IOLOAFAFAJJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.class, emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.newBuilder()
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
        bLAKMJNEEJD_ = 0;

        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.internal_static_IOLOAFAFAJJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ build() {
        emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ buildPartial() {
        emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ result = new emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ(this);
        int from_bitField0_ = bitField0_;
        result.bLAKMJNEEJD_ = bLAKMJNEEJD_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ) {
          return mergeFrom((emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ other) {
        if (other == emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ.getDefaultInstance()) return this;
        if (other.getBLAKMJNEEJD() != 0) {
          setBLAKMJNEEJD(other.getBLAKMJNEEJD());
        }
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int bLAKMJNEEJD_ ;
      /**
       * <code>uint32 BLAKMJNEEJD = 15;</code>
       * @return The bLAKMJNEEJD.
       */
      @java.lang.Override
      public int getBLAKMJNEEJD() {
        return bLAKMJNEEJD_;
      }
      /**
       * <code>uint32 BLAKMJNEEJD = 15;</code>
       * @param value The bLAKMJNEEJD to set.
       * @return This builder for chaining.
       */
      public Builder setBLAKMJNEEJD(int value) {
        
        bLAKMJNEEJD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BLAKMJNEEJD = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBLAKMJNEEJD() {
        
        bLAKMJNEEJD_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:IOLOAFAFAJJ)
    }

    // @@protoc_insertion_point(class_scope:IOLOAFAFAJJ)
    private static final emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ();
    }

    public static emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IOLOAFAFAJJ>
        PARSER = new com.google.protobuf.AbstractParser<IOLOAFAFAJJ>() {
      @java.lang.Override
      public IOLOAFAFAJJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IOLOAFAFAJJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IOLOAFAFAJJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IOLOAFAFAJJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IOLOAFAFAJJOuterClass.IOLOAFAFAJJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IOLOAFAFAJJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IOLOAFAFAJJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IOLOAFAFAJJ.proto\"=\n\013IOLOAFAFAJJ\022\023\n\013BL" +
      "AKMJNEEJD\030\017 \001(\r\022\031\n\021scene_tag_id_list\030\t \003" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IOLOAFAFAJJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IOLOAFAFAJJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IOLOAFAFAJJ_descriptor,
        new java.lang.String[] { "BLAKMJNEEJD", "SceneTagIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
