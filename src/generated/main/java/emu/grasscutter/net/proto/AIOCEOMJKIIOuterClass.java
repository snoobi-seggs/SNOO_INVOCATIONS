// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AIOCEOMJKII.proto

package emu.grasscutter.net.proto;

public final class AIOCEOMJKIIOuterClass {
  private AIOCEOMJKIIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AIOCEOMJKIIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AIOCEOMJKII)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @return A list containing the oIIEOJDNKJG.
     */
    java.util.List<java.lang.Integer> getOIIEOJDNKJGList();
    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @return The count of oIIEOJDNKJG.
     */
    int getOIIEOJDNKJGCount();
    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @param index The index of the element to return.
     * @return The oIIEOJDNKJG at the given index.
     */
    int getOIIEOJDNKJG(int index);

    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getKHFBDFLDPKMList();
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getKHFBDFLDPKM(int index);
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    int getKHFBDFLDPKMCount();
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getKHFBDFLDPKMOrBuilderList();
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getKHFBDFLDPKMOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: AIOCEOMJKII
   * </pre>
   *
   * Protobuf type {@code AIOCEOMJKII}
   */
  public static final class AIOCEOMJKII extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AIOCEOMJKII)
      AIOCEOMJKIIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AIOCEOMJKII.newBuilder() to construct.
    private AIOCEOMJKII(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AIOCEOMJKII() {
      oIIEOJDNKJG_ = emptyIntList();
      kHFBDFLDPKM_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AIOCEOMJKII();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AIOCEOMJKII(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                kHFBDFLDPKM_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000002;
              }
              kHFBDFLDPKM_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                oIIEOJDNKJG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              oIIEOJDNKJG_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                oIIEOJDNKJG_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                oIIEOJDNKJG_.addInt(input.readUInt32());
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
          kHFBDFLDPKM_ = java.util.Collections.unmodifiableList(kHFBDFLDPKM_);
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          oIIEOJDNKJG_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.internal_static_AIOCEOMJKII_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.internal_static_AIOCEOMJKII_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.class, emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.Builder.class);
    }

    public static final int OIIEOJDNKJG_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList oIIEOJDNKJG_;
    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @return A list containing the oIIEOJDNKJG.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOIIEOJDNKJGList() {
      return oIIEOJDNKJG_;
    }
    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @return The count of oIIEOJDNKJG.
     */
    public int getOIIEOJDNKJGCount() {
      return oIIEOJDNKJG_.size();
    }
    /**
     * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
     * @param index The index of the element to return.
     * @return The oIIEOJDNKJG at the given index.
     */
    public int getOIIEOJDNKJG(int index) {
      return oIIEOJDNKJG_.getInt(index);
    }
    private int oIIEOJDNKJGMemoizedSerializedSize = -1;

    public static final int KHFBDFLDPKM_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> kHFBDFLDPKM_;
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getKHFBDFLDPKMList() {
      return kHFBDFLDPKM_;
    }
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getKHFBDFLDPKMOrBuilderList() {
      return kHFBDFLDPKM_;
    }
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    @java.lang.Override
    public int getKHFBDFLDPKMCount() {
      return kHFBDFLDPKM_.size();
    }
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getKHFBDFLDPKM(int index) {
      return kHFBDFLDPKM_.get(index);
    }
    /**
     * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getKHFBDFLDPKMOrBuilder(
        int index) {
      return kHFBDFLDPKM_.get(index);
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
      getSerializedSize();
      for (int i = 0; i < kHFBDFLDPKM_.size(); i++) {
        output.writeMessage(4, kHFBDFLDPKM_.get(i));
      }
      if (getOIIEOJDNKJGList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(oIIEOJDNKJGMemoizedSerializedSize);
      }
      for (int i = 0; i < oIIEOJDNKJG_.size(); i++) {
        output.writeUInt32NoTag(oIIEOJDNKJG_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < kHFBDFLDPKM_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, kHFBDFLDPKM_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < oIIEOJDNKJG_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(oIIEOJDNKJG_.getInt(i));
        }
        size += dataSize;
        if (!getOIIEOJDNKJGList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        oIIEOJDNKJGMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII other = (emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII) obj;

      if (!getOIIEOJDNKJGList()
          .equals(other.getOIIEOJDNKJGList())) return false;
      if (!getKHFBDFLDPKMList()
          .equals(other.getKHFBDFLDPKMList())) return false;
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
      if (getOIIEOJDNKJGCount() > 0) {
        hash = (37 * hash) + OIIEOJDNKJG_FIELD_NUMBER;
        hash = (53 * hash) + getOIIEOJDNKJGList().hashCode();
      }
      if (getKHFBDFLDPKMCount() > 0) {
        hash = (37 * hash) + KHFBDFLDPKM_FIELD_NUMBER;
        hash = (53 * hash) + getKHFBDFLDPKMList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII prototype) {
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
     * Name: AIOCEOMJKII
     * </pre>
     *
     * Protobuf type {@code AIOCEOMJKII}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AIOCEOMJKII)
        emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKIIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.internal_static_AIOCEOMJKII_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.internal_static_AIOCEOMJKII_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.class, emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.newBuilder()
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
          getKHFBDFLDPKMFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oIIEOJDNKJG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (kHFBDFLDPKMBuilder_ == null) {
          kHFBDFLDPKM_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          kHFBDFLDPKMBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.internal_static_AIOCEOMJKII_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII build() {
        emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII buildPartial() {
        emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII result = new emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          oIIEOJDNKJG_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oIIEOJDNKJG_ = oIIEOJDNKJG_;
        if (kHFBDFLDPKMBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            kHFBDFLDPKM_ = java.util.Collections.unmodifiableList(kHFBDFLDPKM_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.kHFBDFLDPKM_ = kHFBDFLDPKM_;
        } else {
          result.kHFBDFLDPKM_ = kHFBDFLDPKMBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII) {
          return mergeFrom((emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII other) {
        if (other == emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII.getDefaultInstance()) return this;
        if (!other.oIIEOJDNKJG_.isEmpty()) {
          if (oIIEOJDNKJG_.isEmpty()) {
            oIIEOJDNKJG_ = other.oIIEOJDNKJG_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOIIEOJDNKJGIsMutable();
            oIIEOJDNKJG_.addAll(other.oIIEOJDNKJG_);
          }
          onChanged();
        }
        if (kHFBDFLDPKMBuilder_ == null) {
          if (!other.kHFBDFLDPKM_.isEmpty()) {
            if (kHFBDFLDPKM_.isEmpty()) {
              kHFBDFLDPKM_ = other.kHFBDFLDPKM_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureKHFBDFLDPKMIsMutable();
              kHFBDFLDPKM_.addAll(other.kHFBDFLDPKM_);
            }
            onChanged();
          }
        } else {
          if (!other.kHFBDFLDPKM_.isEmpty()) {
            if (kHFBDFLDPKMBuilder_.isEmpty()) {
              kHFBDFLDPKMBuilder_.dispose();
              kHFBDFLDPKMBuilder_ = null;
              kHFBDFLDPKM_ = other.kHFBDFLDPKM_;
              bitField0_ = (bitField0_ & ~0x00000002);
              kHFBDFLDPKMBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getKHFBDFLDPKMFieldBuilder() : null;
            } else {
              kHFBDFLDPKMBuilder_.addAllMessages(other.kHFBDFLDPKM_);
            }
          }
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
        emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList oIIEOJDNKJG_ = emptyIntList();
      private void ensureOIIEOJDNKJGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oIIEOJDNKJG_ = mutableCopy(oIIEOJDNKJG_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @return A list containing the oIIEOJDNKJG.
       */
      public java.util.List<java.lang.Integer>
          getOIIEOJDNKJGList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(oIIEOJDNKJG_) : oIIEOJDNKJG_;
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @return The count of oIIEOJDNKJG.
       */
      public int getOIIEOJDNKJGCount() {
        return oIIEOJDNKJG_.size();
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @param index The index of the element to return.
       * @return The oIIEOJDNKJG at the given index.
       */
      public int getOIIEOJDNKJG(int index) {
        return oIIEOJDNKJG_.getInt(index);
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @param index The index to set the value at.
       * @param value The oIIEOJDNKJG to set.
       * @return This builder for chaining.
       */
      public Builder setOIIEOJDNKJG(
          int index, int value) {
        ensureOIIEOJDNKJGIsMutable();
        oIIEOJDNKJG_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @param value The oIIEOJDNKJG to add.
       * @return This builder for chaining.
       */
      public Builder addOIIEOJDNKJG(int value) {
        ensureOIIEOJDNKJGIsMutable();
        oIIEOJDNKJG_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @param values The oIIEOJDNKJG to add.
       * @return This builder for chaining.
       */
      public Builder addAllOIIEOJDNKJG(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOIIEOJDNKJGIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oIIEOJDNKJG_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OIIEOJDNKJG = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOIIEOJDNKJG() {
        oIIEOJDNKJG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> kHFBDFLDPKM_ =
        java.util.Collections.emptyList();
      private void ensureKHFBDFLDPKMIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          kHFBDFLDPKM_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(kHFBDFLDPKM_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> kHFBDFLDPKMBuilder_;

      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getKHFBDFLDPKMList() {
        if (kHFBDFLDPKMBuilder_ == null) {
          return java.util.Collections.unmodifiableList(kHFBDFLDPKM_);
        } else {
          return kHFBDFLDPKMBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public int getKHFBDFLDPKMCount() {
        if (kHFBDFLDPKMBuilder_ == null) {
          return kHFBDFLDPKM_.size();
        } else {
          return kHFBDFLDPKMBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getKHFBDFLDPKM(int index) {
        if (kHFBDFLDPKMBuilder_ == null) {
          return kHFBDFLDPKM_.get(index);
        } else {
          return kHFBDFLDPKMBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder setKHFBDFLDPKM(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (kHFBDFLDPKMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.set(index, value);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder setKHFBDFLDPKM(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (kHFBDFLDPKMBuilder_ == null) {
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.set(index, builderForValue.build());
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder addKHFBDFLDPKM(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (kHFBDFLDPKMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.add(value);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder addKHFBDFLDPKM(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (kHFBDFLDPKMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.add(index, value);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder addKHFBDFLDPKM(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (kHFBDFLDPKMBuilder_ == null) {
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.add(builderForValue.build());
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder addKHFBDFLDPKM(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (kHFBDFLDPKMBuilder_ == null) {
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.add(index, builderForValue.build());
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder addAllKHFBDFLDPKM(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (kHFBDFLDPKMBuilder_ == null) {
          ensureKHFBDFLDPKMIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, kHFBDFLDPKM_);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder clearKHFBDFLDPKM() {
        if (kHFBDFLDPKMBuilder_ == null) {
          kHFBDFLDPKM_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public Builder removeKHFBDFLDPKM(int index) {
        if (kHFBDFLDPKMBuilder_ == null) {
          ensureKHFBDFLDPKMIsMutable();
          kHFBDFLDPKM_.remove(index);
          onChanged();
        } else {
          kHFBDFLDPKMBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getKHFBDFLDPKMBuilder(
          int index) {
        return getKHFBDFLDPKMFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getKHFBDFLDPKMOrBuilder(
          int index) {
        if (kHFBDFLDPKMBuilder_ == null) {
          return kHFBDFLDPKM_.get(index);  } else {
          return kHFBDFLDPKMBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getKHFBDFLDPKMOrBuilderList() {
        if (kHFBDFLDPKMBuilder_ != null) {
          return kHFBDFLDPKMBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(kHFBDFLDPKM_);
        }
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addKHFBDFLDPKMBuilder() {
        return getKHFBDFLDPKMFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addKHFBDFLDPKMBuilder(
          int index) {
        return getKHFBDFLDPKMFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam KHFBDFLDPKM = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getKHFBDFLDPKMBuilderList() {
        return getKHFBDFLDPKMFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getKHFBDFLDPKMFieldBuilder() {
        if (kHFBDFLDPKMBuilder_ == null) {
          kHFBDFLDPKMBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  kHFBDFLDPKM_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          kHFBDFLDPKM_ = null;
        }
        return kHFBDFLDPKMBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AIOCEOMJKII)
    }

    // @@protoc_insertion_point(class_scope:AIOCEOMJKII)
    private static final emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII();
    }

    public static emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AIOCEOMJKII>
        PARSER = new com.google.protobuf.AbstractParser<AIOCEOMJKII>() {
      @java.lang.Override
      public AIOCEOMJKII parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AIOCEOMJKII(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AIOCEOMJKII> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AIOCEOMJKII> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AIOCEOMJKIIOuterClass.AIOCEOMJKII getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AIOCEOMJKII_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AIOCEOMJKII_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AIOCEOMJKII.proto\032\017ItemParam.proto\"C\n\013" +
      "AIOCEOMJKII\022\023\n\013OIIEOJDNKJG\030\013 \003(\r\022\037\n\013KHFB" +
      "DFLDPKM\030\004 \003(\0132\n.ItemParamB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_AIOCEOMJKII_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AIOCEOMJKII_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AIOCEOMJKII_descriptor,
        new java.lang.String[] { "OIIEOJDNKJG", "KHFBDFLDPKM", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
