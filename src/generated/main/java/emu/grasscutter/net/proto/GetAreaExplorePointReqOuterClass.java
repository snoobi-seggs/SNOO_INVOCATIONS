// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAreaExplorePointReq.proto

package emu.grasscutter.net.proto;

public final class GetAreaExplorePointReqOuterClass {
  private GetAreaExplorePointReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAreaExplorePointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAreaExplorePointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @return A list containing the areaIdList.
     */
    java.util.List<java.lang.Integer> getAreaIdListList();
    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @return The count of areaIdList.
     */
    int getAreaIdListCount();
    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The areaIdList at the given index.
     */
    int getAreaIdList(int index);
  }
  /**
   * <pre>
   * Name: EPLOBIPMGNK
   * CmdId: 258
   * </pre>
   *
   * Protobuf type {@code GetAreaExplorePointReq}
   */
  public static final class GetAreaExplorePointReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAreaExplorePointReq)
      GetAreaExplorePointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAreaExplorePointReq.newBuilder() to construct.
    private GetAreaExplorePointReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAreaExplorePointReq() {
      areaIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAreaExplorePointReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAreaExplorePointReq(
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
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                areaIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              areaIdList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                areaIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                areaIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          areaIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.internal_static_GetAreaExplorePointReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.internal_static_GetAreaExplorePointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.class, emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.Builder.class);
    }

    public static final int AREA_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList areaIdList_;
    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @return A list containing the areaIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAreaIdListList() {
      return areaIdList_;
    }
    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @return The count of areaIdList.
     */
    public int getAreaIdListCount() {
      return areaIdList_.size();
    }
    /**
     * <code>repeated uint32 area_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The areaIdList at the given index.
     */
    public int getAreaIdList(int index) {
      return areaIdList_.getInt(index);
    }
    private int areaIdListMemoizedSerializedSize = -1;

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
      if (getAreaIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(areaIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < areaIdList_.size(); i++) {
        output.writeUInt32NoTag(areaIdList_.getInt(i));
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
        for (int i = 0; i < areaIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(areaIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAreaIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        areaIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq other = (emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq) obj;

      if (!getAreaIdListList()
          .equals(other.getAreaIdListList())) return false;
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
      if (getAreaIdListCount() > 0) {
        hash = (37 * hash) + AREA_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAreaIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq prototype) {
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
     * Name: EPLOBIPMGNK
     * CmdId: 258
     * </pre>
     *
     * Protobuf type {@code GetAreaExplorePointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAreaExplorePointReq)
        emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.internal_static_GetAreaExplorePointReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.internal_static_GetAreaExplorePointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.class, emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.newBuilder()
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
        areaIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.internal_static_GetAreaExplorePointReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq build() {
        emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq buildPartial() {
        emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq result = new emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          areaIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.areaIdList_ = areaIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq other) {
        if (other == emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq.getDefaultInstance()) return this;
        if (!other.areaIdList_.isEmpty()) {
          if (areaIdList_.isEmpty()) {
            areaIdList_ = other.areaIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAreaIdListIsMutable();
            areaIdList_.addAll(other.areaIdList_);
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
        emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList areaIdList_ = emptyIntList();
      private void ensureAreaIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          areaIdList_ = mutableCopy(areaIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @return A list containing the areaIdList.
       */
      public java.util.List<java.lang.Integer>
          getAreaIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(areaIdList_) : areaIdList_;
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @return The count of areaIdList.
       */
      public int getAreaIdListCount() {
        return areaIdList_.size();
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The areaIdList at the given index.
       */
      public int getAreaIdList(int index) {
        return areaIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The areaIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAreaIdList(
          int index, int value) {
        ensureAreaIdListIsMutable();
        areaIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @param value The areaIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAreaIdList(int value) {
        ensureAreaIdListIsMutable();
        areaIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @param values The areaIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAreaIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAreaIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, areaIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 area_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaIdList() {
        areaIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GetAreaExplorePointReq)
    }

    // @@protoc_insertion_point(class_scope:GetAreaExplorePointReq)
    private static final emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq();
    }

    public static emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAreaExplorePointReq>
        PARSER = new com.google.protobuf.AbstractParser<GetAreaExplorePointReq>() {
      @java.lang.Override
      public GetAreaExplorePointReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAreaExplorePointReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAreaExplorePointReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAreaExplorePointReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAreaExplorePointReqOuterClass.GetAreaExplorePointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAreaExplorePointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAreaExplorePointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetAreaExplorePointReq.proto\".\n\026GetAre" +
      "aExplorePointReq\022\024\n\014area_id_list\030\016 \003(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAreaExplorePointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAreaExplorePointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAreaExplorePointReq_descriptor,
        new java.lang.String[] { "AreaIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
