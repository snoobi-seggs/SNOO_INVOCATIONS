// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingFirstStageSettleInfo.proto

package emu.grasscutter.net.proto;

public final class VintageHuntingFirstStageSettleInfoOuterClass {
  private VintageHuntingFirstStageSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingFirstStageSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingFirstStageSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MEJPBKFHFNH = 8;</code>
     * @return The mEJPBKFHFNH.
     */
    int getMEJPBKFHFNH();

    /**
     * <code>uint32 MKAMDEJJPAO = 14;</code>
     * @return The mKAMDEJJPAO.
     */
    int getMKAMDEJJPAO();

    /**
     * <code>uint32 FHICAKKCBPF = 4;</code>
     * @return The fHICAKKCBPF.
     */
    int getFHICAKKCBPF();

    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * Name: KKIDHAIDLFB
   * </pre>
   *
   * Protobuf type {@code VintageHuntingFirstStageSettleInfo}
   */
  public static final class VintageHuntingFirstStageSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingFirstStageSettleInfo)
      VintageHuntingFirstStageSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingFirstStageSettleInfo.newBuilder() to construct.
    private VintageHuntingFirstStageSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingFirstStageSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingFirstStageSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageHuntingFirstStageSettleInfo(
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

              fHICAKKCBPF_ = input.readUInt32();
              break;
            }
            case 64: {

              mEJPBKFHFNH_ = input.readUInt32();
              break;
            }
            case 80: {

              score_ = input.readUInt32();
              break;
            }
            case 112: {

              mKAMDEJJPAO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.Builder.class);
    }

    public static final int MEJPBKFHFNH_FIELD_NUMBER = 8;
    private int mEJPBKFHFNH_;
    /**
     * <code>uint32 MEJPBKFHFNH = 8;</code>
     * @return The mEJPBKFHFNH.
     */
    @java.lang.Override
    public int getMEJPBKFHFNH() {
      return mEJPBKFHFNH_;
    }

    public static final int MKAMDEJJPAO_FIELD_NUMBER = 14;
    private int mKAMDEJJPAO_;
    /**
     * <code>uint32 MKAMDEJJPAO = 14;</code>
     * @return The mKAMDEJJPAO.
     */
    @java.lang.Override
    public int getMKAMDEJJPAO() {
      return mKAMDEJJPAO_;
    }

    public static final int FHICAKKCBPF_FIELD_NUMBER = 4;
    private int fHICAKKCBPF_;
    /**
     * <code>uint32 FHICAKKCBPF = 4;</code>
     * @return The fHICAKKCBPF.
     */
    @java.lang.Override
    public int getFHICAKKCBPF() {
      return fHICAKKCBPF_;
    }

    public static final int SCORE_FIELD_NUMBER = 10;
    private int score_;
    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (fHICAKKCBPF_ != 0) {
        output.writeUInt32(4, fHICAKKCBPF_);
      }
      if (mEJPBKFHFNH_ != 0) {
        output.writeUInt32(8, mEJPBKFHFNH_);
      }
      if (score_ != 0) {
        output.writeUInt32(10, score_);
      }
      if (mKAMDEJJPAO_ != 0) {
        output.writeUInt32(14, mKAMDEJJPAO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fHICAKKCBPF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, fHICAKKCBPF_);
      }
      if (mEJPBKFHFNH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, mEJPBKFHFNH_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, score_);
      }
      if (mKAMDEJJPAO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, mKAMDEJJPAO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo other = (emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) obj;

      if (getMEJPBKFHFNH()
          != other.getMEJPBKFHFNH()) return false;
      if (getMKAMDEJJPAO()
          != other.getMKAMDEJJPAO()) return false;
      if (getFHICAKKCBPF()
          != other.getFHICAKKCBPF()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + MEJPBKFHFNH_FIELD_NUMBER;
      hash = (53 * hash) + getMEJPBKFHFNH();
      hash = (37 * hash) + MKAMDEJJPAO_FIELD_NUMBER;
      hash = (53 * hash) + getMKAMDEJJPAO();
      hash = (37 * hash) + FHICAKKCBPF_FIELD_NUMBER;
      hash = (53 * hash) + getFHICAKKCBPF();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo prototype) {
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
     * Name: KKIDHAIDLFB
     * </pre>
     *
     * Protobuf type {@code VintageHuntingFirstStageSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingFirstStageSettleInfo)
        emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.newBuilder()
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
        mEJPBKFHFNH_ = 0;

        mKAMDEJJPAO_ = 0;

        fHICAKKCBPF_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo build() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo buildPartial() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo result = new emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo(this);
        result.mEJPBKFHFNH_ = mEJPBKFHFNH_;
        result.mKAMDEJJPAO_ = mKAMDEJJPAO_;
        result.fHICAKKCBPF_ = fHICAKKCBPF_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo other) {
        if (other == emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.getDefaultInstance()) return this;
        if (other.getMEJPBKFHFNH() != 0) {
          setMEJPBKFHFNH(other.getMEJPBKFHFNH());
        }
        if (other.getMKAMDEJJPAO() != 0) {
          setMKAMDEJJPAO(other.getMKAMDEJJPAO());
        }
        if (other.getFHICAKKCBPF() != 0) {
          setFHICAKKCBPF(other.getFHICAKKCBPF());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
        emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mEJPBKFHFNH_ ;
      /**
       * <code>uint32 MEJPBKFHFNH = 8;</code>
       * @return The mEJPBKFHFNH.
       */
      @java.lang.Override
      public int getMEJPBKFHFNH() {
        return mEJPBKFHFNH_;
      }
      /**
       * <code>uint32 MEJPBKFHFNH = 8;</code>
       * @param value The mEJPBKFHFNH to set.
       * @return This builder for chaining.
       */
      public Builder setMEJPBKFHFNH(int value) {
        
        mEJPBKFHFNH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MEJPBKFHFNH = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMEJPBKFHFNH() {
        
        mEJPBKFHFNH_ = 0;
        onChanged();
        return this;
      }

      private int mKAMDEJJPAO_ ;
      /**
       * <code>uint32 MKAMDEJJPAO = 14;</code>
       * @return The mKAMDEJJPAO.
       */
      @java.lang.Override
      public int getMKAMDEJJPAO() {
        return mKAMDEJJPAO_;
      }
      /**
       * <code>uint32 MKAMDEJJPAO = 14;</code>
       * @param value The mKAMDEJJPAO to set.
       * @return This builder for chaining.
       */
      public Builder setMKAMDEJJPAO(int value) {
        
        mKAMDEJJPAO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MKAMDEJJPAO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMKAMDEJJPAO() {
        
        mKAMDEJJPAO_ = 0;
        onChanged();
        return this;
      }

      private int fHICAKKCBPF_ ;
      /**
       * <code>uint32 FHICAKKCBPF = 4;</code>
       * @return The fHICAKKCBPF.
       */
      @java.lang.Override
      public int getFHICAKKCBPF() {
        return fHICAKKCBPF_;
      }
      /**
       * <code>uint32 FHICAKKCBPF = 4;</code>
       * @param value The fHICAKKCBPF to set.
       * @return This builder for chaining.
       */
      public Builder setFHICAKKCBPF(int value) {
        
        fHICAKKCBPF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FHICAKKCBPF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFHICAKKCBPF() {
        
        fHICAKKCBPF_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 10;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingFirstStageSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingFirstStageSettleInfo)
    private static final emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo();
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingFirstStageSettleInfo>() {
      @java.lang.Override
      public VintageHuntingFirstStageSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageHuntingFirstStageSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(VintageHuntingFirstStageSettleInfo.pro" +
      "to\"r\n\"VintageHuntingFirstStageSettleInfo" +
      "\022\023\n\013MEJPBKFHFNH\030\010 \001(\r\022\023\n\013MKAMDEJJPAO\030\016 \001" +
      "(\r\022\023\n\013FHICAKKCBPF\030\004 \001(\r\022\r\n\005score\030\n \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingFirstStageSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingFirstStageSettleInfo_descriptor,
        new java.lang.String[] { "MEJPBKFHFNH", "MKAMDEJJPAO", "FHICAKKCBPF", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
