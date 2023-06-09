// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LIKPGKGOHGB.proto

package emu.grasscutter.net.proto;

public final class LIKPGKGOHGBOuterClass {
  private LIKPGKGOHGBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LIKPGKGOHGBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LIKPGKGOHGB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 5;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 finish_time = 15;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>uint32 gallery_id = 4;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 LEDKDCJIDNE = 6;</code>
     * @return The lEDKDCJIDNE.
     */
    int getLEDKDCJIDNE();

    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool BMPCEOKKBEA = 7;</code>
     * @return The bMPCEOKKBEA.
     */
    boolean getBMPCEOKKBEA();
  }
  /**
   * <pre>
   * Name: LIKPGKGOHGB
   * CmdId: 20042
   * </pre>
   *
   * Protobuf type {@code LIKPGKGOHGB}
   */
  public static final class LIKPGKGOHGB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LIKPGKGOHGB)
      LIKPGKGOHGBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LIKPGKGOHGB.newBuilder() to construct.
    private LIKPGKGOHGB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LIKPGKGOHGB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LIKPGKGOHGB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LIKPGKGOHGB(
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
            case 32: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 40: {

              stageId_ = input.readUInt32();
              break;
            }
            case 48: {

              lEDKDCJIDNE_ = input.readUInt32();
              break;
            }
            case 56: {

              bMPCEOKKBEA_ = input.readBool();
              break;
            }
            case 88: {

              isSucc_ = input.readBool();
              break;
            }
            case 104: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 120: {

              finishTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.internal_static_LIKPGKGOHGB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.internal_static_LIKPGKGOHGB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.class, emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 5;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 5;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 15;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 15;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 4;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 4;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int LEDKDCJIDNE_FIELD_NUMBER = 6;
    private int lEDKDCJIDNE_;
    /**
     * <code>uint32 LEDKDCJIDNE = 6;</code>
     * @return The lEDKDCJIDNE.
     */
    @java.lang.Override
    public int getLEDKDCJIDNE() {
      return lEDKDCJIDNE_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 11;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 13;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int BMPCEOKKBEA_FIELD_NUMBER = 7;
    private boolean bMPCEOKKBEA_;
    /**
     * <code>bool BMPCEOKKBEA = 7;</code>
     * @return The bMPCEOKKBEA.
     */
    @java.lang.Override
    public boolean getBMPCEOKKBEA() {
      return bMPCEOKKBEA_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(4, galleryId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(5, stageId_);
      }
      if (lEDKDCJIDNE_ != 0) {
        output.writeUInt32(6, lEDKDCJIDNE_);
      }
      if (bMPCEOKKBEA_ != false) {
        output.writeBool(7, bMPCEOKKBEA_);
      }
      if (isSucc_ != false) {
        output.writeBool(11, isSucc_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(13, isNewRecord_);
      }
      if (finishTime_ != 0) {
        output.writeUInt32(15, finishTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, galleryId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, stageId_);
      }
      if (lEDKDCJIDNE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lEDKDCJIDNE_);
      }
      if (bMPCEOKKBEA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, bMPCEOKKBEA_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isSucc_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isNewRecord_);
      }
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, finishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB other = (emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getLEDKDCJIDNE()
          != other.getLEDKDCJIDNE()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getBMPCEOKKBEA()
          != other.getBMPCEOKKBEA()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + LEDKDCJIDNE_FIELD_NUMBER;
      hash = (53 * hash) + getLEDKDCJIDNE();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + BMPCEOKKBEA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBMPCEOKKBEA());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB prototype) {
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
     * Name: LIKPGKGOHGB
     * CmdId: 20042
     * </pre>
     *
     * Protobuf type {@code LIKPGKGOHGB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LIKPGKGOHGB)
        emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.internal_static_LIKPGKGOHGB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.internal_static_LIKPGKGOHGB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.class, emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.newBuilder()
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
        stageId_ = 0;

        finishTime_ = 0;

        galleryId_ = 0;

        lEDKDCJIDNE_ = 0;

        isSucc_ = false;

        isNewRecord_ = false;

        bMPCEOKKBEA_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.internal_static_LIKPGKGOHGB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB build() {
        emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB buildPartial() {
        emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB result = new emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB(this);
        result.stageId_ = stageId_;
        result.finishTime_ = finishTime_;
        result.galleryId_ = galleryId_;
        result.lEDKDCJIDNE_ = lEDKDCJIDNE_;
        result.isSucc_ = isSucc_;
        result.isNewRecord_ = isNewRecord_;
        result.bMPCEOKKBEA_ = bMPCEOKKBEA_;
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
        if (other instanceof emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB) {
          return mergeFrom((emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB other) {
        if (other == emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getLEDKDCJIDNE() != 0) {
          setLEDKDCJIDNE(other.getLEDKDCJIDNE());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getBMPCEOKKBEA() != false) {
          setBMPCEOKKBEA(other.getBMPCEOKKBEA());
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
        emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 5;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 5;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 15;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 15;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 4;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 4;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int lEDKDCJIDNE_ ;
      /**
       * <code>uint32 LEDKDCJIDNE = 6;</code>
       * @return The lEDKDCJIDNE.
       */
      @java.lang.Override
      public int getLEDKDCJIDNE() {
        return lEDKDCJIDNE_;
      }
      /**
       * <code>uint32 LEDKDCJIDNE = 6;</code>
       * @param value The lEDKDCJIDNE to set.
       * @return This builder for chaining.
       */
      public Builder setLEDKDCJIDNE(int value) {
        
        lEDKDCJIDNE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LEDKDCJIDNE = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLEDKDCJIDNE() {
        
        lEDKDCJIDNE_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 11;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 13;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean bMPCEOKKBEA_ ;
      /**
       * <code>bool BMPCEOKKBEA = 7;</code>
       * @return The bMPCEOKKBEA.
       */
      @java.lang.Override
      public boolean getBMPCEOKKBEA() {
        return bMPCEOKKBEA_;
      }
      /**
       * <code>bool BMPCEOKKBEA = 7;</code>
       * @param value The bMPCEOKKBEA to set.
       * @return This builder for chaining.
       */
      public Builder setBMPCEOKKBEA(boolean value) {
        
        bMPCEOKKBEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool BMPCEOKKBEA = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBMPCEOKKBEA() {
        
        bMPCEOKKBEA_ = false;
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


      // @@protoc_insertion_point(builder_scope:LIKPGKGOHGB)
    }

    // @@protoc_insertion_point(class_scope:LIKPGKGOHGB)
    private static final emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB();
    }

    public static emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LIKPGKGOHGB>
        PARSER = new com.google.protobuf.AbstractParser<LIKPGKGOHGB>() {
      @java.lang.Override
      public LIKPGKGOHGB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LIKPGKGOHGB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LIKPGKGOHGB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LIKPGKGOHGB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LIKPGKGOHGBOuterClass.LIKPGKGOHGB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LIKPGKGOHGB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LIKPGKGOHGB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LIKPGKGOHGB.proto\"\232\001\n\013LIKPGKGOHGB\022\020\n\010s" +
      "tage_id\030\005 \001(\r\022\023\n\013finish_time\030\017 \001(\r\022\022\n\nga" +
      "llery_id\030\004 \001(\r\022\023\n\013LEDKDCJIDNE\030\006 \001(\r\022\017\n\007i" +
      "s_succ\030\013 \001(\010\022\025\n\ris_new_record\030\r \001(\010\022\023\n\013B" +
      "MPCEOKKBEA\030\007 \001(\010B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LIKPGKGOHGB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LIKPGKGOHGB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LIKPGKGOHGB_descriptor,
        new java.lang.String[] { "StageId", "FinishTime", "GalleryId", "LEDKDCJIDNE", "IsSucc", "IsNewRecord", "BMPCEOKKBEA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
