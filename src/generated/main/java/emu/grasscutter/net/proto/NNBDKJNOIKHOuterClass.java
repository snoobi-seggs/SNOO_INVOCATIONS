// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NNBDKJNOIKH.proto

package emu.grasscutter.net.proto;

public final class NNBDKJNOIKHOuterClass {
  private NNBDKJNOIKHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NNBDKJNOIKHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NNBDKJNOIKH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool KJEEOAODKJG = 9;</code>
     * @return The kJEEOAODKJG.
     */
    boolean getKJEEOAODKJG();

    /**
     * <code>uint64 server_game_time = 5;</code>
     * @return The serverGameTime.
     */
    long getServerGameTime();

    /**
     * <code>bool is_win = 7;</code>
     * @return The isWin.
     */
    boolean getIsWin();
  }
  /**
   * <pre>
   * Name: NNBDKJNOIKH
   * </pre>
   *
   * Protobuf type {@code NNBDKJNOIKH}
   */
  public static final class NNBDKJNOIKH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NNBDKJNOIKH)
      NNBDKJNOIKHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NNBDKJNOIKH.newBuilder() to construct.
    private NNBDKJNOIKH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NNBDKJNOIKH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NNBDKJNOIKH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NNBDKJNOIKH(
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

              serverGameTime_ = input.readUInt64();
              break;
            }
            case 56: {

              isWin_ = input.readBool();
              break;
            }
            case 72: {

              kJEEOAODKJG_ = input.readBool();
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
      return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.internal_static_NNBDKJNOIKH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.internal_static_NNBDKJNOIKH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.class, emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.Builder.class);
    }

    public static final int KJEEOAODKJG_FIELD_NUMBER = 9;
    private boolean kJEEOAODKJG_;
    /**
     * <code>bool KJEEOAODKJG = 9;</code>
     * @return The kJEEOAODKJG.
     */
    @java.lang.Override
    public boolean getKJEEOAODKJG() {
      return kJEEOAODKJG_;
    }

    public static final int SERVER_GAME_TIME_FIELD_NUMBER = 5;
    private long serverGameTime_;
    /**
     * <code>uint64 server_game_time = 5;</code>
     * @return The serverGameTime.
     */
    @java.lang.Override
    public long getServerGameTime() {
      return serverGameTime_;
    }

    public static final int IS_WIN_FIELD_NUMBER = 7;
    private boolean isWin_;
    /**
     * <code>bool is_win = 7;</code>
     * @return The isWin.
     */
    @java.lang.Override
    public boolean getIsWin() {
      return isWin_;
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
      if (serverGameTime_ != 0L) {
        output.writeUInt64(5, serverGameTime_);
      }
      if (isWin_ != false) {
        output.writeBool(7, isWin_);
      }
      if (kJEEOAODKJG_ != false) {
        output.writeBool(9, kJEEOAODKJG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverGameTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, serverGameTime_);
      }
      if (isWin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isWin_);
      }
      if (kJEEOAODKJG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, kJEEOAODKJG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH other = (emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH) obj;

      if (getKJEEOAODKJG()
          != other.getKJEEOAODKJG()) return false;
      if (getServerGameTime()
          != other.getServerGameTime()) return false;
      if (getIsWin()
          != other.getIsWin()) return false;
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
      hash = (37 * hash) + KJEEOAODKJG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKJEEOAODKJG());
      hash = (37 * hash) + SERVER_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerGameTime());
      hash = (37 * hash) + IS_WIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWin());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH prototype) {
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
     * Name: NNBDKJNOIKH
     * </pre>
     *
     * Protobuf type {@code NNBDKJNOIKH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NNBDKJNOIKH)
        emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.internal_static_NNBDKJNOIKH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.internal_static_NNBDKJNOIKH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.class, emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.newBuilder()
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
        kJEEOAODKJG_ = false;

        serverGameTime_ = 0L;

        isWin_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.internal_static_NNBDKJNOIKH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH build() {
        emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH buildPartial() {
        emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH result = new emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH(this);
        result.kJEEOAODKJG_ = kJEEOAODKJG_;
        result.serverGameTime_ = serverGameTime_;
        result.isWin_ = isWin_;
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
        if (other instanceof emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH) {
          return mergeFrom((emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH other) {
        if (other == emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH.getDefaultInstance()) return this;
        if (other.getKJEEOAODKJG() != false) {
          setKJEEOAODKJG(other.getKJEEOAODKJG());
        }
        if (other.getServerGameTime() != 0L) {
          setServerGameTime(other.getServerGameTime());
        }
        if (other.getIsWin() != false) {
          setIsWin(other.getIsWin());
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
        emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean kJEEOAODKJG_ ;
      /**
       * <code>bool KJEEOAODKJG = 9;</code>
       * @return The kJEEOAODKJG.
       */
      @java.lang.Override
      public boolean getKJEEOAODKJG() {
        return kJEEOAODKJG_;
      }
      /**
       * <code>bool KJEEOAODKJG = 9;</code>
       * @param value The kJEEOAODKJG to set.
       * @return This builder for chaining.
       */
      public Builder setKJEEOAODKJG(boolean value) {
        
        kJEEOAODKJG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KJEEOAODKJG = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearKJEEOAODKJG() {
        
        kJEEOAODKJG_ = false;
        onChanged();
        return this;
      }

      private long serverGameTime_ ;
      /**
       * <code>uint64 server_game_time = 5;</code>
       * @return The serverGameTime.
       */
      @java.lang.Override
      public long getServerGameTime() {
        return serverGameTime_;
      }
      /**
       * <code>uint64 server_game_time = 5;</code>
       * @param value The serverGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerGameTime(long value) {
        
        serverGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 server_game_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerGameTime() {
        
        serverGameTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean isWin_ ;
      /**
       * <code>bool is_win = 7;</code>
       * @return The isWin.
       */
      @java.lang.Override
      public boolean getIsWin() {
        return isWin_;
      }
      /**
       * <code>bool is_win = 7;</code>
       * @param value The isWin to set.
       * @return This builder for chaining.
       */
      public Builder setIsWin(boolean value) {
        
        isWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_win = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWin() {
        
        isWin_ = false;
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


      // @@protoc_insertion_point(builder_scope:NNBDKJNOIKH)
    }

    // @@protoc_insertion_point(class_scope:NNBDKJNOIKH)
    private static final emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH();
    }

    public static emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NNBDKJNOIKH>
        PARSER = new com.google.protobuf.AbstractParser<NNBDKJNOIKH>() {
      @java.lang.Override
      public NNBDKJNOIKH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NNBDKJNOIKH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NNBDKJNOIKH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NNBDKJNOIKH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NNBDKJNOIKHOuterClass.NNBDKJNOIKH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NNBDKJNOIKH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NNBDKJNOIKH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NNBDKJNOIKH.proto\"L\n\013NNBDKJNOIKH\022\023\n\013KJ" +
      "EEOAODKJG\030\t \001(\010\022\030\n\020server_game_time\030\005 \001(" +
      "\004\022\016\n\006is_win\030\007 \001(\010B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NNBDKJNOIKH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NNBDKJNOIKH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NNBDKJNOIKH_descriptor,
        new java.lang.String[] { "KJEEOAODKJG", "ServerGameTime", "IsWin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
