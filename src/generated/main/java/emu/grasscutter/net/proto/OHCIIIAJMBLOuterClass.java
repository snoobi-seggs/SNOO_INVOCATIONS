// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OHCIIIAJMBL.proto

package emu.grasscutter.net.proto;

public final class OHCIIIAJMBLOuterClass {
  private OHCIIIAJMBLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OHCIIIAJMBLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OHCIIIAJMBL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BGNPOHJEBKA = 14;</code>
     * @return The bGNPOHJEBKA.
     */
    int getBGNPOHJEBKA();

    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    int getDOBMECNALEPCount();
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    boolean containsDOBMECNALEP(
        int key);
    /**
     * Use {@link #getDOBMECNALEPMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getDOBMECNALEP();
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getDOBMECNALEPMap();
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */

    int getDOBMECNALEPOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */

    int getDOBMECNALEPOrThrow(
        int key);

    /**
     * <code>uint32 JKEPCIPFGLD = 7;</code>
     * @return The jKEPCIPFGLD.
     */
    int getJKEPCIPFGLD();
  }
  /**
   * <pre>
   * Name: OHCIIIAJMBL
   * </pre>
   *
   * Protobuf type {@code OHCIIIAJMBL}
   */
  public static final class OHCIIIAJMBL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OHCIIIAJMBL)
      OHCIIIAJMBLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OHCIIIAJMBL.newBuilder() to construct.
    private OHCIIIAJMBL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OHCIIIAJMBL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OHCIIIAJMBL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OHCIIIAJMBL(
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
            case 56: {

              jKEPCIPFGLD_ = input.readUInt32();
              break;
            }
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dOBMECNALEP_ = com.google.protobuf.MapField.newMapField(
                    DOBMECNALEPDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              dOBMECNALEP__ = input.readMessage(
                  DOBMECNALEPDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              dOBMECNALEP_.getMutableMap().put(
                  dOBMECNALEP__.getKey(), dOBMECNALEP__.getValue());
              break;
            }
            case 112: {

              bGNPOHJEBKA_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetDOBMECNALEP();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.class, emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.Builder.class);
    }

    public static final int BGNPOHJEBKA_FIELD_NUMBER = 14;
    private int bGNPOHJEBKA_;
    /**
     * <code>uint32 BGNPOHJEBKA = 14;</code>
     * @return The bGNPOHJEBKA.
     */
    @java.lang.Override
    public int getBGNPOHJEBKA() {
      return bGNPOHJEBKA_;
    }

    public static final int DOBMECNALEP_FIELD_NUMBER = 11;
    private static final class DOBMECNALEPDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> dOBMECNALEP_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetDOBMECNALEP() {
      if (dOBMECNALEP_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DOBMECNALEPDefaultEntryHolder.defaultEntry);
      }
      return dOBMECNALEP_;
    }

    public int getDOBMECNALEPCount() {
      return internalGetDOBMECNALEP().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */

    @java.lang.Override
    public boolean containsDOBMECNALEP(
        int key) {
      
      return internalGetDOBMECNALEP().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDOBMECNALEPMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getDOBMECNALEP() {
      return getDOBMECNALEPMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getDOBMECNALEPMap() {
      return internalGetDOBMECNALEP().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    @java.lang.Override

    public int getDOBMECNALEPOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetDOBMECNALEP().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
     */
    @java.lang.Override

    public int getDOBMECNALEPOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetDOBMECNALEP().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int JKEPCIPFGLD_FIELD_NUMBER = 7;
    private int jKEPCIPFGLD_;
    /**
     * <code>uint32 JKEPCIPFGLD = 7;</code>
     * @return The jKEPCIPFGLD.
     */
    @java.lang.Override
    public int getJKEPCIPFGLD() {
      return jKEPCIPFGLD_;
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
      if (jKEPCIPFGLD_ != 0) {
        output.writeUInt32(7, jKEPCIPFGLD_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetDOBMECNALEP(),
          DOBMECNALEPDefaultEntryHolder.defaultEntry,
          11);
      if (bGNPOHJEBKA_ != 0) {
        output.writeUInt32(14, bGNPOHJEBKA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jKEPCIPFGLD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, jKEPCIPFGLD_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetDOBMECNALEP().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        dOBMECNALEP__ = DOBMECNALEPDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(11, dOBMECNALEP__);
      }
      if (bGNPOHJEBKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, bGNPOHJEBKA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL other = (emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL) obj;

      if (getBGNPOHJEBKA()
          != other.getBGNPOHJEBKA()) return false;
      if (!internalGetDOBMECNALEP().equals(
          other.internalGetDOBMECNALEP())) return false;
      if (getJKEPCIPFGLD()
          != other.getJKEPCIPFGLD()) return false;
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
      hash = (37 * hash) + BGNPOHJEBKA_FIELD_NUMBER;
      hash = (53 * hash) + getBGNPOHJEBKA();
      if (!internalGetDOBMECNALEP().getMap().isEmpty()) {
        hash = (37 * hash) + DOBMECNALEP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetDOBMECNALEP().hashCode();
      }
      hash = (37 * hash) + JKEPCIPFGLD_FIELD_NUMBER;
      hash = (53 * hash) + getJKEPCIPFGLD();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL prototype) {
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
     * Name: OHCIIIAJMBL
     * </pre>
     *
     * Protobuf type {@code OHCIIIAJMBL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OHCIIIAJMBL)
        emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetDOBMECNALEP();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetMutableDOBMECNALEP();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.class, emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.newBuilder()
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
        bGNPOHJEBKA_ = 0;

        internalGetMutableDOBMECNALEP().clear();
        jKEPCIPFGLD_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.internal_static_OHCIIIAJMBL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL build() {
        emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL buildPartial() {
        emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL result = new emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL(this);
        int from_bitField0_ = bitField0_;
        result.bGNPOHJEBKA_ = bGNPOHJEBKA_;
        result.dOBMECNALEP_ = internalGetDOBMECNALEP();
        result.dOBMECNALEP_.makeImmutable();
        result.jKEPCIPFGLD_ = jKEPCIPFGLD_;
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
        if (other instanceof emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL) {
          return mergeFrom((emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL other) {
        if (other == emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL.getDefaultInstance()) return this;
        if (other.getBGNPOHJEBKA() != 0) {
          setBGNPOHJEBKA(other.getBGNPOHJEBKA());
        }
        internalGetMutableDOBMECNALEP().mergeFrom(
            other.internalGetDOBMECNALEP());
        if (other.getJKEPCIPFGLD() != 0) {
          setJKEPCIPFGLD(other.getJKEPCIPFGLD());
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
        emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int bGNPOHJEBKA_ ;
      /**
       * <code>uint32 BGNPOHJEBKA = 14;</code>
       * @return The bGNPOHJEBKA.
       */
      @java.lang.Override
      public int getBGNPOHJEBKA() {
        return bGNPOHJEBKA_;
      }
      /**
       * <code>uint32 BGNPOHJEBKA = 14;</code>
       * @param value The bGNPOHJEBKA to set.
       * @return This builder for chaining.
       */
      public Builder setBGNPOHJEBKA(int value) {
        
        bGNPOHJEBKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BGNPOHJEBKA = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBGNPOHJEBKA() {
        
        bGNPOHJEBKA_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> dOBMECNALEP_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetDOBMECNALEP() {
        if (dOBMECNALEP_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              DOBMECNALEPDefaultEntryHolder.defaultEntry);
        }
        return dOBMECNALEP_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableDOBMECNALEP() {
        onChanged();;
        if (dOBMECNALEP_ == null) {
          dOBMECNALEP_ = com.google.protobuf.MapField.newMapField(
              DOBMECNALEPDefaultEntryHolder.defaultEntry);
        }
        if (!dOBMECNALEP_.isMutable()) {
          dOBMECNALEP_ = dOBMECNALEP_.copy();
        }
        return dOBMECNALEP_;
      }

      public int getDOBMECNALEPCount() {
        return internalGetDOBMECNALEP().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */

      @java.lang.Override
      public boolean containsDOBMECNALEP(
          int key) {
        
        return internalGetDOBMECNALEP().getMap().containsKey(key);
      }
      /**
       * Use {@link #getDOBMECNALEPMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getDOBMECNALEP() {
        return getDOBMECNALEPMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getDOBMECNALEPMap() {
        return internalGetDOBMECNALEP().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */
      @java.lang.Override

      public int getDOBMECNALEPOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetDOBMECNALEP().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */
      @java.lang.Override

      public int getDOBMECNALEPOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetDOBMECNALEP().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearDOBMECNALEP() {
        internalGetMutableDOBMECNALEP().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */

      public Builder removeDOBMECNALEP(
          int key) {
        
        internalGetMutableDOBMECNALEP().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableDOBMECNALEP() {
        return internalGetMutableDOBMECNALEP().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */
      public Builder putDOBMECNALEP(
          int key,
          int value) {
        
        
        internalGetMutableDOBMECNALEP().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; DOBMECNALEP = 11;</code>
       */

      public Builder putAllDOBMECNALEP(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableDOBMECNALEP().getMutableMap()
            .putAll(values);
        return this;
      }

      private int jKEPCIPFGLD_ ;
      /**
       * <code>uint32 JKEPCIPFGLD = 7;</code>
       * @return The jKEPCIPFGLD.
       */
      @java.lang.Override
      public int getJKEPCIPFGLD() {
        return jKEPCIPFGLD_;
      }
      /**
       * <code>uint32 JKEPCIPFGLD = 7;</code>
       * @param value The jKEPCIPFGLD to set.
       * @return This builder for chaining.
       */
      public Builder setJKEPCIPFGLD(int value) {
        
        jKEPCIPFGLD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKEPCIPFGLD = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKEPCIPFGLD() {
        
        jKEPCIPFGLD_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OHCIIIAJMBL)
    }

    // @@protoc_insertion_point(class_scope:OHCIIIAJMBL)
    private static final emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL();
    }

    public static emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OHCIIIAJMBL>
        PARSER = new com.google.protobuf.AbstractParser<OHCIIIAJMBL>() {
      @java.lang.Override
      public OHCIIIAJMBL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OHCIIIAJMBL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OHCIIIAJMBL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OHCIIIAJMBL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OHCIIIAJMBLOuterClass.OHCIIIAJMBL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OHCIIIAJMBL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OHCIIIAJMBL_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OHCIIIAJMBL.proto\"\237\001\n\013OHCIIIAJMBL\022\023\n\013B" +
      "GNPOHJEBKA\030\016 \001(\r\0222\n\013DOBMECNALEP\030\013 \003(\0132\035." +
      "OHCIIIAJMBL.DOBMECNALEPEntry\022\023\n\013JKEPCIPF" +
      "GLD\030\007 \001(\r\0322\n\020DOBMECNALEPEntry\022\013\n\003key\030\001 \001" +
      "(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OHCIIIAJMBL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OHCIIIAJMBL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OHCIIIAJMBL_descriptor,
        new java.lang.String[] { "BGNPOHJEBKA", "DOBMECNALEP", "JKEPCIPFGLD", });
    internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_descriptor =
      internal_static_OHCIIIAJMBL_descriptor.getNestedTypes().get(0);
    internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OHCIIIAJMBL_DOBMECNALEPEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
