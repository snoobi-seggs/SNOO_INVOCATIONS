// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantSubFieldData.proto

package emu.grasscutter.net.proto;

public final class HomePlantSubFieldDataOuterClass {
  private HomePlantSubFieldDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantSubFieldDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantSubFieldData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *NLPMDCHEHPB snooguess swapperoo
     * </pre>
     *
     * <code>uint32 home_gather_id = 2;</code>
     * @return The homeGatherId.
     */
    int getHomeGatherId();

    /**
     * <pre>
     *PDMJFKNGIOL snooguess swapperoo
     * </pre>
     *
     * <code>uint32 seed_id = 4;</code>
     * @return The seedId.
     */
    int getSeedId();

    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <pre>
     *AJKKNJIKCJA FELJLGEOIBB snooswap
     * </pre>
     *
     * <code>.HomePlantFieldStatus field_status = 5;</code>
     * @return The enum numeric value on the wire for fieldStatus.
     */
    int getFieldStatusValue();
    /**
     * <pre>
     *AJKKNJIKCJA FELJLGEOIBB snooswap
     * </pre>
     *
     * <code>.HomePlantFieldStatus field_status = 5;</code>
     * @return The fieldStatus.
     */
    emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus();

    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return A list containing the entityIdList.
     */
    java.util.List<java.lang.Integer> getEntityIdListList();
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return The count of entityIdList.
     */
    int getEntityIdListCount();
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    int getEntityIdList(int index);
  }
  /**
   * <pre>
   * Name: EHHKFDCDNLN
   * </pre>
   *
   * Protobuf type {@code HomePlantSubFieldData}
   */
  public static final class HomePlantSubFieldData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantSubFieldData)
      HomePlantSubFieldDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantSubFieldData.newBuilder() to construct.
    private HomePlantSubFieldData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantSubFieldData() {
      fieldStatus_ = 0;
      entityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantSubFieldData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePlantSubFieldData(
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

              homeGatherId_ = input.readUInt32();
              break;
            }
            case 32: {

              seedId_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              fieldStatus_ = rawValue;
              break;
            }
            case 64: {

              endTime_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              entityIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                entityIdList_.addInt(input.readUInt32());
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
          entityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.class, emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.Builder.class);
    }

    public static final int HOME_GATHER_ID_FIELD_NUMBER = 2;
    private int homeGatherId_;
    /**
     * <pre>
     *NLPMDCHEHPB snooguess swapperoo
     * </pre>
     *
     * <code>uint32 home_gather_id = 2;</code>
     * @return The homeGatherId.
     */
    @java.lang.Override
    public int getHomeGatherId() {
      return homeGatherId_;
    }

    public static final int SEED_ID_FIELD_NUMBER = 4;
    private int seedId_;
    /**
     * <pre>
     *PDMJFKNGIOL snooguess swapperoo
     * </pre>
     *
     * <code>uint32 seed_id = 4;</code>
     * @return The seedId.
     */
    @java.lang.Override
    public int getSeedId() {
      return seedId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 8;
    private int endTime_;
    /**
     * <code>uint32 end_time = 8;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int FIELD_STATUS_FIELD_NUMBER = 5;
    private int fieldStatus_;
    /**
     * <pre>
     *AJKKNJIKCJA FELJLGEOIBB snooswap
     * </pre>
     *
     * <code>.HomePlantFieldStatus field_status = 5;</code>
     * @return The enum numeric value on the wire for fieldStatus.
     */
    @java.lang.Override public int getFieldStatusValue() {
      return fieldStatus_;
    }
    /**
     * <pre>
     *AJKKNJIKCJA FELJLGEOIBB snooswap
     * </pre>
     *
     * <code>.HomePlantFieldStatus field_status = 5;</code>
     * @return The fieldStatus.
     */
    @java.lang.Override public emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus result = emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.valueOf(fieldStatus_);
      return result == null ? emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList entityIdList_;
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return A list containing the entityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityIdListList() {
      return entityIdList_;
    }
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @return The count of entityIdList.
     */
    public int getEntityIdListCount() {
      return entityIdList_.size();
    }
    /**
     * <code>repeated uint32 entity_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    public int getEntityIdList(int index) {
      return entityIdList_.getInt(index);
    }
    private int entityIdListMemoizedSerializedSize = -1;

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
      if (homeGatherId_ != 0) {
        output.writeUInt32(2, homeGatherId_);
      }
      if (seedId_ != 0) {
        output.writeUInt32(4, seedId_);
      }
      if (fieldStatus_ != emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.HOME_PLANT_FIELD_STATUS_STATUE_NONE.getNumber()) {
        output.writeEnum(5, fieldStatus_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(8, endTime_);
      }
      if (getEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(entityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityIdList_.size(); i++) {
        output.writeUInt32NoTag(entityIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (homeGatherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, homeGatherId_);
      }
      if (seedId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, seedId_);
      }
      if (fieldStatus_ != emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.HOME_PLANT_FIELD_STATUS_STATUE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, fieldStatus_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, endTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData other = (emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData) obj;

      if (getHomeGatherId()
          != other.getHomeGatherId()) return false;
      if (getSeedId()
          != other.getSeedId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (fieldStatus_ != other.fieldStatus_) return false;
      if (!getEntityIdListList()
          .equals(other.getEntityIdListList())) return false;
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
      hash = (37 * hash) + HOME_GATHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeGatherId();
      hash = (37 * hash) + SEED_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSeedId();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + FIELD_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + fieldStatus_;
      if (getEntityIdListCount() > 0) {
        hash = (37 * hash) + ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData prototype) {
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
     * Name: EHHKFDCDNLN
     * </pre>
     *
     * Protobuf type {@code HomePlantSubFieldData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantSubFieldData)
        emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.class, emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.newBuilder()
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
        homeGatherId_ = 0;

        seedId_ = 0;

        endTime_ = 0;

        fieldStatus_ = 0;

        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData build() {
        emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData buildPartial() {
        emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData result = new emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData(this);
        int from_bitField0_ = bitField0_;
        result.homeGatherId_ = homeGatherId_;
        result.seedId_ = seedId_;
        result.endTime_ = endTime_;
        result.fieldStatus_ = fieldStatus_;
        if (((bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityIdList_ = entityIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData) {
          return mergeFrom((emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData other) {
        if (other == emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.getDefaultInstance()) return this;
        if (other.getHomeGatherId() != 0) {
          setHomeGatherId(other.getHomeGatherId());
        }
        if (other.getSeedId() != 0) {
          setSeedId(other.getSeedId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.fieldStatus_ != 0) {
          setFieldStatusValue(other.getFieldStatusValue());
        }
        if (!other.entityIdList_.isEmpty()) {
          if (entityIdList_.isEmpty()) {
            entityIdList_ = other.entityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityIdListIsMutable();
            entityIdList_.addAll(other.entityIdList_);
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
        emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int homeGatherId_ ;
      /**
       * <pre>
       *NLPMDCHEHPB snooguess swapperoo
       * </pre>
       *
       * <code>uint32 home_gather_id = 2;</code>
       * @return The homeGatherId.
       */
      @java.lang.Override
      public int getHomeGatherId() {
        return homeGatherId_;
      }
      /**
       * <pre>
       *NLPMDCHEHPB snooguess swapperoo
       * </pre>
       *
       * <code>uint32 home_gather_id = 2;</code>
       * @param value The homeGatherId to set.
       * @return This builder for chaining.
       */
      public Builder setHomeGatherId(int value) {
        
        homeGatherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *NLPMDCHEHPB snooguess swapperoo
       * </pre>
       *
       * <code>uint32 home_gather_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHomeGatherId() {
        
        homeGatherId_ = 0;
        onChanged();
        return this;
      }

      private int seedId_ ;
      /**
       * <pre>
       *PDMJFKNGIOL snooguess swapperoo
       * </pre>
       *
       * <code>uint32 seed_id = 4;</code>
       * @return The seedId.
       */
      @java.lang.Override
      public int getSeedId() {
        return seedId_;
      }
      /**
       * <pre>
       *PDMJFKNGIOL snooguess swapperoo
       * </pre>
       *
       * <code>uint32 seed_id = 4;</code>
       * @param value The seedId to set.
       * @return This builder for chaining.
       */
      public Builder setSeedId(int value) {
        
        seedId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *PDMJFKNGIOL snooguess swapperoo
       * </pre>
       *
       * <code>uint32 seed_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeedId() {
        
        seedId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 8;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int fieldStatus_ = 0;
      /**
       * <pre>
       *AJKKNJIKCJA FELJLGEOIBB snooswap
       * </pre>
       *
       * <code>.HomePlantFieldStatus field_status = 5;</code>
       * @return The enum numeric value on the wire for fieldStatus.
       */
      @java.lang.Override public int getFieldStatusValue() {
        return fieldStatus_;
      }
      /**
       * <pre>
       *AJKKNJIKCJA FELJLGEOIBB snooswap
       * </pre>
       *
       * <code>.HomePlantFieldStatus field_status = 5;</code>
       * @param value The enum numeric value on the wire for fieldStatus to set.
       * @return This builder for chaining.
       */
      public Builder setFieldStatusValue(int value) {
        
        fieldStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *AJKKNJIKCJA FELJLGEOIBB snooswap
       * </pre>
       *
       * <code>.HomePlantFieldStatus field_status = 5;</code>
       * @return The fieldStatus.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus result = emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.valueOf(fieldStatus_);
        return result == null ? emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *AJKKNJIKCJA FELJLGEOIBB snooswap
       * </pre>
       *
       * <code>.HomePlantFieldStatus field_status = 5;</code>
       * @param value The fieldStatus to set.
       * @return This builder for chaining.
       */
      public Builder setFieldStatus(emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        fieldStatus_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *AJKKNJIKCJA FELJLGEOIBB snooswap
       * </pre>
       *
       * <code>.HomePlantFieldStatus field_status = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldStatus() {
        
        fieldStatus_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList entityIdList_ = emptyIntList();
      private void ensureEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityIdList_ = mutableCopy(entityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return A list containing the entityIdList.
       */
      public java.util.List<java.lang.Integer>
          getEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityIdList_) : entityIdList_;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return The count of entityIdList.
       */
      public int getEntityIdListCount() {
        return entityIdList_.size();
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The entityIdList at the given index.
       */
      public int getEntityIdList(int index) {
        return entityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The entityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityIdList(
          int index, int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param value The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityIdList(int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @param values The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityIdList() {
        entityIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HomePlantSubFieldData)
    }

    // @@protoc_insertion_point(class_scope:HomePlantSubFieldData)
    private static final emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData();
    }

    public static emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantSubFieldData>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantSubFieldData>() {
      @java.lang.Override
      public HomePlantSubFieldData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePlantSubFieldData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePlantSubFieldData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantSubFieldData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantSubFieldData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantSubFieldData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomePlantSubFieldData.proto\032\032HomePlant" +
      "FieldStatus.proto\"\227\001\n\025HomePlantSubFieldD" +
      "ata\022\026\n\016home_gather_id\030\002 \001(\r\022\017\n\007seed_id\030\004" +
      " \001(\r\022\020\n\010end_time\030\010 \001(\r\022+\n\014field_status\030\005" +
      " \001(\0162\025.HomePlantFieldStatus\022\026\n\016entity_id" +
      "_list\030\r \003(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.getDescriptor(),
        });
    internal_static_HomePlantSubFieldData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantSubFieldData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantSubFieldData_descriptor,
        new java.lang.String[] { "HomeGatherId", "SeedId", "EndTime", "FieldStatus", "EntityIdList", });
    emu.grasscutter.net.proto.HomePlantFieldStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
