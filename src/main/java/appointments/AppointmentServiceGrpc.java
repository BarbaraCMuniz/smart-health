package appointments;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: appointments.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final String SERVICE_NAME = "appointments.AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AppointmentsOuterClass.Empty,
      AppointmentsOuterClass.Doctors> getGetDoctorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctors",
      requestType = AppointmentsOuterClass.Empty.class,
      responseType = AppointmentsOuterClass.Doctors.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentsOuterClass.Empty,
      AppointmentsOuterClass.Doctors> getGetDoctorsMethod() {
    io.grpc.MethodDescriptor<AppointmentsOuterClass.Empty, AppointmentsOuterClass.Doctors> getGetDoctorsMethod;
    if ((getGetDoctorsMethod = AppointmentServiceGrpc.getGetDoctorsMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetDoctorsMethod = AppointmentServiceGrpc.getGetDoctorsMethod) == null) {
          AppointmentServiceGrpc.getGetDoctorsMethod = getGetDoctorsMethod =
              io.grpc.MethodDescriptor.<AppointmentsOuterClass.Empty, AppointmentsOuterClass.Doctors>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Doctors.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetDoctors"))
              .build();
        }
      }
    }
    return getGetDoctorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentsOuterClass.DoctorName,
      AppointmentsOuterClass.Appointments> getGetDoctorAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDoctorAvailability",
      requestType = AppointmentsOuterClass.DoctorName.class,
      responseType = AppointmentsOuterClass.Appointments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentsOuterClass.DoctorName,
      AppointmentsOuterClass.Appointments> getGetDoctorAvailabilityMethod() {
    io.grpc.MethodDescriptor<AppointmentsOuterClass.DoctorName, AppointmentsOuterClass.Appointments> getGetDoctorAvailabilityMethod;
    if ((getGetDoctorAvailabilityMethod = AppointmentServiceGrpc.getGetDoctorAvailabilityMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetDoctorAvailabilityMethod = AppointmentServiceGrpc.getGetDoctorAvailabilityMethod) == null) {
          AppointmentServiceGrpc.getGetDoctorAvailabilityMethod = getGetDoctorAvailabilityMethod =
              io.grpc.MethodDescriptor.<AppointmentsOuterClass.DoctorName, AppointmentsOuterClass.Appointments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDoctorAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.DoctorName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Appointments.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetDoctorAvailability"))
              .build();
        }
      }
    }
    return getGetDoctorAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment,
      AppointmentsOuterClass.Empty> getScheduleAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleAppointment",
      requestType = AppointmentsOuterClass.Appointment.class,
      responseType = AppointmentsOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment,
      AppointmentsOuterClass.Empty> getScheduleAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment, AppointmentsOuterClass.Empty> getScheduleAppointmentMethod;
    if ((getScheduleAppointmentMethod = AppointmentServiceGrpc.getScheduleAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getScheduleAppointmentMethod = AppointmentServiceGrpc.getScheduleAppointmentMethod) == null) {
          AppointmentServiceGrpc.getScheduleAppointmentMethod = getScheduleAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentsOuterClass.Appointment, AppointmentsOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("ScheduleAppointment"))
              .build();
        }
      }
    }
    return getScheduleAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment,
      AppointmentsOuterClass.Empty> getCancelAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAppointment",
      requestType = AppointmentsOuterClass.Appointment.class,
      responseType = AppointmentsOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment,
      AppointmentsOuterClass.Empty> getCancelAppointmentMethod() {
    io.grpc.MethodDescriptor<AppointmentsOuterClass.Appointment, AppointmentsOuterClass.Empty> getCancelAppointmentMethod;
    if ((getCancelAppointmentMethod = AppointmentServiceGrpc.getCancelAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getCancelAppointmentMethod = AppointmentServiceGrpc.getCancelAppointmentMethod) == null) {
          AppointmentServiceGrpc.getCancelAppointmentMethod = getCancelAppointmentMethod =
              io.grpc.MethodDescriptor.<AppointmentsOuterClass.Appointment, AppointmentsOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Appointment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AppointmentsOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("CancelAppointment"))
              .build();
        }
      }
    }
    return getCancelAppointmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub>() {
        @Override
        public AppointmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceStub(channel, callOptions);
        }
      };
    return AppointmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub>() {
        @Override
        public AppointmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AppointmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub>() {
        @Override
        public AppointmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceFutureStub(channel, callOptions);
        }
      };
    return AppointmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppointmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDoctors(AppointmentsOuterClass.Empty request,
                           io.grpc.stub.StreamObserver<AppointmentsOuterClass.Doctors> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorsMethod(), responseObserver);
    }

    /**
     */
    public void getDoctorAvailability(AppointmentsOuterClass.DoctorName request,
                                      io.grpc.stub.StreamObserver<AppointmentsOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorAvailabilityMethod(), responseObserver);
    }

    /**
     */
    public void scheduleAppointment(AppointmentsOuterClass.Appointment request,
                                    io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleAppointmentMethod(), responseObserver);
    }

    /**
     */
    public void cancelAppointment(AppointmentsOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAppointmentMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDoctorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AppointmentsOuterClass.Empty,
                AppointmentsOuterClass.Doctors>(
                  this, METHODID_GET_DOCTORS)))
          .addMethod(
            getGetDoctorAvailabilityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AppointmentsOuterClass.DoctorName,
                AppointmentsOuterClass.Appointments>(
                  this, METHODID_GET_DOCTOR_AVAILABILITY)))
          .addMethod(
            getScheduleAppointmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AppointmentsOuterClass.Appointment,
                AppointmentsOuterClass.Empty>(
                  this, METHODID_SCHEDULE_APPOINTMENT)))
          .addMethod(
            getCancelAppointmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                AppointmentsOuterClass.Appointment,
                AppointmentsOuterClass.Empty>(
                  this, METHODID_CANCEL_APPOINTMENT)))
          .build();
    }
  }

  /**
   */
  public static final class AppointmentServiceStub extends io.grpc.stub.AbstractAsyncStub<AppointmentServiceStub> {
    private AppointmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDoctors(AppointmentsOuterClass.Empty request,
                           io.grpc.stub.StreamObserver<AppointmentsOuterClass.Doctors> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDoctorAvailability(AppointmentsOuterClass.DoctorName request,
                                      io.grpc.stub.StreamObserver<AppointmentsOuterClass.Appointments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scheduleAppointment(AppointmentsOuterClass.Appointment request,
                                    io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelAppointment(AppointmentsOuterClass.Appointment request,
                                  io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppointmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public AppointmentsOuterClass.Doctors getDoctors(AppointmentsOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public AppointmentsOuterClass.Appointments getDoctorAvailability(AppointmentsOuterClass.DoctorName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public AppointmentsOuterClass.Empty scheduleAppointment(AppointmentsOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleAppointmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public AppointmentsOuterClass.Empty cancelAppointment(AppointmentsOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAppointmentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppointmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected AppointmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AppointmentsOuterClass.Doctors> getDoctors(
        AppointmentsOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AppointmentsOuterClass.Appointments> getDoctorAvailability(
        AppointmentsOuterClass.DoctorName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AppointmentsOuterClass.Empty> scheduleAppointment(
        AppointmentsOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleAppointmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AppointmentsOuterClass.Empty> cancelAppointment(
        AppointmentsOuterClass.Appointment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCTORS = 0;
  private static final int METHODID_GET_DOCTOR_AVAILABILITY = 1;
  private static final int METHODID_SCHEDULE_APPOINTMENT = 2;
  private static final int METHODID_CANCEL_APPOINTMENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppointmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppointmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCTORS:
          serviceImpl.getDoctors((AppointmentsOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<AppointmentsOuterClass.Doctors>) responseObserver);
          break;
        case METHODID_GET_DOCTOR_AVAILABILITY:
          serviceImpl.getDoctorAvailability((AppointmentsOuterClass.DoctorName) request,
              (io.grpc.stub.StreamObserver<AppointmentsOuterClass.Appointments>) responseObserver);
          break;
        case METHODID_SCHEDULE_APPOINTMENT:
          serviceImpl.scheduleAppointment((AppointmentsOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_APPOINTMENT:
          serviceImpl.cancelAppointment((AppointmentsOuterClass.Appointment) request,
              (io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AppointmentsOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppointmentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getGetDoctorsMethod())
              .addMethod(getGetDoctorAvailabilityMethod())
              .addMethod(getScheduleAppointmentMethod())
              .addMethod(getCancelAppointmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
