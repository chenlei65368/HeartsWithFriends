// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Login.proto

package org.bitcoma.hearts.model.transfered;

public final class LoginProtos {
  private LoginProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string identifier = 1;
    boolean hasIdentifier();
    String getIdentifier();
    
    // optional string password = 2;
    boolean hasPassword();
    String getPassword();
  }
  public static final class LoginRequest extends
      com.google.protobuf.GeneratedMessage
      implements LoginRequestOrBuilder {
    // Use LoginRequest.newBuilder() to construct.
    private LoginRequest(Builder builder) {
      super(builder);
    }
    private LoginRequest(boolean noInit) {}
    
    private static final LoginRequest defaultInstance;
    public static LoginRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoginRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string identifier = 1;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private Object identifier_;
    public boolean hasIdentifier() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getIdentifier() {
      Object ref = identifier_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          identifier_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdentifierBytes() {
      Object ref = identifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string password = 2;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private Object password_;
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getPassword() {
      Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          password_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      identifier_ = "";
      password_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdentifierBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPasswordBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdentifierBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPasswordBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginRequest_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        identifier_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        password_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest build() {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest buildPartial() {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest result = new org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identifier_ = identifier_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest other) {
        if (other == org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.getDefaultInstance()) return this;
        if (other.hasIdentifier()) {
          setIdentifier(other.getIdentifier());
        }
        if (other.hasPassword()) {
          setPassword(other.getPassword());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              identifier_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              password_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string identifier = 1;
      private Object identifier_ = "";
      public boolean hasIdentifier() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getIdentifier() {
        Object ref = identifier_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          identifier_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIdentifier(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identifier_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }
      void setIdentifier(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        identifier_ = value;
        onChanged();
      }
      
      // optional string password = 2;
      private Object password_ = "";
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getPassword() {
        Object ref = password_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPassword(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00000002);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      void setPassword(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:hearts.LoginRequest)
    }
    
    static {
      defaultInstance = new LoginRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.LoginRequest)
  }
  
  public interface LoginResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint64 user_id = 1;
    boolean hasUserId();
    long getUserId();
  }
  public static final class LoginResponse extends
      com.google.protobuf.GeneratedMessage
      implements LoginResponseOrBuilder {
    // Use LoginResponse.newBuilder() to construct.
    private LoginResponse(Builder builder) {
      super(builder);
    }
    private LoginResponse(boolean noInit) {}
    
    private static final LoginResponse defaultInstance;
    public static LoginResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoginResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint64 user_id = 1;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getUserId() {
      return userId_;
    }
    
    private void initFields() {
      userId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, userId_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, userId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.internal_static_hearts_LoginResponse_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        userId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse build() {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse buildPartial() {
        org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse result = new org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userId_ = userId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse other) {
        if (other == org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.getDefaultInstance()) return this;
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              userId_ = input.readUInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint64 user_id = 1;
      private long userId_ ;
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getUserId() {
        return userId_;
      }
      public Builder setUserId(long value) {
        bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:hearts.LoginResponse)
    }
    
    static {
      defaultInstance = new LoginResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.LoginResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_LoginRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_LoginRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_LoginResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_LoginResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Login.proto\022\006hearts\032\025GenericResponse.p" +
      "roto\"4\n\014LoginRequest\022\022\n\nidentifier\030\001 \001(\t" +
      "\022\020\n\010password\030\002 \001(\t\" \n\rLoginResponse\022\017\n\007u" +
      "ser_id\030\001 \001(\004B4\n#org.bitcoma.hearts.model" +
      ".transferedB\013LoginProtosH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hearts_LoginRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hearts_LoginRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_LoginRequest_descriptor,
              new java.lang.String[] { "Identifier", "Password", },
              org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.class,
              org.bitcoma.hearts.model.transfered.LoginProtos.LoginRequest.Builder.class);
          internal_static_hearts_LoginResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hearts_LoginResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_LoginResponse_descriptor,
              new java.lang.String[] { "UserId", },
              org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.class,
              org.bitcoma.hearts.model.transfered.LoginProtos.LoginResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.bitcoma.hearts.model.transfered.GenericProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
