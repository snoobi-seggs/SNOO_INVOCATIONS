// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2SettleInfo.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2SettleInfoOuterClass {
  private EffigyChallengeV2SettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2SettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2SettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_mode_difficulty = 7;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>uint32 GBBHFOMPFCF = 8;</code>
     * @return The gBBHFOMPFCF.
     */
    int getGBBHFOMPFCF();

    /**
     * <code>bool PADHFINHGPK = 2;</code>
     * @return The pADHFINHGPK.
     */
    boolean getPADHFINHGPK();

    /**
     * <code>uint32 LHKLBOBEICJ = 13;</code>
     * @return The lHKLBOBEICJ.
     */
    int getLHKLBOBEICJ();

    /**
     * <code>uint32 FPBLABLPOPO = 14;</code>
     * @return The fPBLABLPOPO.
     */
    int getFPBLABLPOPO();

    /**
     * <code>bool NFFENFICGFF = 4;</code>
     * @return The nFFENFICGFF.
     */
    boolean getNFFENFICGFF();
  }
  /**
   * <pre>
   * Name: FCDJFEIIFCP
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2SettleInfo}
   */
  public static final class EffigyChallengeV2SettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2SettleInfo)
      EffigyChallengeV2SettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2SettleInfo.newBuilder() to construct.
    private EffigyChallengeV2SettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2SettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2SettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeV2SettleInfo(
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
            case 16: {

              pADHFINHGPK_ = input.readBool();
              break;
            }
            case 32: {

              nFFENFICGFF_ = input.readBool();
              break;
            }
            case 56: {

              challengeModeDifficulty_ = input.readUInt32();
              break;
            }
            case 64: {

              gBBHFOMPFCF_ = input.readUInt32();
              break;
            }
            case 104: {

              lHKLBOBEICJ_ = input.readUInt32();
              break;
            }
            case 112: {

              fPBLABLPOPO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.class, emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.Builder.class);
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 7;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 7;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int GBBHFOMPFCF_FIELD_NUMBER = 8;
    private int gBBHFOMPFCF_;
    /**
     * <code>uint32 GBBHFOMPFCF = 8;</code>
     * @return The gBBHFOMPFCF.
     */
    @java.lang.Override
    public int getGBBHFOMPFCF() {
      return gBBHFOMPFCF_;
    }

    public static final int PADHFINHGPK_FIELD_NUMBER = 2;
    private boolean pADHFINHGPK_;
    /**
     * <code>bool PADHFINHGPK = 2;</code>
     * @return The pADHFINHGPK.
     */
    @java.lang.Override
    public boolean getPADHFINHGPK() {
      return pADHFINHGPK_;
    }

    public static final int LHKLBOBEICJ_FIELD_NUMBER = 13;
    private int lHKLBOBEICJ_;
    /**
     * <code>uint32 LHKLBOBEICJ = 13;</code>
     * @return The lHKLBOBEICJ.
     */
    @java.lang.Override
    public int getLHKLBOBEICJ() {
      return lHKLBOBEICJ_;
    }

    public static final int FPBLABLPOPO_FIELD_NUMBER = 14;
    private int fPBLABLPOPO_;
    /**
     * <code>uint32 FPBLABLPOPO = 14;</code>
     * @return The fPBLABLPOPO.
     */
    @java.lang.Override
    public int getFPBLABLPOPO() {
      return fPBLABLPOPO_;
    }

    public static final int NFFENFICGFF_FIELD_NUMBER = 4;
    private boolean nFFENFICGFF_;
    /**
     * <code>bool NFFENFICGFF = 4;</code>
     * @return The nFFENFICGFF.
     */
    @java.lang.Override
    public boolean getNFFENFICGFF() {
      return nFFENFICGFF_;
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
      if (pADHFINHGPK_ != false) {
        output.writeBool(2, pADHFINHGPK_);
      }
      if (nFFENFICGFF_ != false) {
        output.writeBool(4, nFFENFICGFF_);
      }
      if (challengeModeDifficulty_ != 0) {
        output.writeUInt32(7, challengeModeDifficulty_);
      }
      if (gBBHFOMPFCF_ != 0) {
        output.writeUInt32(8, gBBHFOMPFCF_);
      }
      if (lHKLBOBEICJ_ != 0) {
        output.writeUInt32(13, lHKLBOBEICJ_);
      }
      if (fPBLABLPOPO_ != 0) {
        output.writeUInt32(14, fPBLABLPOPO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pADHFINHGPK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, pADHFINHGPK_);
      }
      if (nFFENFICGFF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, nFFENFICGFF_);
      }
      if (challengeModeDifficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeModeDifficulty_);
      }
      if (gBBHFOMPFCF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, gBBHFOMPFCF_);
      }
      if (lHKLBOBEICJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, lHKLBOBEICJ_);
      }
      if (fPBLABLPOPO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, fPBLABLPOPO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo other = (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) obj;

      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getGBBHFOMPFCF()
          != other.getGBBHFOMPFCF()) return false;
      if (getPADHFINHGPK()
          != other.getPADHFINHGPK()) return false;
      if (getLHKLBOBEICJ()
          != other.getLHKLBOBEICJ()) return false;
      if (getFPBLABLPOPO()
          != other.getFPBLABLPOPO()) return false;
      if (getNFFENFICGFF()
          != other.getNFFENFICGFF()) return false;
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
      hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeDifficulty();
      hash = (37 * hash) + GBBHFOMPFCF_FIELD_NUMBER;
      hash = (53 * hash) + getGBBHFOMPFCF();
      hash = (37 * hash) + PADHFINHGPK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPADHFINHGPK());
      hash = (37 * hash) + LHKLBOBEICJ_FIELD_NUMBER;
      hash = (53 * hash) + getLHKLBOBEICJ();
      hash = (37 * hash) + FPBLABLPOPO_FIELD_NUMBER;
      hash = (53 * hash) + getFPBLABLPOPO();
      hash = (37 * hash) + NFFENFICGFF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNFFENFICGFF());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo prototype) {
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
     * Name: FCDJFEIIFCP
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2SettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2SettleInfo)
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.class, emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.newBuilder()
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
        challengeModeDifficulty_ = 0;

        gBBHFOMPFCF_ = 0;

        pADHFINHGPK_ = false;

        lHKLBOBEICJ_ = 0;

        fPBLABLPOPO_ = 0;

        nFFENFICGFF_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.internal_static_EffigyChallengeV2SettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo build() {
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo result = new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo(this);
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.gBBHFOMPFCF_ = gBBHFOMPFCF_;
        result.pADHFINHGPK_ = pADHFINHGPK_;
        result.lHKLBOBEICJ_ = lHKLBOBEICJ_;
        result.fPBLABLPOPO_ = fPBLABLPOPO_;
        result.nFFENFICGFF_ = nFFENFICGFF_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo.getDefaultInstance()) return this;
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getGBBHFOMPFCF() != 0) {
          setGBBHFOMPFCF(other.getGBBHFOMPFCF());
        }
        if (other.getPADHFINHGPK() != false) {
          setPADHFINHGPK(other.getPADHFINHGPK());
        }
        if (other.getLHKLBOBEICJ() != 0) {
          setLHKLBOBEICJ(other.getLHKLBOBEICJ());
        }
        if (other.getFPBLABLPOPO() != 0) {
          setFPBLABLPOPO(other.getFPBLABLPOPO());
        }
        if (other.getNFFENFICGFF() != false) {
          setNFFENFICGFF(other.getNFFENFICGFF());
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
        emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeModeDifficulty_ ;
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private int gBBHFOMPFCF_ ;
      /**
       * <code>uint32 GBBHFOMPFCF = 8;</code>
       * @return The gBBHFOMPFCF.
       */
      @java.lang.Override
      public int getGBBHFOMPFCF() {
        return gBBHFOMPFCF_;
      }
      /**
       * <code>uint32 GBBHFOMPFCF = 8;</code>
       * @param value The gBBHFOMPFCF to set.
       * @return This builder for chaining.
       */
      public Builder setGBBHFOMPFCF(int value) {
        
        gBBHFOMPFCF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GBBHFOMPFCF = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGBBHFOMPFCF() {
        
        gBBHFOMPFCF_ = 0;
        onChanged();
        return this;
      }

      private boolean pADHFINHGPK_ ;
      /**
       * <code>bool PADHFINHGPK = 2;</code>
       * @return The pADHFINHGPK.
       */
      @java.lang.Override
      public boolean getPADHFINHGPK() {
        return pADHFINHGPK_;
      }
      /**
       * <code>bool PADHFINHGPK = 2;</code>
       * @param value The pADHFINHGPK to set.
       * @return This builder for chaining.
       */
      public Builder setPADHFINHGPK(boolean value) {
        
        pADHFINHGPK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool PADHFINHGPK = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPADHFINHGPK() {
        
        pADHFINHGPK_ = false;
        onChanged();
        return this;
      }

      private int lHKLBOBEICJ_ ;
      /**
       * <code>uint32 LHKLBOBEICJ = 13;</code>
       * @return The lHKLBOBEICJ.
       */
      @java.lang.Override
      public int getLHKLBOBEICJ() {
        return lHKLBOBEICJ_;
      }
      /**
       * <code>uint32 LHKLBOBEICJ = 13;</code>
       * @param value The lHKLBOBEICJ to set.
       * @return This builder for chaining.
       */
      public Builder setLHKLBOBEICJ(int value) {
        
        lHKLBOBEICJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LHKLBOBEICJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLHKLBOBEICJ() {
        
        lHKLBOBEICJ_ = 0;
        onChanged();
        return this;
      }

      private int fPBLABLPOPO_ ;
      /**
       * <code>uint32 FPBLABLPOPO = 14;</code>
       * @return The fPBLABLPOPO.
       */
      @java.lang.Override
      public int getFPBLABLPOPO() {
        return fPBLABLPOPO_;
      }
      /**
       * <code>uint32 FPBLABLPOPO = 14;</code>
       * @param value The fPBLABLPOPO to set.
       * @return This builder for chaining.
       */
      public Builder setFPBLABLPOPO(int value) {
        
        fPBLABLPOPO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FPBLABLPOPO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFPBLABLPOPO() {
        
        fPBLABLPOPO_ = 0;
        onChanged();
        return this;
      }

      private boolean nFFENFICGFF_ ;
      /**
       * <code>bool NFFENFICGFF = 4;</code>
       * @return The nFFENFICGFF.
       */
      @java.lang.Override
      public boolean getNFFENFICGFF() {
        return nFFENFICGFF_;
      }
      /**
       * <code>bool NFFENFICGFF = 4;</code>
       * @param value The nFFENFICGFF to set.
       * @return This builder for chaining.
       */
      public Builder setNFFENFICGFF(boolean value) {
        
        nFFENFICGFF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool NFFENFICGFF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNFFENFICGFF() {
        
        nFFENFICGFF_ = false;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2SettleInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2SettleInfo)
    private static final emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2SettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2SettleInfo>() {
      @java.lang.Override
      public EffigyChallengeV2SettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeV2SettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2SettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeV2SettleInfoOuterClass.EffigyChallengeV2SettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2SettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EffigyChallengeV2SettleInfo.proto\"\251\001\n\033" +
      "EffigyChallengeV2SettleInfo\022!\n\031challenge" +
      "_mode_difficulty\030\007 \001(\r\022\023\n\013GBBHFOMPFCF\030\010 " +
      "\001(\r\022\023\n\013PADHFINHGPK\030\002 \001(\010\022\023\n\013LHKLBOBEICJ\030" +
      "\r \001(\r\022\023\n\013FPBLABLPOPO\030\016 \001(\r\022\023\n\013NFFENFICGF" +
      "F\030\004 \001(\010B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2SettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2SettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2SettleInfo_descriptor,
        new java.lang.String[] { "ChallengeModeDifficulty", "GBBHFOMPFCF", "PADHFINHGPK", "LHKLBOBEICJ", "FPBLABLPOPO", "NFFENFICGFF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
