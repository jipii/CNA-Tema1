package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: client.proto")
public final class ProcessGrpc {

  private ProcessGrpc() {}

  public static final String SERVICE_NAME = "Process";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Client.Request,
      proto.Client.Response> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "process",
      requestType = proto.Client.Request.class,
      responseType = proto.Client.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Client.Request,
      proto.Client.Response> getProcessMethod() {
    io.grpc.MethodDescriptor<proto.Client.Request, proto.Client.Response> getProcessMethod;
    if ((getProcessMethod = ProcessGrpc.getProcessMethod) == null) {
      synchronized (ProcessGrpc.class) {
        if ((getProcessMethod = ProcessGrpc.getProcessMethod) == null) {
          ProcessGrpc.getProcessMethod = getProcessMethod = 
              io.grpc.MethodDescriptor.<proto.Client.Request, proto.Client.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Process", "process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Client.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Client.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ProcessMethodDescriptorSupplier("process"))
                  .build();
          }
        }
     }
     return getProcessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessStub newStub(io.grpc.Channel channel) {
    return new ProcessStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProcessBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProcessFutureStub(channel);
  }

  /**
   */
  public static abstract class ProcessImplBase implements io.grpc.BindableService {

    /**
     */
    public void process(proto.Client.Request request,
        io.grpc.stub.StreamObserver<proto.Client.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Client.Request,
                proto.Client.Response>(
                  this, METHODID_PROCESS)))
          .build();
    }
  }

  /**
   */
  public static final class ProcessStub extends io.grpc.stub.AbstractStub<ProcessStub> {
    private ProcessStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessStub(channel, callOptions);
    }

    /**
     */
    public void process(proto.Client.Request request,
        io.grpc.stub.StreamObserver<proto.Client.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProcessBlockingStub extends io.grpc.stub.AbstractStub<ProcessBlockingStub> {
    private ProcessBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Client.Response process(proto.Client.Request request) {
      return blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProcessFutureStub extends io.grpc.stub.AbstractStub<ProcessFutureStub> {
    private ProcessFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProcessFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProcessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Client.Response> process(
        proto.Client.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProcessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProcessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS:
          serviceImpl.process((proto.Client.Request) request,
              (io.grpc.stub.StreamObserver<proto.Client.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProcessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Client.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Process");
    }
  }

  private static final class ProcessFileDescriptorSupplier
      extends ProcessBaseDescriptorSupplier {
    ProcessFileDescriptorSupplier() {}
  }

  private static final class ProcessMethodDescriptorSupplier
      extends ProcessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProcessMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProcessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessFileDescriptorSupplier())
              .addMethod(getProcessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
