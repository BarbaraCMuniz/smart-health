import appointments.AppointmentServiceGrpc;
import appointments.AppointmentsOuterClass;

public class AppointmentService extends AppointmentServiceGrpc.AppointmentServiceImplBase {
    @Override
    public void getDoctors(AppointmentsOuterClass.Empty request, io.grpc.stub.StreamObserver<AppointmentsOuterClass.Doctors> responseObserver) {
        super.getDoctors(request, responseObserver);
    }

    @Override
    public void getDoctorAvailability(AppointmentsOuterClass.DoctorName request, io.grpc.stub.StreamObserver<AppointmentsOuterClass.Appointments> responseObserver) {
        super.getDoctorAvailability(request, responseObserver);
    }

    @Override
    public void scheduleAppointment(AppointmentsOuterClass.Appointment request, io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
        super.scheduleAppointment(request, responseObserver);
    }

    @Override
    public void cancelAppointment(AppointmentsOuterClass.Appointment request, io.grpc.stub.StreamObserver<AppointmentsOuterClass.Empty> responseObserver) {
        super.cancelAppointment(request, responseObserver);
    }
}
