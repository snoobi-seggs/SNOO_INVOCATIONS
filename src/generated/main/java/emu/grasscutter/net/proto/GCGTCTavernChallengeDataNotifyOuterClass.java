// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernChallengeDataNotify.proto

package emu.grasscutter.net.proto;

public final class GCGTCTavernChallengeDataNotifyOuterClass {
  private GCGTCTavernChallengeDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernChallengeDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernChallengeDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> 
        getTavernChallengeListList();
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallengeList(int index);
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    int getTavernChallengeListCount();
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
        getTavernChallengeListOrBuilderList();
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: HNPEJFPHAEH
   * CmdId: 7429
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernChallengeDataNotify}
   */
  public static final class GCGTCTavernChallengeDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernChallengeDataNotify)
      GCGTCTavernChallengeDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernChallengeDataNotify.newBuilder() to construct.
    private GCGTCTavernChallengeDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernChallengeDataNotify() {
      tavernChallengeList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernChallengeDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCTavernChallengeDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tavernChallengeList_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData>();
                mutable_bitField0_ |= 0x00000001;
              }
              tavernChallengeList_.add(
                  input.readMessage(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          tavernChallengeList_ = java.util.Collections.unmodifiableList(tavernChallengeList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.internal_static_GCGTCTavernChallengeDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.internal_static_GCGTCTavernChallengeDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.class, emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.Builder.class);
    }

    public static final int TAVERN_CHALLENGE_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> tavernChallengeList_;
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> getTavernChallengeListList() {
      return tavernChallengeList_;
    }
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
        getTavernChallengeListOrBuilderList() {
      return tavernChallengeList_;
    }
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    @java.lang.Override
    public int getTavernChallengeListCount() {
      return tavernChallengeList_.size();
    }
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallengeList(int index) {
      return tavernChallengeList_.get(index);
    }
    /**
     * <pre>
     *CGJDJJLIADJ ELDJDEJEJML snooswap
     * </pre>
     *
     * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeListOrBuilder(
        int index) {
      return tavernChallengeList_.get(index);
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
      for (int i = 0; i < tavernChallengeList_.size(); i++) {
        output.writeMessage(6, tavernChallengeList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < tavernChallengeList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, tavernChallengeList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify other = (emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify) obj;

      if (!getTavernChallengeListList()
          .equals(other.getTavernChallengeListList())) return false;
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
      if (getTavernChallengeListCount() > 0) {
        hash = (37 * hash) + TAVERN_CHALLENGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTavernChallengeListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify prototype) {
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
     * Name: HNPEJFPHAEH
     * CmdId: 7429
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernChallengeDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernChallengeDataNotify)
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.internal_static_GCGTCTavernChallengeDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.internal_static_GCGTCTavernChallengeDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.class, emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.newBuilder()
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
          getTavernChallengeListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tavernChallengeListBuilder_ == null) {
          tavernChallengeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          tavernChallengeListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.internal_static_GCGTCTavernChallengeDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify build() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify buildPartial() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify result = new emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (tavernChallengeListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            tavernChallengeList_ = java.util.Collections.unmodifiableList(tavernChallengeList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.tavernChallengeList_ = tavernChallengeList_;
        } else {
          result.tavernChallengeList_ = tavernChallengeListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify other) {
        if (other == emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify.getDefaultInstance()) return this;
        if (tavernChallengeListBuilder_ == null) {
          if (!other.tavernChallengeList_.isEmpty()) {
            if (tavernChallengeList_.isEmpty()) {
              tavernChallengeList_ = other.tavernChallengeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTavernChallengeListIsMutable();
              tavernChallengeList_.addAll(other.tavernChallengeList_);
            }
            onChanged();
          }
        } else {
          if (!other.tavernChallengeList_.isEmpty()) {
            if (tavernChallengeListBuilder_.isEmpty()) {
              tavernChallengeListBuilder_.dispose();
              tavernChallengeListBuilder_ = null;
              tavernChallengeList_ = other.tavernChallengeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              tavernChallengeListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTavernChallengeListFieldBuilder() : null;
            } else {
              tavernChallengeListBuilder_.addAllMessages(other.tavernChallengeList_);
            }
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
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> tavernChallengeList_ =
        java.util.Collections.emptyList();
      private void ensureTavernChallengeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tavernChallengeList_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData>(tavernChallengeList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> tavernChallengeListBuilder_;

      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> getTavernChallengeListList() {
        if (tavernChallengeListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tavernChallengeList_);
        } else {
          return tavernChallengeListBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public int getTavernChallengeListCount() {
        if (tavernChallengeListBuilder_ == null) {
          return tavernChallengeList_.size();
        } else {
          return tavernChallengeListBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallengeList(int index) {
        if (tavernChallengeListBuilder_ == null) {
          return tavernChallengeList_.get(index);
        } else {
          return tavernChallengeListBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder setTavernChallengeList(
          int index, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.set(index, value);
          onChanged();
        } else {
          tavernChallengeListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder setTavernChallengeList(
          int index, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (tavernChallengeListBuilder_ == null) {
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.set(index, builderForValue.build());
          onChanged();
        } else {
          tavernChallengeListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder addTavernChallengeList(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.add(value);
          onChanged();
        } else {
          tavernChallengeListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder addTavernChallengeList(
          int index, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.add(index, value);
          onChanged();
        } else {
          tavernChallengeListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder addTavernChallengeList(
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (tavernChallengeListBuilder_ == null) {
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.add(builderForValue.build());
          onChanged();
        } else {
          tavernChallengeListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder addTavernChallengeList(
          int index, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (tavernChallengeListBuilder_ == null) {
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.add(index, builderForValue.build());
          onChanged();
        } else {
          tavernChallengeListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder addAllTavernChallengeList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData> values) {
        if (tavernChallengeListBuilder_ == null) {
          ensureTavernChallengeListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, tavernChallengeList_);
          onChanged();
        } else {
          tavernChallengeListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder clearTavernChallengeList() {
        if (tavernChallengeListBuilder_ == null) {
          tavernChallengeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          tavernChallengeListBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public Builder removeTavernChallengeList(int index) {
        if (tavernChallengeListBuilder_ == null) {
          ensureTavernChallengeListIsMutable();
          tavernChallengeList_.remove(index);
          onChanged();
        } else {
          tavernChallengeListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder getTavernChallengeListBuilder(
          int index) {
        return getTavernChallengeListFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeListOrBuilder(
          int index) {
        if (tavernChallengeListBuilder_ == null) {
          return tavernChallengeList_.get(index);  } else {
          return tavernChallengeListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
           getTavernChallengeListOrBuilderList() {
        if (tavernChallengeListBuilder_ != null) {
          return tavernChallengeListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tavernChallengeList_);
        }
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder addTavernChallengeListBuilder() {
        return getTavernChallengeListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance());
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder addTavernChallengeListBuilder(
          int index) {
        return getTavernChallengeListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance());
      }
      /**
       * <pre>
       *CGJDJJLIADJ ELDJDEJEJML snooswap
       * </pre>
       *
       * <code>repeated .GCGTCTavernChallengeData tavern_challenge_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder> 
           getTavernChallengeListBuilderList() {
        return getTavernChallengeListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
          getTavernChallengeListFieldBuilder() {
        if (tavernChallengeListBuilder_ == null) {
          tavernChallengeListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder>(
                  tavernChallengeList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          tavernChallengeList_ = null;
        }
        return tavernChallengeListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernChallengeDataNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernChallengeDataNotify)
    private static final emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify();
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernChallengeDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernChallengeDataNotify>() {
      @java.lang.Override
      public GCGTCTavernChallengeDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCTavernChallengeDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCTavernChallengeDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernChallengeDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataNotifyOuterClass.GCGTCTavernChallengeDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernChallengeDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernChallengeDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$GCGTCTavernChallengeDataNotify.proto\032\036" +
      "GCGTCTavernChallengeData.proto\"Z\n\036GCGTCT" +
      "avernChallengeDataNotify\0228\n\025tavern_chall" +
      "enge_list\030\006 \003(\0132\031.GCGTCTavernChallengeDa" +
      "taB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGTCTavernChallengeDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernChallengeDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernChallengeDataNotify_descriptor,
        new java.lang.String[] { "TavernChallengeList", });
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}