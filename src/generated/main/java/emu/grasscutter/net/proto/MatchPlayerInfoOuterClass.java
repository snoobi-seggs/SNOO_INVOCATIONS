// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MatchPlayerInfo.proto

package emu.grasscutter.net.proto;

public final class MatchPlayerInfoOuterClass {
  private MatchPlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MatchPlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MatchPlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agreed = 3;</code>
     * @return The isAgreed.
     */
    boolean getIsAgreed();

    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     * @return The playerInfo.
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder();
  }
  /**
   * <pre>
   * Name: DKFNMCMGENJ
   * </pre>
   *
   * Protobuf type {@code MatchPlayerInfo}
   */
  public static final class MatchPlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MatchPlayerInfo)
      MatchPlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MatchPlayerInfo.newBuilder() to construct.
    private MatchPlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MatchPlayerInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MatchPlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MatchPlayerInfo(
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

              isAgreed_ = input.readBool();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
              if (playerInfo_ != null) {
                subBuilder = playerInfo_.toBuilder();
              }
              playerInfo_ = input.readMessage(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playerInfo_);
                playerInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.internal_static_MatchPlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.internal_static_MatchPlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.class, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder.class);
    }

    public static final int IS_AGREED_FIELD_NUMBER = 3;
    private boolean isAgreed_;
    /**
     * <code>bool is_agreed = 3;</code>
     * @return The isAgreed.
     */
    @java.lang.Override
    public boolean getIsAgreed() {
      return isAgreed_;
    }

    public static final int PLAYER_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo playerInfo_;
    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo() {
      return playerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo player_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
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
      if (isAgreed_ != false) {
        output.writeBool(3, isAgreed_);
      }
      if (playerInfo_ != null) {
        output.writeMessage(7, getPlayerInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgreed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isAgreed_);
      }
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getPlayerInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo other = (emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo) obj;

      if (getIsAgreed()
          != other.getIsAgreed()) return false;
      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
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
      hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgreed());
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo prototype) {
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
     * Name: DKFNMCMGENJ
     * </pre>
     *
     * Protobuf type {@code MatchPlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MatchPlayerInfo)
        emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.internal_static_MatchPlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.internal_static_MatchPlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.class, emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.newBuilder()
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
        isAgreed_ = false;

        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.internal_static_MatchPlayerInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo build() {
        emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo buildPartial() {
        emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo result = new emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo(this);
        result.isAgreed_ = isAgreed_;
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo other) {
        if (other == emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo.getDefaultInstance()) return this;
        if (other.getIsAgreed() != false) {
          setIsAgreed(other.getIsAgreed());
        }
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
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
        emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgreed_ ;
      /**
       * <code>bool is_agreed = 3;</code>
       * @return The isAgreed.
       */
      @java.lang.Override
      public boolean getIsAgreed() {
        return isAgreed_;
      }
      /**
       * <code>bool is_agreed = 3;</code>
       * @param value The isAgreed to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgreed(boolean value) {
        
        isAgreed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agreed = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgreed() {
        
        isAgreed_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> playerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       * @return The playerInfo.
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public Builder setPlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public Builder setPlayerInfo(
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public Builder mergePlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo player_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MatchPlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:MatchPlayerInfo)
    private static final emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo();
    }

    public static emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MatchPlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<MatchPlayerInfo>() {
      @java.lang.Override
      public MatchPlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MatchPlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MatchPlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MatchPlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MatchPlayerInfoOuterClass.MatchPlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MatchPlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MatchPlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MatchPlayerInfo.proto\032\026OnlinePlayerInf" +
      "o.proto\"L\n\017MatchPlayerInfo\022\021\n\tis_agreed\030" +
      "\003 \001(\010\022&\n\013player_info\030\007 \001(\0132\021.OnlinePlaye" +
      "rInfoB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_MatchPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MatchPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MatchPlayerInfo_descriptor,
        new java.lang.String[] { "IsAgreed", "PlayerInfo", });
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
