// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneAvatarStaminaStepRsp.proto

package emu.grasscutter.net.proto;

public final class SceneAvatarStaminaStepRspOuterClass {
  private SceneAvatarStaminaStepRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneAvatarStaminaStepRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneAvatarStaminaStepRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.Vector rot = 14;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 14;</code>
     * @return The rot.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();

    /**
     * <code>bool use_client_rot = 3;</code>
     * @return The useClientRot.
     */
    boolean getUseClientRot();
  }
  /**
   * <pre>
   * Name: NPDDDIOCDLF
   * CmdId: 259
   * </pre>
   *
   * Protobuf type {@code SceneAvatarStaminaStepRsp}
   */
  public static final class SceneAvatarStaminaStepRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneAvatarStaminaStepRsp)
      SceneAvatarStaminaStepRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneAvatarStaminaStepRsp.newBuilder() to construct.
    private SceneAvatarStaminaStepRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneAvatarStaminaStepRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneAvatarStaminaStepRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneAvatarStaminaStepRsp(
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

              useClientRot_ = input.readBool();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 114: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.internal_static_SceneAvatarStaminaStepRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.internal_static_SceneAvatarStaminaStepRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.class, emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.Builder.class);
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

    public static final int ROT_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 14;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 14;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
    }

    public static final int USE_CLIENT_ROT_FIELD_NUMBER = 3;
    private boolean useClientRot_;
    /**
     * <code>bool use_client_rot = 3;</code>
     * @return The useClientRot.
     */
    @java.lang.Override
    public boolean getUseClientRot() {
      return useClientRot_;
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
      if (useClientRot_ != false) {
        output.writeBool(3, useClientRot_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (rot_ != null) {
        output.writeMessage(14, getRot());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (useClientRot_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, useClientRot_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getRot());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp other = (emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
      if (getUseClientRot()
          != other.getUseClientRot()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (37 * hash) + USE_CLIENT_ROT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseClientRot());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp prototype) {
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
     * Name: NPDDDIOCDLF
     * CmdId: 259
     * </pre>
     *
     * Protobuf type {@code SceneAvatarStaminaStepRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneAvatarStaminaStepRsp)
        emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.internal_static_SceneAvatarStaminaStepRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.internal_static_SceneAvatarStaminaStepRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.class, emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.newBuilder()
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
        retcode_ = 0;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        useClientRot_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.internal_static_SceneAvatarStaminaStepRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp build() {
        emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp buildPartial() {
        emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp result = new emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp(this);
        result.retcode_ = retcode_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
        result.useClientRot_ = useClientRot_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp other) {
        if (other == emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
        }
        if (other.getUseClientRot() != false) {
          setUseClientRot(other.getUseClientRot());
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
        emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 14;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 14;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public Builder setRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private boolean useClientRot_ ;
      /**
       * <code>bool use_client_rot = 3;</code>
       * @return The useClientRot.
       */
      @java.lang.Override
      public boolean getUseClientRot() {
        return useClientRot_;
      }
      /**
       * <code>bool use_client_rot = 3;</code>
       * @param value The useClientRot to set.
       * @return This builder for chaining.
       */
      public Builder setUseClientRot(boolean value) {
        
        useClientRot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool use_client_rot = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseClientRot() {
        
        useClientRot_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneAvatarStaminaStepRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneAvatarStaminaStepRsp)
    private static final emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp();
    }

    public static emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneAvatarStaminaStepRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneAvatarStaminaStepRsp>() {
      @java.lang.Override
      public SceneAvatarStaminaStepRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneAvatarStaminaStepRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneAvatarStaminaStepRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneAvatarStaminaStepRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneAvatarStaminaStepRspOuterClass.SceneAvatarStaminaStepRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneAvatarStaminaStepRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneAvatarStaminaStepRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SceneAvatarStaminaStepRsp.proto\032\014Vecto" +
      "r.proto\"Z\n\031SceneAvatarStaminaStepRsp\022\017\n\007" +
      "retcode\030\n \001(\005\022\024\n\003rot\030\016 \001(\0132\007.Vector\022\026\n\016u" +
      "se_client_rot\030\003 \001(\010B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SceneAvatarStaminaStepRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneAvatarStaminaStepRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneAvatarStaminaStepRsp_descriptor,
        new java.lang.String[] { "Retcode", "Rot", "UseClientRot", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
