// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDeckDeleteRsp.proto

package emu.grasscutter.net.proto;

public final class GCGDSDeckDeleteRspOuterClass {
  private GCGDSDeckDeleteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeckDeleteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeckDeleteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *AHAIAIPGFDN snooswap
     * </pre>
     *
     * <code>uint32 deck_id = 7;</code>
     * @return The deckId.
     */
    int getDeckId();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: NKGINHFDBJN
   * CmdId: 7363
   * </pre>
   *
   * Protobuf type {@code GCGDSDeckDeleteRsp}
   */
  public static final class GCGDSDeckDeleteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDeckDeleteRsp)
      GCGDSDeckDeleteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDeckDeleteRsp.newBuilder() to construct.
    private GCGDSDeckDeleteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDeckDeleteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDeckDeleteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDeckDeleteRsp(
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
            case 56: {

              deckId_ = input.readUInt32();
              break;
            }
            case 96: {

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
      return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.internal_static_GCGDSDeckDeleteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.internal_static_GCGDSDeckDeleteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.class, emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.Builder.class);
    }

    public static final int DECK_ID_FIELD_NUMBER = 7;
    private int deckId_;
    /**
     * <pre>
     *AHAIAIPGFDN snooswap
     * </pre>
     *
     * <code>uint32 deck_id = 7;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
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
      if (deckId_ != 0) {
        output.writeUInt32(7, deckId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, deckId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp other = (emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp) obj;

      if (getDeckId()
          != other.getDeckId()) return false;
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
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp prototype) {
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
     * Name: NKGINHFDBJN
     * CmdId: 7363
     * </pre>
     *
     * Protobuf type {@code GCGDSDeckDeleteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeckDeleteRsp)
        emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.internal_static_GCGDSDeckDeleteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.internal_static_GCGDSDeckDeleteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.class, emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.newBuilder()
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
        deckId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.internal_static_GCGDSDeckDeleteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp build() {
        emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp buildPartial() {
        emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp result = new emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp(this);
        result.deckId_ = deckId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp other) {
        if (other == emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp.getDefaultInstance()) return this;
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
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
        emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int deckId_ ;
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 7;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 7;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *AHAIAIPGFDN snooswap
       * </pre>
       *
       * <code>uint32 deck_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:GCGDSDeckDeleteRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeckDeleteRsp)
    private static final emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp();
    }

    public static emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeckDeleteRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDeckDeleteRsp>() {
      @java.lang.Override
      public GCGDSDeckDeleteRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSDeckDeleteRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSDeckDeleteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDeckDeleteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDeckDeleteRspOuterClass.GCGDSDeckDeleteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDeckDeleteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeckDeleteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGDSDeckDeleteRsp.proto\"6\n\022GCGDSDeckD" +
      "eleteRsp\022\017\n\007deck_id\030\007 \001(\r\022\017\n\007retcode\030\014 \001" +
      "(\005B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSDeckDeleteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDeckDeleteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeckDeleteRsp_descriptor,
        new java.lang.String[] { "DeckId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
