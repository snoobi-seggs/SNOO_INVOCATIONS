// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OJCCNDLGFNI.proto

package emu.grasscutter.net.proto;

public final class OJCCNDLGFNIOuterClass {
  private OJCCNDLGFNIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OJCCNDLGFNIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OJCCNDLGFNI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
     * @return The enum numeric value on the wire for kMMJNGOOAJM.
     */
    int getKMMJNGOOAJMValue();
    /**
     * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
     * @return The kMMJNGOOAJM.
     */
    emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP getKMMJNGOOAJM();
  }
  /**
   * <pre>
   * Name: OJCCNDLGFNI
   * CmdId: 7002
   * </pre>
   *
   * Protobuf type {@code OJCCNDLGFNI}
   */
  public static final class OJCCNDLGFNI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OJCCNDLGFNI)
      OJCCNDLGFNIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OJCCNDLGFNI.newBuilder() to construct.
    private OJCCNDLGFNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OJCCNDLGFNI() {
      kMMJNGOOAJM_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OJCCNDLGFNI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OJCCNDLGFNI(
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
              int rawValue = input.readEnum();

              kMMJNGOOAJM_ = rawValue;
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
      return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.internal_static_OJCCNDLGFNI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.internal_static_OJCCNDLGFNI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.class, emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.Builder.class);
    }

    /**
     * <pre>
     * Name: MEFIOHIAAJP
     * </pre>
     *
     * Protobuf enum {@code OJCCNDLGFNI.MEFIOHIAAJP}
     */
    public enum MEFIOHIAAJP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>MEFIOHIAAJP_NOILKPDEDBD = 0;</code>
       */
      MEFIOHIAAJP_NOILKPDEDBD(0),
      /**
       * <code>MEFIOHIAAJP_MCAJBBDOHGI = 1;</code>
       */
      MEFIOHIAAJP_MCAJBBDOHGI(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>MEFIOHIAAJP_NOILKPDEDBD = 0;</code>
       */
      public static final int MEFIOHIAAJP_NOILKPDEDBD_VALUE = 0;
      /**
       * <code>MEFIOHIAAJP_MCAJBBDOHGI = 1;</code>
       */
      public static final int MEFIOHIAAJP_MCAJBBDOHGI_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static MEFIOHIAAJP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MEFIOHIAAJP forNumber(int value) {
        switch (value) {
          case 0: return MEFIOHIAAJP_NOILKPDEDBD;
          case 1: return MEFIOHIAAJP_MCAJBBDOHGI;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MEFIOHIAAJP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MEFIOHIAAJP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MEFIOHIAAJP>() {
              public MEFIOHIAAJP findValueByNumber(int number) {
                return MEFIOHIAAJP.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.getDescriptor().getEnumTypes().get(0);
      }

      private static final MEFIOHIAAJP[] VALUES = values();

      public static MEFIOHIAAJP valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private MEFIOHIAAJP(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:OJCCNDLGFNI.MEFIOHIAAJP)
    }

    public static final int KMMJNGOOAJM_FIELD_NUMBER = 7;
    private int kMMJNGOOAJM_;
    /**
     * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
     * @return The enum numeric value on the wire for kMMJNGOOAJM.
     */
    @java.lang.Override public int getKMMJNGOOAJMValue() {
      return kMMJNGOOAJM_;
    }
    /**
     * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
     * @return The kMMJNGOOAJM.
     */
    @java.lang.Override public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP getKMMJNGOOAJM() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP result = emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.valueOf(kMMJNGOOAJM_);
      return result == null ? emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.UNRECOGNIZED : result;
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
      if (kMMJNGOOAJM_ != emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.MEFIOHIAAJP_NOILKPDEDBD.getNumber()) {
        output.writeEnum(7, kMMJNGOOAJM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kMMJNGOOAJM_ != emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.MEFIOHIAAJP_NOILKPDEDBD.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, kMMJNGOOAJM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI other = (emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI) obj;

      if (kMMJNGOOAJM_ != other.kMMJNGOOAJM_) return false;
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
      hash = (37 * hash) + KMMJNGOOAJM_FIELD_NUMBER;
      hash = (53 * hash) + kMMJNGOOAJM_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI prototype) {
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
     * Name: OJCCNDLGFNI
     * CmdId: 7002
     * </pre>
     *
     * Protobuf type {@code OJCCNDLGFNI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OJCCNDLGFNI)
        emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.internal_static_OJCCNDLGFNI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.internal_static_OJCCNDLGFNI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.class, emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.newBuilder()
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
        kMMJNGOOAJM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.internal_static_OJCCNDLGFNI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI build() {
        emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI buildPartial() {
        emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI result = new emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI(this);
        result.kMMJNGOOAJM_ = kMMJNGOOAJM_;
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
        if (other instanceof emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI) {
          return mergeFrom((emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI other) {
        if (other == emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.getDefaultInstance()) return this;
        if (other.kMMJNGOOAJM_ != 0) {
          setKMMJNGOOAJMValue(other.getKMMJNGOOAJMValue());
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
        emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int kMMJNGOOAJM_ = 0;
      /**
       * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
       * @return The enum numeric value on the wire for kMMJNGOOAJM.
       */
      @java.lang.Override public int getKMMJNGOOAJMValue() {
        return kMMJNGOOAJM_;
      }
      /**
       * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
       * @param value The enum numeric value on the wire for kMMJNGOOAJM to set.
       * @return This builder for chaining.
       */
      public Builder setKMMJNGOOAJMValue(int value) {
        
        kMMJNGOOAJM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
       * @return The kMMJNGOOAJM.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP getKMMJNGOOAJM() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP result = emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.valueOf(kMMJNGOOAJM_);
        return result == null ? emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP.UNRECOGNIZED : result;
      }
      /**
       * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
       * @param value The kMMJNGOOAJM to set.
       * @return This builder for chaining.
       */
      public Builder setKMMJNGOOAJM(emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI.MEFIOHIAAJP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        kMMJNGOOAJM_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.OJCCNDLGFNI.MEFIOHIAAJP KMMJNGOOAJM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearKMMJNGOOAJM() {
        
        kMMJNGOOAJM_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OJCCNDLGFNI)
    }

    // @@protoc_insertion_point(class_scope:OJCCNDLGFNI)
    private static final emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI();
    }

    public static emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OJCCNDLGFNI>
        PARSER = new com.google.protobuf.AbstractParser<OJCCNDLGFNI>() {
      @java.lang.Override
      public OJCCNDLGFNI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OJCCNDLGFNI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OJCCNDLGFNI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OJCCNDLGFNI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OJCCNDLGFNIOuterClass.OJCCNDLGFNI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OJCCNDLGFNI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OJCCNDLGFNI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OJCCNDLGFNI.proto\"\205\001\n\013OJCCNDLGFNI\022-\n\013K" +
      "MMJNGOOAJM\030\007 \001(\0162\030.OJCCNDLGFNI.MEFIOHIAA" +
      "JP\"G\n\013MEFIOHIAAJP\022\033\n\027MEFIOHIAAJP_NOILKPD" +
      "EDBD\020\000\022\033\n\027MEFIOHIAAJP_MCAJBBDOHGI\020\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OJCCNDLGFNI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OJCCNDLGFNI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OJCCNDLGFNI_descriptor,
        new java.lang.String[] { "KMMJNGOOAJM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}