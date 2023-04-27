package clients;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import appointments.AppointmentServiceGrpc;
import appointments.AppointmentsOuterClass;
import monitoring.MonitoringGrpc;
import monitoring.MonitoringOuterClass;

import java.util.concurrent.TimeUnit;

public class AppointmentClient {
    private final ManagedChannel channel;
    private final MonitoringGrpc.MonitoringBlockingStub monitoringBlockingStub;
    private final AppointmentServiceGrpc.AppointmentServiceBlockingStub appointmentServiceBlockingStub;

    public AppointmentClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        monitoringBlockingStub = MonitoringGrpc.newBlockingStub(channel);
        appointmentServiceBlockingStub = AppointmentServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getPastAppointments(MonitoringOuterClass.PatientId request) {
        MonitoringOuterClass.Appointments response = monitoringBlockingStub.getPastAppointments(request);
        System.out.println("Past Appointments: " + response);
    }

    public void getFutureAppointments(MonitoringOuterClass.PatientId request) {
        MonitoringOuterClass.Appointments response = monitoringBlockingStub.getFutureAppointments(request);
        System.out.println("Future Appointments: " + response);
    }

    public void getTestResults(MonitoringOuterClass.PatientId request) {
        MonitoringOuterClass.TestResult response = monitoringBlockingStub.getTestResults(request);
        System.out.println("Test Results: " + response);
    }

    public void getMedication(MonitoringOuterClass.PatientId request) {
        MonitoringOuterClass.Medications response = monitoringBlockingStub.getMedication(request);
        System.out.println("Medication: " + response);
    }

    public void setReminder(MonitoringOuterClass.Reminder request) {
        MonitoringOuterClass.Empty response = monitoringBlockingStub.setReminder(request);
        System.out.println("Reminder Set: " + response);
    }


    public void getDoctors(AppointmentsOuterClass.Empty request) {
        AppointmentsOuterClass.Doctors response = appointmentServiceBlockingStub.getDoctors(request);
        System.out.println("Doctors: " + response);
    }

    public void getDoctorAvailability(AppointmentsOuterClass.DoctorName request) {
        AppointmentsOuterClass.Appointments response = appointmentServiceBlockingStub.getDoctorAvailability(request);
        System.out.println("Doctor Availability: " + response);
    }

    public void scheduleAppointment(AppointmentsOuterClass.Appointment request) {
        AppointmentsOuterClass.Empty response = appointmentServiceBlockingStub.scheduleAppointment(request);
        System.out.println("Appointment Scheduled: " + response);
    }

    public void cancelAppointment(AppointmentsOuterClass.Appointment request) {
        AppointmentsOuterClass.Empty response = appointmentServiceBlockingStub.cancelAppointment(request);
        System.out.println("Appointment Cancelled: " + response);
    }
}
