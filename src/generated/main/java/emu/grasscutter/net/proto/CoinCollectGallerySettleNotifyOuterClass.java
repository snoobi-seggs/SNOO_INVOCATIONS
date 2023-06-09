// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectGallerySettleNotify.proto

package emu.grasscutter.net.proto;

public final class CoinCollectGallerySettleNotifyOuterClass {
  private CoinCollectGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 EINKOMCFNDN = 5;</code>
     * @return The eINKOMCFNDN.
     */
    int getEINKOMCFNDN();

    /**
     * <code>uint32 BOFDHHNBNCH = 1;</code>
     * @return The bOFDHHNBNCH.
     */
    int getBOFDHHNBNCH();

    /**
     * <code>uint32 JIEODOEOBID = 8;</code>
     * @return The jIEODOEOBID.
     */
    int getJIEODOEOBID();

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 multistage_play_index = 10;</code>
     * @return The multistagePlayIndex.
     */
    int getMultistagePlayIndex();

    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * Name: FPJJGBEBAAD
   * CmdId: 5533
   * </pre>
   *
   * Protobuf type {@code CoinCollectGallerySettleNotify}
   */
  public static final class CoinCollectGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectGallerySettleNotify)
      CoinCollectGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectGallerySettleNotify.newBuilder() to construct.
    private CoinCollectGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectGallerySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinCollectGallerySettleNotify(
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

              bOFDHHNBNCH_ = input.readUInt32();
              break;
            }
            case 40: {

              eINKOMCFNDN_ = input.readUInt32();
              break;
            }
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 64: {

              jIEODOEOBID_ = input.readUInt32();
              break;
            }
            case 80: {

              multistagePlayIndex_ = input.readUInt32();
              break;
            }
            case 120: {

              isNewRecord_ = input.readBool();
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
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
    }

    public static final int EINKOMCFNDN_FIELD_NUMBER = 5;
    private int eINKOMCFNDN_;
    /**
     * <code>uint32 EINKOMCFNDN = 5;</code>
     * @return The eINKOMCFNDN.
     */
    @java.lang.Override
    public int getEINKOMCFNDN() {
      return eINKOMCFNDN_;
    }

    public static final int BOFDHHNBNCH_FIELD_NUMBER = 1;
    private int bOFDHHNBNCH_;
    /**
     * <code>uint32 BOFDHHNBNCH = 1;</code>
     * @return The bOFDHHNBNCH.
     */
    @java.lang.Override
    public int getBOFDHHNBNCH() {
      return bOFDHHNBNCH_;
    }

    public static final int JIEODOEOBID_FIELD_NUMBER = 8;
    private int jIEODOEOBID_;
    /**
     * <code>uint32 JIEODOEOBID = 8;</code>
     * @return The jIEODOEOBID.
     */
    @java.lang.Override
    public int getJIEODOEOBID() {
      return jIEODOEOBID_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MULTISTAGE_PLAY_INDEX_FIELD_NUMBER = 10;
    private int multistagePlayIndex_;
    /**
     * <code>uint32 multistage_play_index = 10;</code>
     * @return The multistagePlayIndex.
     */
    @java.lang.Override
    public int getMultistagePlayIndex() {
      return multistagePlayIndex_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 15;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (bOFDHHNBNCH_ != 0) {
        output.writeUInt32(1, bOFDHHNBNCH_);
      }
      if (eINKOMCFNDN_ != 0) {
        output.writeUInt32(5, eINKOMCFNDN_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (jIEODOEOBID_ != 0) {
        output.writeUInt32(8, jIEODOEOBID_);
      }
      if (multistagePlayIndex_ != 0) {
        output.writeUInt32(10, multistagePlayIndex_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(15, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bOFDHHNBNCH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, bOFDHHNBNCH_);
      }
      if (eINKOMCFNDN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, eINKOMCFNDN_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (jIEODOEOBID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, jIEODOEOBID_);
      }
      if (multistagePlayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, multistagePlayIndex_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) obj;

      if (getEINKOMCFNDN()
          != other.getEINKOMCFNDN()) return false;
      if (getBOFDHHNBNCH()
          != other.getBOFDHHNBNCH()) return false;
      if (getJIEODOEOBID()
          != other.getJIEODOEOBID()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMultistagePlayIndex()
          != other.getMultistagePlayIndex()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + EINKOMCFNDN_FIELD_NUMBER;
      hash = (53 * hash) + getEINKOMCFNDN();
      hash = (37 * hash) + BOFDHHNBNCH_FIELD_NUMBER;
      hash = (53 * hash) + getBOFDHHNBNCH();
      hash = (37 * hash) + JIEODOEOBID_FIELD_NUMBER;
      hash = (53 * hash) + getJIEODOEOBID();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MULTISTAGE_PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getMultistagePlayIndex();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify prototype) {
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
     * Name: FPJJGBEBAAD
     * CmdId: 5533
     * </pre>
     *
     * Protobuf type {@code CoinCollectGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectGallerySettleNotify)
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.class, emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.newBuilder()
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
        eINKOMCFNDN_ = 0;

        bOFDHHNBNCH_ = 0;

        jIEODOEOBID_ = 0;

        levelId_ = 0;

        multistagePlayIndex_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.internal_static_CoinCollectGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify build() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify buildPartial() {
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify result = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify(this);
        result.eINKOMCFNDN_ = eINKOMCFNDN_;
        result.bOFDHHNBNCH_ = bOFDHHNBNCH_;
        result.jIEODOEOBID_ = jIEODOEOBID_;
        result.levelId_ = levelId_;
        result.multistagePlayIndex_ = multistagePlayIndex_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify other) {
        if (other == emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify.getDefaultInstance()) return this;
        if (other.getEINKOMCFNDN() != 0) {
          setEINKOMCFNDN(other.getEINKOMCFNDN());
        }
        if (other.getBOFDHHNBNCH() != 0) {
          setBOFDHHNBNCH(other.getBOFDHHNBNCH());
        }
        if (other.getJIEODOEOBID() != 0) {
          setJIEODOEOBID(other.getJIEODOEOBID());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMultistagePlayIndex() != 0) {
          setMultistagePlayIndex(other.getMultistagePlayIndex());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int eINKOMCFNDN_ ;
      /**
       * <code>uint32 EINKOMCFNDN = 5;</code>
       * @return The eINKOMCFNDN.
       */
      @java.lang.Override
      public int getEINKOMCFNDN() {
        return eINKOMCFNDN_;
      }
      /**
       * <code>uint32 EINKOMCFNDN = 5;</code>
       * @param value The eINKOMCFNDN to set.
       * @return This builder for chaining.
       */
      public Builder setEINKOMCFNDN(int value) {
        
        eINKOMCFNDN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EINKOMCFNDN = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEINKOMCFNDN() {
        
        eINKOMCFNDN_ = 0;
        onChanged();
        return this;
      }

      private int bOFDHHNBNCH_ ;
      /**
       * <code>uint32 BOFDHHNBNCH = 1;</code>
       * @return The bOFDHHNBNCH.
       */
      @java.lang.Override
      public int getBOFDHHNBNCH() {
        return bOFDHHNBNCH_;
      }
      /**
       * <code>uint32 BOFDHHNBNCH = 1;</code>
       * @param value The bOFDHHNBNCH to set.
       * @return This builder for chaining.
       */
      public Builder setBOFDHHNBNCH(int value) {
        
        bOFDHHNBNCH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BOFDHHNBNCH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBOFDHHNBNCH() {
        
        bOFDHHNBNCH_ = 0;
        onChanged();
        return this;
      }

      private int jIEODOEOBID_ ;
      /**
       * <code>uint32 JIEODOEOBID = 8;</code>
       * @return The jIEODOEOBID.
       */
      @java.lang.Override
      public int getJIEODOEOBID() {
        return jIEODOEOBID_;
      }
      /**
       * <code>uint32 JIEODOEOBID = 8;</code>
       * @param value The jIEODOEOBID to set.
       * @return This builder for chaining.
       */
      public Builder setJIEODOEOBID(int value) {
        
        jIEODOEOBID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JIEODOEOBID = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearJIEODOEOBID() {
        
        jIEODOEOBID_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int multistagePlayIndex_ ;
      /**
       * <code>uint32 multistage_play_index = 10;</code>
       * @return The multistagePlayIndex.
       */
      @java.lang.Override
      public int getMultistagePlayIndex() {
        return multistagePlayIndex_;
      }
      /**
       * <code>uint32 multistage_play_index = 10;</code>
       * @param value The multistagePlayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setMultistagePlayIndex(int value) {
        
        multistagePlayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 multistage_play_index = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMultistagePlayIndex() {
        
        multistagePlayIndex_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 15;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectGallerySettleNotify)
    private static final emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify();
    }

    public static emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectGallerySettleNotify>() {
      @java.lang.Override
      public CoinCollectGallerySettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoinCollectGallerySettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinCollectGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CoinCollectGallerySettleNotifyOuterClass.CoinCollectGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$CoinCollectGallerySettleNotify.proto\"\247" +
      "\001\n\036CoinCollectGallerySettleNotify\022\023\n\013EIN" +
      "KOMCFNDN\030\005 \001(\r\022\023\n\013BOFDHHNBNCH\030\001 \001(\r\022\023\n\013J" +
      "IEODOEOBID\030\010 \001(\r\022\020\n\010level_id\030\007 \001(\r\022\035\n\025mu" +
      "ltistage_play_index\030\n \001(\r\022\025\n\ris_new_reco" +
      "rd\030\017 \001(\010B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectGallerySettleNotify_descriptor,
        new java.lang.String[] { "EINKOMCFNDN", "BOFDHHNBNCH", "JIEODOEOBID", "LevelId", "MultistagePlayIndex", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
