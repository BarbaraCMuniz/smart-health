package monitoring;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: monitoring.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MonitoringGrpc {

  private MonitoringGrpc() {}

  public static final String SERVICE_NAME = "monitoring.Monitoring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Appointments> getGetPastAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPastAppointments",
      requestType = monitoring.MonitoringOuterClass.PatientId.class,
      responseType = monitoring.MonitoringOuterClass.Appointments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Appointments> getGetPastAppointmentsMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Appointments> getGetPastAppointmentsMethod;
    if ((getGetPastAppointmentsMethod = MonitoringGrpc.getGetPastAppointmentsMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getGetPastAppointmentsMethod = MonitoringGrpc.getGetPastAppointmentsMethod) == null) {
          MonitoringGrpc.getGetPastAppointmentsMethod = getGetPastAppointmentsMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Appointments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPastAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.PatientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Appointments.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("GetPastAppointments"))
              .build();
        }
      }
    }
    return getGetPastAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Appointments> getGetFutureAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFutureAppointments",
      requestType = monitoring.MonitoringOuterClass.PatientId.class,
      responseType = monitoring.MonitoringOuterClass.Appointments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Appointments> getGetFutureAppointmentsMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Appointments> getGetFutureAppointmentsMethod;
    if ((getGetFutureAppointmentsMethod = MonitoringGrpc.getGetFutureAppointmentsMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getGetFutureAppointmentsMethod = MonitoringGrpc.getGetFutureAppointmentsMethod) == null) {
          MonitoringGrpc.getGetFutureAppointmentsMethod = getGetFutureAppointmentsMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Appointments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFutureAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.PatientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Appointments.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("GetFutureAppointments"))
              .build();
        }
      }
    }
    return getGetFutureAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.TestResult> getGetTestResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTestResults",
      requestType = monitoring.MonitoringOuterClass.PatientId.class,
      responseType = monitoring.MonitoringOuterClass.TestResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.TestResult> getGetTestResultsMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.TestResult> getGetTestResultsMethod;
    if ((getGetTestResultsMethod = MonitoringGrpc.getGetTestResultsMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getGetTestResultsMethod = MonitoringGrpc.getGetTestResultsMethod) == null) {
          MonitoringGrpc.getGetTestResultsMethod = getGetTestResultsMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.TestResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTestResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.PatientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.TestResult.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("GetTestResults"))
              .build();
        }
      }
    }
    return getGetTestResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Medications> getGetMedicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedication",
      requestType = monitoring.MonitoringOuterClass.PatientId.class,
      responseType = monitoring.MonitoringOuterClass.Medications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId,
      monitoring.MonitoringOuterClass.Medications> getGetMedicationMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Medications> getGetMedicationMethod;
    if ((getGetMedicationMethod = MonitoringGrpc.getGetMedicationMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getGetMedicationMethod = MonitoringGrpc.getGetMedicationMethod) == null) {
          MonitoringGrpc.getGetMedicationMethod = getGetMedicationMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.PatientId, monitoring.MonitoringOuterClass.Medications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.PatientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Medications.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("GetMedication"))
              .build();
        }
      }
    }
    return getGetMedicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Reminder,
      monitoring.MonitoringOuterClass.Empty> getSetReminderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReminder",
      requestType = monitoring.MonitoringOuterClass.Reminder.class,
      responseType = monitoring.MonitoringOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Reminder,
      monitoring.MonitoringOuterClass.Empty> getSetReminderMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Reminder, monitoring.MonitoringOuterClass.Empty> getSetReminderMethod;
    if ((getSetReminderMethod = MonitoringGrpc.getSetReminderMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getSetReminderMethod = MonitoringGrpc.getSetReminderMethod) == null) {
          MonitoringGrpc.getSetReminderMethod = getSetReminderMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.Reminder, monitoring.MonitoringOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReminder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Reminder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("SetReminder"))
              .build();
        }
      }
    }
    return getSetReminderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.ChatMessage,
      monitoring.MonitoringOuterClass.ChatMessage> getOpenChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenChat",
      requestType = monitoring.MonitoringOuterClass.ChatMessage.class,
      responseType = monitoring.MonitoringOuterClass.ChatMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.ChatMessage,
      monitoring.MonitoringOuterClass.ChatMessage> getOpenChatMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.ChatMessage, monitoring.MonitoringOuterClass.ChatMessage> getOpenChatMethod;
    if ((getOpenChatMethod = MonitoringGrpc.getOpenChatMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getOpenChatMethod = MonitoringGrpc.getOpenChatMethod) == null) {
          MonitoringGrpc.getOpenChatMethod = getOpenChatMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.ChatMessage, monitoring.MonitoringOuterClass.ChatMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.ChatMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("OpenChat"))
              .build();
        }
      }
    }
    return getOpenChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Empty,
      monitoring.MonitoringOuterClass.Notifications> getGetNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotifications",
      requestType = monitoring.MonitoringOuterClass.Empty.class,
      responseType = monitoring.MonitoringOuterClass.Notifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Empty,
      monitoring.MonitoringOuterClass.Notifications> getGetNotificationsMethod() {
    io.grpc.MethodDescriptor<monitoring.MonitoringOuterClass.Empty, monitoring.MonitoringOuterClass.Notifications> getGetNotificationsMethod;
    if ((getGetNotificationsMethod = MonitoringGrpc.getGetNotificationsMethod) == null) {
      synchronized (MonitoringGrpc.class) {
        if ((getGetNotificationsMethod = MonitoringGrpc.getGetNotificationsMethod) == null) {
          MonitoringGrpc.getGetNotificationsMethod = getGetNotificationsMethod =
              io.grpc.MethodDescriptor.<monitoring.MonitoringOuterClass.Empty, monitoring.MonitoringOuterClass.Notifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  monitoring.MonitoringOuterClass.Notifications.getDefaultInstance()))
              .setSchemaDescriptor(new MonitoringMethodDescriptorSupplier("GetNotifications"))
              .build();
        }
      }
    }
    return getGetNotificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitoringStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringStub>() {
        @java.lang.Override
        public MonitoringStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringStub(channel, callOptions);
        }
      };
    return MonitoringStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitoringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringBlockingStub>() {
        @java.lang.Override
        public MonitoringBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringBlockingStub(channel, callOptions);
        }
      };
    return MonitoringBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitoringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitoringFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitoringFutureStub>() {
        @java.lang.Override
        public MonitoringFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitoringFutureStub(channel, callOptions);
        }
      };
    return MonitoringFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MonitoringImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPastAppointments(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPastAppointmentsMethod(), responseObserver);
    }

    /**
     */
    public void getFutureAppointments(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFutureAppointmentsMethod(), responseObserver);
    }

    /**
     */
    public void getTestResults(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.TestResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTestResultsMethod(), responseObserver);
    }

    /**
     */
    public void getMedication(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Medications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicationMethod(), responseObserver);
    }

    /**
     */
    public void setReminder(monitoring.MonitoringOuterClass.Reminder request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetReminderMethod(), responseObserver);
    }

    /**
     */
    public void openChat(monitoring.MonitoringOuterClass.ChatMessage request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.ChatMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenChatMethod(), responseObserver);
    }

    /**
     */
    public void getNotifications(monitoring.MonitoringOuterClass.Empty request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Notifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPastAppointmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.PatientId,
                monitoring.MonitoringOuterClass.Appointments>(
                  this, METHODID_GET_PAST_APPOINTMENTS)))
          .addMethod(
            getGetFutureAppointmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.PatientId,
                monitoring.MonitoringOuterClass.Appointments>(
                  this, METHODID_GET_FUTURE_APPOINTMENTS)))
          .addMethod(
            getGetTestResultsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.PatientId,
                monitoring.MonitoringOuterClass.TestResult>(
                  this, METHODID_GET_TEST_RESULTS)))
          .addMethod(
            getGetMedicationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.PatientId,
                monitoring.MonitoringOuterClass.Medications>(
                  this, METHODID_GET_MEDICATION)))
          .addMethod(
            getSetReminderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.Reminder,
                monitoring.MonitoringOuterClass.Empty>(
                  this, METHODID_SET_REMINDER)))
          .addMethod(
            getOpenChatMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.ChatMessage,
                monitoring.MonitoringOuterClass.ChatMessage>(
                  this, METHODID_OPEN_CHAT)))
          .addMethod(
            getGetNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                monitoring.MonitoringOuterClass.Empty,
                monitoring.MonitoringOuterClass.Notifications>(
                  this, METHODID_GET_NOTIFICATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class MonitoringStub extends io.grpc.stub.AbstractAsyncStub<MonitoringStub> {
    private MonitoringStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringStub(channel, callOptions);
    }

    /**
     */
    public void getPastAppointments(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPastAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFutureAppointments(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFutureAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTestResults(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.TestResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTestResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMedication(monitoring.MonitoringOuterClass.PatientId request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Medications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setReminder(monitoring.MonitoringOuterClass.Reminder request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetReminderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openChat(monitoring.MonitoringOuterClass.ChatMessage request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.ChatMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNotifications(monitoring.MonitoringOuterClass.Empty request,
        io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Notifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MonitoringBlockingStub extends io.grpc.stub.AbstractBlockingStub<MonitoringBlockingStub> {
    private MonitoringBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringBlockingStub(channel, callOptions);
    }

    /**
     */
    public monitoring.MonitoringOuterClass.Appointments getPastAppointments(monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPastAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public monitoring.MonitoringOuterClass.Appointments getFutureAppointments(monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFutureAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public monitoring.MonitoringOuterClass.TestResult getTestResults(monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTestResultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public monitoring.MonitoringOuterClass.Medications getMedication(monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public monitoring.MonitoringOuterClass.Empty setReminder(monitoring.MonitoringOuterClass.Reminder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetReminderMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<monitoring.MonitoringOuterClass.ChatMessage> openChat(
        monitoring.MonitoringOuterClass.ChatMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<monitoring.MonitoringOuterClass.Notifications> getNotifications(
        monitoring.MonitoringOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MonitoringFutureStub extends io.grpc.stub.AbstractFutureStub<MonitoringFutureStub> {
    private MonitoringFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitoringFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitoringFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<monitoring.MonitoringOuterClass.Appointments> getPastAppointments(
        monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPastAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<monitoring.MonitoringOuterClass.Appointments> getFutureAppointments(
        monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFutureAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<monitoring.MonitoringOuterClass.TestResult> getTestResults(
        monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTestResultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<monitoring.MonitoringOuterClass.Medications> getMedication(
        monitoring.MonitoringOuterClass.PatientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<monitoring.MonitoringOuterClass.Empty> setReminder(
        monitoring.MonitoringOuterClass.Reminder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetReminderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PAST_APPOINTMENTS = 0;
  private static final int METHODID_GET_FUTURE_APPOINTMENTS = 1;
  private static final int METHODID_GET_TEST_RESULTS = 2;
  private static final int METHODID_GET_MEDICATION = 3;
  private static final int METHODID_SET_REMINDER = 4;
  private static final int METHODID_OPEN_CHAT = 5;
  private static final int METHODID_GET_NOTIFICATIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitoringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitoringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PAST_APPOINTMENTS:
          serviceImpl.getPastAppointments((monitoring.MonitoringOuterClass.PatientId) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments>) responseObserver);
          break;
        case METHODID_GET_FUTURE_APPOINTMENTS:
          serviceImpl.getFutureAppointments((monitoring.MonitoringOuterClass.PatientId) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Appointments>) responseObserver);
          break;
        case METHODID_GET_TEST_RESULTS:
          serviceImpl.getTestResults((monitoring.MonitoringOuterClass.PatientId) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.TestResult>) responseObserver);
          break;
        case METHODID_GET_MEDICATION:
          serviceImpl.getMedication((monitoring.MonitoringOuterClass.PatientId) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Medications>) responseObserver);
          break;
        case METHODID_SET_REMINDER:
          serviceImpl.setReminder((monitoring.MonitoringOuterClass.Reminder) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Empty>) responseObserver);
          break;
        case METHODID_OPEN_CHAT:
          serviceImpl.openChat((monitoring.MonitoringOuterClass.ChatMessage) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.ChatMessage>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATIONS:
          serviceImpl.getNotifications((monitoring.MonitoringOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<monitoring.MonitoringOuterClass.Notifications>) responseObserver);
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

  private static abstract class MonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitoringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return monitoring.MonitoringOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Monitoring");
    }
  }

  private static final class MonitoringFileDescriptorSupplier
      extends MonitoringBaseDescriptorSupplier {
    MonitoringFileDescriptorSupplier() {}
  }

  private static final class MonitoringMethodDescriptorSupplier
      extends MonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitoringMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitoringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitoringFileDescriptorSupplier())
              .addMethod(getGetPastAppointmentsMethod())
              .addMethod(getGetFutureAppointmentsMethod())
              .addMethod(getGetTestResultsMethod())
              .addMethod(getGetMedicationMethod())
              .addMethod(getSetReminderMethod())
              .addMethod(getOpenChatMethod())
              .addMethod(getGetNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
