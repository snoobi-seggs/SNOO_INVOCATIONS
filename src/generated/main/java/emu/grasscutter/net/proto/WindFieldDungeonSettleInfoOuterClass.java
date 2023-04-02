// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class WindFieldDungeonSettleInfoOuterClass {
  private WindFieldDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    int getFailReasonValue();
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
     * @return The failReason.
     */
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason();

    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @return A list containing the oCAANIJGLBH.
     */
    java.util.List<java.lang.Integer> getOCAANIJGLBHList();
    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @return The count of oCAANIJGLBH.
     */
    int getOCAANIJGLBHCount();
    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @param index The index of the element to return.
     * @return The oCAANIJGLBH at the given index.
     */
    int getOCAANIJGLBH(int index);

    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @return A list containing the mFIDCJGMDKF.
     */
    java.util.List<java.lang.Integer> getMFIDCJGMDKFList();
    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @return The count of mFIDCJGMDKF.
     */
    int getMFIDCJGMDKFCount();
    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @param index The index of the element to return.
     * @return The mFIDCJGMDKF at the given index.
     */
    int getMFIDCJGMDKF(int index);
  }
  /**
   * <pre>
   * Name: DKPIGJECCHK
   * </pre>
   *
   * Protobuf type {@code WindFieldDungeonSettleInfo}
   */
  public static final class WindFieldDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDungeonSettleInfo)
      WindFieldDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDungeonSettleInfo.newBuilder() to construct.
    private WindFieldDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDungeonSettleInfo() {
      failReason_ = 0;
      oCAANIJGLBH_ = emptyIntList();
      mFIDCJGMDKF_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDungeonSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldDungeonSettleInfo(
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
            case 24: {
              int rawValue = input.readEnum();

              failReason_ = rawValue;
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                mFIDCJGMDKF_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              mFIDCJGMDKF_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                mFIDCJGMDKF_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                mFIDCJGMDKF_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oCAANIJGLBH_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              oCAANIJGLBH_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                oCAANIJGLBH_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                oCAANIJGLBH_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          mFIDCJGMDKF_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          oCAANIJGLBH_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
    }

    public static final int FAIL_REASON_FIELD_NUMBER = 3;
    private int failReason_;
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    @java.lang.Override public int getFailReasonValue() {
      return failReason_;
    }
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
     * @return The failReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
      return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
    }

    public static final int OCAANIJGLBH_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList oCAANIJGLBH_;
    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @return A list containing the oCAANIJGLBH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOCAANIJGLBHList() {
      return oCAANIJGLBH_;
    }
    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @return The count of oCAANIJGLBH.
     */
    public int getOCAANIJGLBHCount() {
      return oCAANIJGLBH_.size();
    }
    /**
     * <code>repeated uint32 OCAANIJGLBH = 6;</code>
     * @param index The index of the element to return.
     * @return The oCAANIJGLBH at the given index.
     */
    public int getOCAANIJGLBH(int index) {
      return oCAANIJGLBH_.getInt(index);
    }
    private int oCAANIJGLBHMemoizedSerializedSize = -1;

    public static final int MFIDCJGMDKF_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList mFIDCJGMDKF_;
    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @return A list containing the mFIDCJGMDKF.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMFIDCJGMDKFList() {
      return mFIDCJGMDKF_;
    }
    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @return The count of mFIDCJGMDKF.
     */
    public int getMFIDCJGMDKFCount() {
      return mFIDCJGMDKF_.size();
    }
    /**
     * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
     * @param index The index of the element to return.
     * @return The mFIDCJGMDKF at the given index.
     */
    public int getMFIDCJGMDKF(int index) {
      return mFIDCJGMDKF_.getInt(index);
    }
    private int mFIDCJGMDKFMemoizedSerializedSize = -1;

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
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        output.writeEnum(3, failReason_);
      }
      if (getMFIDCJGMDKFList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(mFIDCJGMDKFMemoizedSerializedSize);
      }
      for (int i = 0; i < mFIDCJGMDKF_.size(); i++) {
        output.writeUInt32NoTag(mFIDCJGMDKF_.getInt(i));
      }
      if (getOCAANIJGLBHList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(oCAANIJGLBHMemoizedSerializedSize);
      }
      for (int i = 0; i < oCAANIJGLBH_.size(); i++) {
        output.writeUInt32NoTag(oCAANIJGLBH_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, failReason_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mFIDCJGMDKF_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mFIDCJGMDKF_.getInt(i));
        }
        size += dataSize;
        if (!getMFIDCJGMDKFList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mFIDCJGMDKFMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < oCAANIJGLBH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(oCAANIJGLBH_.getInt(i));
        }
        size += dataSize;
        if (!getOCAANIJGLBHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        oCAANIJGLBHMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) obj;

      if (failReason_ != other.failReason_) return false;
      if (!getOCAANIJGLBHList()
          .equals(other.getOCAANIJGLBHList())) return false;
      if (!getMFIDCJGMDKFList()
          .equals(other.getMFIDCJGMDKFList())) return false;
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
      hash = (37 * hash) + FAIL_REASON_FIELD_NUMBER;
      hash = (53 * hash) + failReason_;
      if (getOCAANIJGLBHCount() > 0) {
        hash = (37 * hash) + OCAANIJGLBH_FIELD_NUMBER;
        hash = (53 * hash) + getOCAANIJGLBHList().hashCode();
      }
      if (getMFIDCJGMDKFCount() > 0) {
        hash = (37 * hash) + MFIDCJGMDKF_FIELD_NUMBER;
        hash = (53 * hash) + getMFIDCJGMDKFList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo prototype) {
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
     * Name: DKPIGJECCHK
     * </pre>
     *
     * Protobuf type {@code WindFieldDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDungeonSettleInfo)
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.newBuilder()
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
        failReason_ = 0;

        oCAANIJGLBH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        mFIDCJGMDKF_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo build() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo(this);
        int from_bitField0_ = bitField0_;
        result.failReason_ = failReason_;
        if (((bitField0_ & 0x00000001) != 0)) {
          oCAANIJGLBH_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oCAANIJGLBH_ = oCAANIJGLBH_;
        if (((bitField0_ & 0x00000002) != 0)) {
          mFIDCJGMDKF_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mFIDCJGMDKF_ = mFIDCJGMDKF_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance()) return this;
        if (other.failReason_ != 0) {
          setFailReasonValue(other.getFailReasonValue());
        }
        if (!other.oCAANIJGLBH_.isEmpty()) {
          if (oCAANIJGLBH_.isEmpty()) {
            oCAANIJGLBH_ = other.oCAANIJGLBH_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOCAANIJGLBHIsMutable();
            oCAANIJGLBH_.addAll(other.oCAANIJGLBH_);
          }
          onChanged();
        }
        if (!other.mFIDCJGMDKF_.isEmpty()) {
          if (mFIDCJGMDKF_.isEmpty()) {
            mFIDCJGMDKF_ = other.mFIDCJGMDKF_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMFIDCJGMDKFIsMutable();
            mFIDCJGMDKF_.addAll(other.mFIDCJGMDKF_);
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
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int failReason_ = 0;
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
       * @return The enum numeric value on the wire for failReason.
       */
      @java.lang.Override public int getFailReasonValue() {
        return failReason_;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
       * @param value The enum numeric value on the wire for failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReasonValue(int value) {
        
        failReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
       * @return The failReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
        return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
       * @param value The failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReason(emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        failReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailReason() {
        
        failReason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList oCAANIJGLBH_ = emptyIntList();
      private void ensureOCAANIJGLBHIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oCAANIJGLBH_ = mutableCopy(oCAANIJGLBH_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @return A list containing the oCAANIJGLBH.
       */
      public java.util.List<java.lang.Integer>
          getOCAANIJGLBHList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(oCAANIJGLBH_) : oCAANIJGLBH_;
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @return The count of oCAANIJGLBH.
       */
      public int getOCAANIJGLBHCount() {
        return oCAANIJGLBH_.size();
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @param index The index of the element to return.
       * @return The oCAANIJGLBH at the given index.
       */
      public int getOCAANIJGLBH(int index) {
        return oCAANIJGLBH_.getInt(index);
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @param index The index to set the value at.
       * @param value The oCAANIJGLBH to set.
       * @return This builder for chaining.
       */
      public Builder setOCAANIJGLBH(
          int index, int value) {
        ensureOCAANIJGLBHIsMutable();
        oCAANIJGLBH_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @param value The oCAANIJGLBH to add.
       * @return This builder for chaining.
       */
      public Builder addOCAANIJGLBH(int value) {
        ensureOCAANIJGLBHIsMutable();
        oCAANIJGLBH_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @param values The oCAANIJGLBH to add.
       * @return This builder for chaining.
       */
      public Builder addAllOCAANIJGLBH(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOCAANIJGLBHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oCAANIJGLBH_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OCAANIJGLBH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOCAANIJGLBH() {
        oCAANIJGLBH_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList mFIDCJGMDKF_ = emptyIntList();
      private void ensureMFIDCJGMDKFIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mFIDCJGMDKF_ = mutableCopy(mFIDCJGMDKF_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @return A list containing the mFIDCJGMDKF.
       */
      public java.util.List<java.lang.Integer>
          getMFIDCJGMDKFList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(mFIDCJGMDKF_) : mFIDCJGMDKF_;
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @return The count of mFIDCJGMDKF.
       */
      public int getMFIDCJGMDKFCount() {
        return mFIDCJGMDKF_.size();
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @param index The index of the element to return.
       * @return The mFIDCJGMDKF at the given index.
       */
      public int getMFIDCJGMDKF(int index) {
        return mFIDCJGMDKF_.getInt(index);
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @param index The index to set the value at.
       * @param value The mFIDCJGMDKF to set.
       * @return This builder for chaining.
       */
      public Builder setMFIDCJGMDKF(
          int index, int value) {
        ensureMFIDCJGMDKFIsMutable();
        mFIDCJGMDKF_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @param value The mFIDCJGMDKF to add.
       * @return This builder for chaining.
       */
      public Builder addMFIDCJGMDKF(int value) {
        ensureMFIDCJGMDKFIsMutable();
        mFIDCJGMDKF_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @param values The mFIDCJGMDKF to add.
       * @return This builder for chaining.
       */
      public Builder addAllMFIDCJGMDKF(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMFIDCJGMDKFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mFIDCJGMDKF_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MFIDCJGMDKF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMFIDCJGMDKF() {
        mFIDCJGMDKF_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:WindFieldDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDungeonSettleInfo>() {
      @java.lang.Override
      public WindFieldDungeonSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldDungeonSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldDungeonSettleInfo.proto\032 Wind" +
      "FieldDungeonFailReason.proto\"x\n\032WindFiel" +
      "dDungeonSettleInfo\0220\n\013fail_reason\030\003 \001(\0162" +
      "\033.WindFieldDungeonFailReason\022\023\n\013OCAANIJG" +
      "LBH\030\006 \003(\r\022\023\n\013MFIDCJGMDKF\030\004 \003(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDungeonSettleInfo_descriptor,
        new java.lang.String[] { "FailReason", "OCAANIJGLBH", "MFIDCJGMDKF", });
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
