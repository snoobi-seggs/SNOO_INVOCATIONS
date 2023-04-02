// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CIDOFFBIFIA.proto

package emu.grasscutter.net.proto;

public final class CIDOFFBIFIAOuterClass {
  private CIDOFFBIFIAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CIDOFFBIFIAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CIDOFFBIFIA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <pre>
     *JCMACGJEEAD snooswap
     * </pre>
     *
     * <code>uint32 op_seq = 3;</code>
     * @return The opSeq.
     */
    int getOpSeq();

    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return Whether the gmMsg field is set.
     */
    boolean hasGmMsg();
    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return The gmMsg.
     */
    java.lang.String getGmMsg();
    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return The bytes for gmMsg.
     */
    com.google.protobuf.ByteString
        getGmMsgBytes();

    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     * @return Whether the duel field is set.
     */
    boolean hasDuel();
    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     * @return The duel.
     */
    emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel getDuel();
    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     */
    emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder();

    public emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.DetailCase getDetailCase();
  }
  /**
   * <pre>
   * Name: CIDOFFBIFIA
   * </pre>
   *
   * Protobuf type {@code CIDOFFBIFIA}
   */
  public static final class CIDOFFBIFIA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CIDOFFBIFIA)
      CIDOFFBIFIAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CIDOFFBIFIA.newBuilder() to construct.
    private CIDOFFBIFIA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CIDOFFBIFIA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CIDOFFBIFIA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CIDOFFBIFIA(
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
            case 24: {

              opSeq_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder subBuilder = null;
              if (detailCase_ == 7) {
                subBuilder = ((emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_).toBuilder();
              }
              detail_ =
                  input.readMessage(emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_);
                detail_ = subBuilder.buildPartial();
              }
              detailCase_ = 7;
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();
              detailCase_ = 12;
              detail_ = s;
              break;
            }
            case 112: {

              controllerId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.internal_static_CIDOFFBIFIA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.internal_static_CIDOFFBIFIA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.class, emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.Builder.class);
    }

    private int detailCase_ = 0;
    private java.lang.Object detail_;
    public enum DetailCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      GM_MSG(12),
      DUEL(7),
      DETAIL_NOT_SET(0);
      private final int value;
      private DetailCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailCase forNumber(int value) {
        switch (value) {
          case 12: return GM_MSG;
          case 7: return DUEL;
          case 0: return DETAIL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailCase
    getDetailCase() {
      return DetailCase.forNumber(
          detailCase_);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 14;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int OP_SEQ_FIELD_NUMBER = 3;
    private int opSeq_;
    /**
     * <pre>
     *JCMACGJEEAD snooswap
     * </pre>
     *
     * <code>uint32 op_seq = 3;</code>
     * @return The opSeq.
     */
    @java.lang.Override
    public int getOpSeq() {
      return opSeq_;
    }

    public static final int GM_MSG_FIELD_NUMBER = 12;
    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return Whether the gmMsg field is set.
     */
    public boolean hasGmMsg() {
      return detailCase_ == 12;
    }
    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return The gmMsg.
     */
    public java.lang.String getGmMsg() {
      java.lang.Object ref = "";
      if (detailCase_ == 12) {
        ref = detail_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (detailCase_ == 12) {
          detail_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *BDBMFCIHJPL snooswap
     * </pre>
     *
     * <code>string gm_msg = 12;</code>
     * @return The bytes for gmMsg.
     */
    public com.google.protobuf.ByteString
        getGmMsgBytes() {
      java.lang.Object ref = "";
      if (detailCase_ == 12) {
        ref = detail_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (detailCase_ == 12) {
          detail_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DUEL_FIELD_NUMBER = 7;
    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     * @return Whether the duel field is set.
     */
    @java.lang.Override
    public boolean hasDuel() {
      return detailCase_ == 7;
    }
    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     * @return The duel.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel getDuel() {
      if (detailCase_ == 7) {
         return (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_;
      }
      return emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
    }
    /**
     * <pre>
     *HHACKKBLLHO IEOMECODBLG snooswap
     * </pre>
     *
     * <code>.GCGDuel duel = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder() {
      if (detailCase_ == 7) {
         return (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_;
      }
      return emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
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
      if (opSeq_ != 0) {
        output.writeUInt32(3, opSeq_);
      }
      if (detailCase_ == 7) {
        output.writeMessage(7, (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_);
      }
      if (detailCase_ == 12) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, detail_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(14, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, opSeq_);
      }
      if (detailCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_);
      }
      if (detailCase_ == 12) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, detail_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA other = (emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (getOpSeq()
          != other.getOpSeq()) return false;
      if (!getDetailCase().equals(other.getDetailCase())) return false;
      switch (detailCase_) {
        case 12:
          if (!getGmMsg()
              .equals(other.getGmMsg())) return false;
          break;
        case 7:
          if (!getDuel()
              .equals(other.getDuel())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + OP_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getOpSeq();
      switch (detailCase_) {
        case 12:
          hash = (37 * hash) + GM_MSG_FIELD_NUMBER;
          hash = (53 * hash) + getGmMsg().hashCode();
          break;
        case 7:
          hash = (37 * hash) + DUEL_FIELD_NUMBER;
          hash = (53 * hash) + getDuel().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA prototype) {
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
     * Name: CIDOFFBIFIA
     * </pre>
     *
     * Protobuf type {@code CIDOFFBIFIA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CIDOFFBIFIA)
        emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.internal_static_CIDOFFBIFIA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.internal_static_CIDOFFBIFIA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.class, emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.newBuilder()
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
        controllerId_ = 0;

        opSeq_ = 0;

        detailCase_ = 0;
        detail_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.internal_static_CIDOFFBIFIA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA build() {
        emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA buildPartial() {
        emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA result = new emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA(this);
        result.controllerId_ = controllerId_;
        result.opSeq_ = opSeq_;
        if (detailCase_ == 12) {
          result.detail_ = detail_;
        }
        if (detailCase_ == 7) {
          if (duelBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = duelBuilder_.build();
          }
        }
        result.detailCase_ = detailCase_;
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
        if (other instanceof emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA) {
          return mergeFrom((emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA other) {
        if (other == emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getOpSeq() != 0) {
          setOpSeq(other.getOpSeq());
        }
        switch (other.getDetailCase()) {
          case GM_MSG: {
            detailCase_ = 12;
            detail_ = other.detail_;
            onChanged();
            break;
          }
          case DUEL: {
            mergeDuel(other.getDuel());
            break;
          }
          case DETAIL_NOT_SET: {
            break;
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
        emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int detailCase_ = 0;
      private java.lang.Object detail_;
      public DetailCase
          getDetailCase() {
        return DetailCase.forNumber(
            detailCase_);
      }

      public Builder clearDetail() {
        detailCase_ = 0;
        detail_ = null;
        onChanged();
        return this;
      }


      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int opSeq_ ;
      /**
       * <pre>
       *JCMACGJEEAD snooswap
       * </pre>
       *
       * <code>uint32 op_seq = 3;</code>
       * @return The opSeq.
       */
      @java.lang.Override
      public int getOpSeq() {
        return opSeq_;
      }
      /**
       * <pre>
       *JCMACGJEEAD snooswap
       * </pre>
       *
       * <code>uint32 op_seq = 3;</code>
       * @param value The opSeq to set.
       * @return This builder for chaining.
       */
      public Builder setOpSeq(int value) {
        
        opSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *JCMACGJEEAD snooswap
       * </pre>
       *
       * <code>uint32 op_seq = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpSeq() {
        
        opSeq_ = 0;
        onChanged();
        return this;
      }

      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @return Whether the gmMsg field is set.
       */
      @java.lang.Override
      public boolean hasGmMsg() {
        return detailCase_ == 12;
      }
      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @return The gmMsg.
       */
      @java.lang.Override
      public java.lang.String getGmMsg() {
        java.lang.Object ref = "";
        if (detailCase_ == 12) {
          ref = detail_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (detailCase_ == 12) {
            detail_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @return The bytes for gmMsg.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getGmMsgBytes() {
        java.lang.Object ref = "";
        if (detailCase_ == 12) {
          ref = detail_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (detailCase_ == 12) {
            detail_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @param value The gmMsg to set.
       * @return This builder for chaining.
       */
      public Builder setGmMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  detailCase_ = 12;
        detail_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGmMsg() {
        if (detailCase_ == 12) {
          detailCase_ = 0;
          detail_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       *BDBMFCIHJPL snooswap
       * </pre>
       *
       * <code>string gm_msg = 12;</code>
       * @param value The bytes for gmMsg to set.
       * @return This builder for chaining.
       */
      public Builder setGmMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        detailCase_ = 12;
        detail_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder> duelBuilder_;
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       * @return Whether the duel field is set.
       */
      @java.lang.Override
      public boolean hasDuel() {
        return detailCase_ == 7;
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       * @return The duel.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel getDuel() {
        if (duelBuilder_ == null) {
          if (detailCase_ == 7) {
            return (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_;
          }
          return emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
        } else {
          if (detailCase_ == 7) {
            return duelBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
        }
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      public Builder setDuel(emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel value) {
        if (duelBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          duelBuilder_.setMessage(value);
        }
        detailCase_ = 7;
        return this;
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      public Builder setDuel(
          emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder builderForValue) {
        if (duelBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          duelBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 7;
        return this;
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      public Builder mergeDuel(emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel value) {
        if (duelBuilder_ == null) {
          if (detailCase_ == 7 &&
              detail_ != emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance()) {
            detail_ = emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.newBuilder((emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 7) {
            duelBuilder_.mergeFrom(value);
          }
          duelBuilder_.setMessage(value);
        }
        detailCase_ = 7;
        return this;
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      public Builder clearDuel() {
        if (duelBuilder_ == null) {
          if (detailCase_ == 7) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 7) {
            detailCase_ = 0;
            detail_ = null;
          }
          duelBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      public emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder getDuelBuilder() {
        return getDuelFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder getDuelOrBuilder() {
        if ((detailCase_ == 7) && (duelBuilder_ != null)) {
          return duelBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 7) {
            return (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_;
          }
          return emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
        }
      }
      /**
       * <pre>
       *HHACKKBLLHO IEOMECODBLG snooswap
       * </pre>
       *
       * <code>.GCGDuel duel = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder> 
          getDuelFieldBuilder() {
        if (duelBuilder_ == null) {
          if (!(detailCase_ == 7)) {
            detail_ = emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.getDefaultInstance();
          }
          duelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel.Builder, emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuelOrBuilder>(
                  (emu.grasscutter.net.proto.GCGDuelOuterClass.GCGDuel) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 7;
        onChanged();;
        return duelBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CIDOFFBIFIA)
    }

    // @@protoc_insertion_point(class_scope:CIDOFFBIFIA)
    private static final emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA();
    }

    public static emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CIDOFFBIFIA>
        PARSER = new com.google.protobuf.AbstractParser<CIDOFFBIFIA>() {
      @java.lang.Override
      public CIDOFFBIFIA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CIDOFFBIFIA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CIDOFFBIFIA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CIDOFFBIFIA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CIDOFFBIFIAOuterClass.CIDOFFBIFIA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CIDOFFBIFIA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CIDOFFBIFIA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CIDOFFBIFIA.proto\032\rGCGDuel.proto\"j\n\013CI" +
      "DOFFBIFIA\022\025\n\rcontroller_id\030\016 \001(\r\022\016\n\006op_s" +
      "eq\030\003 \001(\r\022\020\n\006gm_msg\030\014 \001(\tH\000\022\030\n\004duel\030\007 \001(\013" +
      "2\010.GCGDuelH\000B\010\n\006detailB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGDuelOuterClass.getDescriptor(),
        });
    internal_static_CIDOFFBIFIA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CIDOFFBIFIA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CIDOFFBIFIA_descriptor,
        new java.lang.String[] { "ControllerId", "OpSeq", "GmMsg", "Duel", "Detail", });
    emu.grasscutter.net.proto.GCGDuelOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
