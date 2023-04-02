// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetReunionSignInInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetReunionSignInInfoRspOuterClass {
  private GetReunionSignInInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetReunionSignInInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetReunionSignInInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     * @return Whether the signInInfo field is set.
     */
    boolean hasSignInInfo();
    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     * @return The signInInfo.
     */
    emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo();
    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     */
    emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: JGPECFNNFJP
   * CmdId: 5065
   * </pre>
   *
   * Protobuf type {@code GetReunionSignInInfoRsp}
   */
  public static final class GetReunionSignInInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetReunionSignInInfoRsp)
      GetReunionSignInInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetReunionSignInInfoRsp.newBuilder() to construct.
    private GetReunionSignInInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetReunionSignInInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetReunionSignInInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetReunionSignInInfoRsp(
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
            case 66: {
              emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder subBuilder = null;
              if (signInInfo_ != null) {
                subBuilder = signInInfo_.toBuilder();
              }
              signInInfo_ = input.readMessage(emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signInInfo_);
                signInInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.internal_static_GetReunionSignInInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.internal_static_GetReunionSignInInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.class, emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.Builder.class);
    }

    public static final int SIGN_IN_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo signInInfo_;
    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     * @return Whether the signInInfo field is set.
     */
    @java.lang.Override
    public boolean hasSignInInfo() {
      return signInInfo_ != null;
    }
    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     * @return The signInInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo() {
      return signInInfo_ == null ? emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
    }
    /**
     * <code>.ReunionSignInInfo sign_in_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder() {
      return getSignInInfo();
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
      if (signInInfo_ != null) {
        output.writeMessage(8, getSignInInfo());
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (signInInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getSignInInfo());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp other = (emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp) obj;

      if (hasSignInInfo() != other.hasSignInInfo()) return false;
      if (hasSignInInfo()) {
        if (!getSignInInfo()
            .equals(other.getSignInInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasSignInInfo()) {
        hash = (37 * hash) + SIGN_IN_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSignInInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp prototype) {
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
     * Name: JGPECFNNFJP
     * CmdId: 5065
     * </pre>
     *
     * Protobuf type {@code GetReunionSignInInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetReunionSignInInfoRsp)
        emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.internal_static_GetReunionSignInInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.internal_static_GetReunionSignInInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.class, emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.newBuilder()
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
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.internal_static_GetReunionSignInInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp build() {
        emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp result = new emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp(this);
        if (signInInfoBuilder_ == null) {
          result.signInInfo_ = signInInfo_;
        } else {
          result.signInInfo_ = signInInfoBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp.getDefaultInstance()) return this;
        if (other.hasSignInInfo()) {
          mergeSignInInfo(other.getSignInInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo signInInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder> signInInfoBuilder_;
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       * @return Whether the signInInfo field is set.
       */
      public boolean hasSignInInfo() {
        return signInInfoBuilder_ != null || signInInfo_ != null;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       * @return The signInInfo.
       */
      public emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo() {
        if (signInInfoBuilder_ == null) {
          return signInInfo_ == null ? emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
        } else {
          return signInInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public Builder setSignInInfo(emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signInInfo_ = value;
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public Builder setSignInInfo(
          emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder builderForValue) {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = builderForValue.build();
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public Builder mergeSignInInfo(emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (signInInfo_ != null) {
            signInInfo_ =
              emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.newBuilder(signInInfo_).mergeFrom(value).buildPartial();
          } else {
            signInInfo_ = value;
          }
          onChanged();
        } else {
          signInInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public Builder clearSignInInfo() {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
          onChanged();
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder getSignInInfoBuilder() {
        
        onChanged();
        return getSignInInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      public emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder() {
        if (signInInfoBuilder_ != null) {
          return signInInfoBuilder_.getMessageOrBuilder();
        } else {
          return signInInfo_ == null ?
              emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
        }
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder> 
          getSignInInfoFieldBuilder() {
        if (signInInfoBuilder_ == null) {
          signInInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder>(
                  getSignInInfo(),
                  getParentForChildren(),
                  isClean());
          signInInfo_ = null;
        }
        return signInInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetReunionSignInInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetReunionSignInInfoRsp)
    private static final emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetReunionSignInInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetReunionSignInInfoRsp>() {
      @java.lang.Override
      public GetReunionSignInInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetReunionSignInInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetReunionSignInInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetReunionSignInInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetReunionSignInInfoRspOuterClass.GetReunionSignInInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReunionSignInInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReunionSignInInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GetReunionSignInInfoRsp.proto\032\027Reunion" +
      "SignInInfo.proto\"T\n\027GetReunionSignInInfo" +
      "Rsp\022(\n\014sign_in_info\030\010 \001(\0132\022.ReunionSignI" +
      "nInfo\022\017\n\007retcode\030\n \001(\005B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.getDescriptor(),
        });
    internal_static_GetReunionSignInInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetReunionSignInInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReunionSignInInfoRsp_descriptor,
        new java.lang.String[] { "SignInInfo", "Retcode", });
    emu.grasscutter.net.proto.ReunionSignInInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
