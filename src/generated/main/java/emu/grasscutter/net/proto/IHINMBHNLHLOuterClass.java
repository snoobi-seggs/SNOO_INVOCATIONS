// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IHINMBHNLHL.proto

package emu.grasscutter.net.proto;

public final class IHINMBHNLHLOuterClass {
  private IHINMBHNLHLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IHINMBHNLHLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IHINMBHNLHL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    java.lang.String getContent();
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>uint32 IMLBHGHMNAJ = 3;</code>
     * @return The iMLBHGHMNAJ.
     */
    int getIMLBHGHMNAJ();
  }
  /**
   * <pre>
   * Name: IHINMBHNLHL
   * </pre>
   *
   * Protobuf type {@code IHINMBHNLHL}
   */
  public static final class IHINMBHNLHL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IHINMBHNLHL)
      IHINMBHNLHLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IHINMBHNLHL.newBuilder() to construct.
    private IHINMBHNLHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IHINMBHNLHL() {
      type_ = "";
      content_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IHINMBHNLHL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IHINMBHNLHL(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 24: {

              iMLBHGHMNAJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.internal_static_IHINMBHNLHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.internal_static_IHINMBHNLHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.class, emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMLBHGHMNAJ_FIELD_NUMBER = 3;
    private int iMLBHGHMNAJ_;
    /**
     * <code>uint32 IMLBHGHMNAJ = 3;</code>
     * @return The iMLBHGHMNAJ.
     */
    @java.lang.Override
    public int getIMLBHGHMNAJ() {
      return iMLBHGHMNAJ_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
      }
      if (iMLBHGHMNAJ_ != 0) {
        output.writeUInt32(3, iMLBHGHMNAJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
      }
      if (iMLBHGHMNAJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, iMLBHGHMNAJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL other = (emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL) obj;

      if (!getType()
          .equals(other.getType())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (getIMLBHGHMNAJ()
          != other.getIMLBHGHMNAJ()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + IMLBHGHMNAJ_FIELD_NUMBER;
      hash = (53 * hash) + getIMLBHGHMNAJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL prototype) {
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
     * Name: IHINMBHNLHL
     * </pre>
     *
     * Protobuf type {@code IHINMBHNLHL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IHINMBHNLHL)
        emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.internal_static_IHINMBHNLHL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.internal_static_IHINMBHNLHL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.class, emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.newBuilder()
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
        type_ = "";

        content_ = "";

        iMLBHGHMNAJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.internal_static_IHINMBHNLHL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL build() {
        emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL buildPartial() {
        emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL result = new emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL(this);
        result.type_ = type_;
        result.content_ = content_;
        result.iMLBHGHMNAJ_ = iMLBHGHMNAJ_;
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
        if (other instanceof emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL) {
          return mergeFrom((emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL other) {
        if (other == emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL.getDefaultInstance()) return this;
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.getIMLBHGHMNAJ() != 0) {
          setIMLBHGHMNAJ(other.getIMLBHGHMNAJ());
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
        emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>string type = 1;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string type = 1;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>string type = 1;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 2;</code>
       * @return The content.
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private int iMLBHGHMNAJ_ ;
      /**
       * <code>uint32 IMLBHGHMNAJ = 3;</code>
       * @return The iMLBHGHMNAJ.
       */
      @java.lang.Override
      public int getIMLBHGHMNAJ() {
        return iMLBHGHMNAJ_;
      }
      /**
       * <code>uint32 IMLBHGHMNAJ = 3;</code>
       * @param value The iMLBHGHMNAJ to set.
       * @return This builder for chaining.
       */
      public Builder setIMLBHGHMNAJ(int value) {
        
        iMLBHGHMNAJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IMLBHGHMNAJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIMLBHGHMNAJ() {
        
        iMLBHGHMNAJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IHINMBHNLHL)
    }

    // @@protoc_insertion_point(class_scope:IHINMBHNLHL)
    private static final emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL();
    }

    public static emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IHINMBHNLHL>
        PARSER = new com.google.protobuf.AbstractParser<IHINMBHNLHL>() {
      @java.lang.Override
      public IHINMBHNLHL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IHINMBHNLHL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IHINMBHNLHL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IHINMBHNLHL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IHINMBHNLHLOuterClass.IHINMBHNLHL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IHINMBHNLHL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IHINMBHNLHL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IHINMBHNLHL.proto\"A\n\013IHINMBHNLHL\022\014\n\004ty" +
      "pe\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\023\n\013IMLBHGHMNAJ" +
      "\030\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IHINMBHNLHL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IHINMBHNLHL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IHINMBHNLHL_descriptor,
        new java.lang.String[] { "Type", "Content", "IMLBHGHMNAJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
