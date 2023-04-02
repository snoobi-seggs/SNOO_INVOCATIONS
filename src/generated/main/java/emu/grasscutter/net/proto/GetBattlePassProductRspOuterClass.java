// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBattlePassProductRsp.proto

package emu.grasscutter.net.proto;

public final class GetBattlePassProductRspOuterClass {
  private GetBattlePassProductRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBattlePassProductRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetBattlePassProductRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_schedule_id = 5;</code>
     * @return The curScheduleId.
     */
    int getCurScheduleId();

    /**
     * <code>string product_id = 7;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 7;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>string price_tier = 14;</code>
     * @return The priceTier.
     */
    java.lang.String getPriceTier();
    /**
     * <code>string price_tier = 14;</code>
     * @return The bytes for priceTier.
     */
    com.google.protobuf.ByteString
        getPriceTierBytes();

    /**
     * <code>uint32 battle_pass_product_play_type = 11;</code>
     * @return The battlePassProductPlayType.
     */
    int getBattlePassProductPlayType();
  }
  /**
   * <pre>
   * Name: NIPJJMGCKAG
   * CmdId: 2631
   * </pre>
   *
   * Protobuf type {@code GetBattlePassProductRsp}
   */
  public static final class GetBattlePassProductRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetBattlePassProductRsp)
      GetBattlePassProductRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetBattlePassProductRsp.newBuilder() to construct.
    private GetBattlePassProductRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBattlePassProductRsp() {
      productId_ = "";
      priceTier_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetBattlePassProductRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetBattlePassProductRsp(
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
            case 40: {

              curScheduleId_ = input.readUInt32();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              battlePassProductPlayType_ = input.readUInt32();
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              priceTier_ = s;
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
      return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.class, emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.Builder.class);
    }

    public static final int CUR_SCHEDULE_ID_FIELD_NUMBER = 5;
    private int curScheduleId_;
    /**
     * <code>uint32 cur_schedule_id = 5;</code>
     * @return The curScheduleId.
     */
    @java.lang.Override
    public int getCurScheduleId() {
      return curScheduleId_;
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 7;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 7;</code>
     * @return The productId.
     */
    @java.lang.Override
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 7;</code>
     * @return The bytes for productId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PRICE_TIER_FIELD_NUMBER = 14;
    private volatile java.lang.Object priceTier_;
    /**
     * <code>string price_tier = 14;</code>
     * @return The priceTier.
     */
    @java.lang.Override
    public java.lang.String getPriceTier() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        priceTier_ = s;
        return s;
      }
    }
    /**
     * <code>string price_tier = 14;</code>
     * @return The bytes for priceTier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPriceTierBytes() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BATTLE_PASS_PRODUCT_PLAY_TYPE_FIELD_NUMBER = 11;
    private int battlePassProductPlayType_;
    /**
     * <code>uint32 battle_pass_product_play_type = 11;</code>
     * @return The battlePassProductPlayType.
     */
    @java.lang.Override
    public int getBattlePassProductPlayType() {
      return battlePassProductPlayType_;
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
      if (curScheduleId_ != 0) {
        output.writeUInt32(5, curScheduleId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, productId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (battlePassProductPlayType_ != 0) {
        output.writeUInt32(11, battlePassProductPlayType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, priceTier_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, curScheduleId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, productId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (battlePassProductPlayType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, battlePassProductPlayType_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, priceTier_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp other = (emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp) obj;

      if (getCurScheduleId()
          != other.getCurScheduleId()) return false;
      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getPriceTier()
          .equals(other.getPriceTier())) return false;
      if (getBattlePassProductPlayType()
          != other.getBattlePassProductPlayType()) return false;
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
      hash = (37 * hash) + CUR_SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurScheduleId();
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PRICE_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getPriceTier().hashCode();
      hash = (37 * hash) + BATTLE_PASS_PRODUCT_PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getBattlePassProductPlayType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp prototype) {
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
     * Name: NIPJJMGCKAG
     * CmdId: 2631
     * </pre>
     *
     * Protobuf type {@code GetBattlePassProductRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetBattlePassProductRsp)
        emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.class, emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.newBuilder()
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
        curScheduleId_ = 0;

        productId_ = "";

        retcode_ = 0;

        priceTier_ = "";

        battlePassProductPlayType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp build() {
        emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp buildPartial() {
        emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp result = new emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp(this);
        result.curScheduleId_ = curScheduleId_;
        result.productId_ = productId_;
        result.retcode_ = retcode_;
        result.priceTier_ = priceTier_;
        result.battlePassProductPlayType_ = battlePassProductPlayType_;
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
        if (other instanceof emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp other) {
        if (other == emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp.getDefaultInstance()) return this;
        if (other.getCurScheduleId() != 0) {
          setCurScheduleId(other.getCurScheduleId());
        }
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.getPriceTier().isEmpty()) {
          priceTier_ = other.priceTier_;
          onChanged();
        }
        if (other.getBattlePassProductPlayType() != 0) {
          setBattlePassProductPlayType(other.getBattlePassProductPlayType());
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
        emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curScheduleId_ ;
      /**
       * <code>uint32 cur_schedule_id = 5;</code>
       * @return The curScheduleId.
       */
      @java.lang.Override
      public int getCurScheduleId() {
        return curScheduleId_;
      }
      /**
       * <code>uint32 cur_schedule_id = 5;</code>
       * @param value The curScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setCurScheduleId(int value) {
        
        curScheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_schedule_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScheduleId() {
        
        curScheduleId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 7;</code>
       * @return The productId.
       */
      public java.lang.String getProductId() {
        java.lang.Object ref = productId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string product_id = 7;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        java.lang.Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 7;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 7;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productId_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object priceTier_ = "";
      /**
       * <code>string price_tier = 14;</code>
       * @return The priceTier.
       */
      public java.lang.String getPriceTier() {
        java.lang.Object ref = priceTier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          priceTier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string price_tier = 14;</code>
       * @return The bytes for priceTier.
       */
      public com.google.protobuf.ByteString
          getPriceTierBytes() {
        java.lang.Object ref = priceTier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          priceTier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price_tier = 14;</code>
       * @param value The priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        priceTier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceTier() {
        
        priceTier_ = getDefaultInstance().getPriceTier();
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 14;</code>
       * @param value The bytes for priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        priceTier_ = value;
        onChanged();
        return this;
      }

      private int battlePassProductPlayType_ ;
      /**
       * <code>uint32 battle_pass_product_play_type = 11;</code>
       * @return The battlePassProductPlayType.
       */
      @java.lang.Override
      public int getBattlePassProductPlayType() {
        return battlePassProductPlayType_;
      }
      /**
       * <code>uint32 battle_pass_product_play_type = 11;</code>
       * @param value The battlePassProductPlayType to set.
       * @return This builder for chaining.
       */
      public Builder setBattlePassProductPlayType(int value) {
        
        battlePassProductPlayType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 battle_pass_product_play_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBattlePassProductPlayType() {
        
        battlePassProductPlayType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetBattlePassProductRsp)
    }

    // @@protoc_insertion_point(class_scope:GetBattlePassProductRsp)
    private static final emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp();
    }

    public static emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBattlePassProductRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetBattlePassProductRsp>() {
      @java.lang.Override
      public GetBattlePassProductRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBattlePassProductRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetBattlePassProductRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBattlePassProductRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetBattlePassProductRspOuterClass.GetBattlePassProductRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBattlePassProductRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBattlePassProductRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GetBattlePassProductRsp.proto\"\222\001\n\027GetB" +
      "attlePassProductRsp\022\027\n\017cur_schedule_id\030\005" +
      " \001(\r\022\022\n\nproduct_id\030\007 \001(\t\022\017\n\007retcode\030\n \001(" +
      "\005\022\022\n\nprice_tier\030\016 \001(\t\022%\n\035battle_pass_pro" +
      "duct_play_type\030\013 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetBattlePassProductRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetBattlePassProductRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBattlePassProductRsp_descriptor,
        new java.lang.String[] { "CurScheduleId", "ProductId", "Retcode", "PriceTier", "BattlePassProductPlayType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
