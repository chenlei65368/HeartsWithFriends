// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignupRequest.proto

package org.bitcoma.heartserver.model.transfered;

public final class SignupProtos {
  private SignupProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SignupRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string email = 1;
    boolean hasEmail();
    String getEmail();
    
    // optional string password = 2;
    boolean hasPassword();
    String getPassword();
  }
  public static final class SignupRequest extends
      com.google.protobuf.GeneratedMessage
      implements SignupRequestOrBuilder {
    // Use SignupRequest.newBuilder() to construct.
    private SignupRequest(Builder builder) {
      super(builder);
    }
    private SignupRequest(boolean noInit) {}
    
    private static final SignupRequest defaultInstance;
    public static SignupRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public SignupRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.heartserver.model.transfered.SignupProtos.internal_static_heartserver_SignupRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.heartserver.model.transfered.SignupProtos.internal_static_heartserver_SignupRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string email = 1;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private Object email_;
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getEmail() {
      Object ref = email_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          email_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEmailBytes() {
      Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        email_ = b;
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
      email_ = "";
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
        output.writeBytes(1, getEmailBytes());
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
          .computeBytesSize(1, getEmailBytes());
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
    
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseDelimitedFrom(
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
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest prototype) {
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
       implements org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.heartserver.model.transfered.SignupProtos.internal_static_heartserver_SignupRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.heartserver.model.transfered.SignupProtos.internal_static_heartserver_SignupRequest_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.newBuilder()
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
        email_ = "";
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
        return org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.getDescriptor();
      }
      
      public org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest getDefaultInstanceForType() {
        return org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.getDefaultInstance();
      }
      
      public org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest build() {
        org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest buildPartial() {
        org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest result = new org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.email_ = email_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest) {
          return mergeFrom((org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest other) {
        if (other == org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.getDefaultInstance()) return this;
        if (other.hasEmail()) {
          setEmail(other.getEmail());
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
              email_ = input.readBytes();
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
      
      // optional string email = 1;
      private Object email_ = "";
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getEmail() {
        Object ref = email_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEmail(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        email_ = value;
        onChanged();
        return this;
      }
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000001);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      void setEmail(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        email_ = value;
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
      
      // @@protoc_insertion_point(builder_scope:heartserver.SignupRequest)
    }
    
    static {
      defaultInstance = new SignupRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:heartserver.SignupRequest)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_heartserver_SignupRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_heartserver_SignupRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SignupRequest.proto\022\013heartserver\"0\n\rSi" +
      "gnupRequest\022\r\n\005email\030\001 \001(\t\022\020\n\010password\030\002" +
      " \001(\tB:\n(org.bitcoma.heartserver.model.tr" +
      "ansferedB\014SignupProtosH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_heartserver_SignupRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_heartserver_SignupRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_heartserver_SignupRequest_descriptor,
              new java.lang.String[] { "Email", "Password", },
              org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.class,
              org.bitcoma.heartserver.model.transfered.SignupProtos.SignupRequest.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
