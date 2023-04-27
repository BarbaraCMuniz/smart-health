import io.grpc.stub.StreamObserver;
import monitoring.MonitoringGrpc;
import monitoring.MonitoringOuterClass;

public class MonitoringService extends MonitoringGrpc.MonitoringImplBase {
    @Override
    public void getPastAppointments(MonitoringOuterClass.PatientId request, StreamObserver<MonitoringOuterClass.Appointments> responseObserver) {
        super.getPastAppointments(request, responseObserver);
    }

    @Override
    public void getFutureAppointments(MonitoringOuterClass.PatientId request, StreamObserver<MonitoringOuterClass.Appointments> responseObserver) {
        super.getFutureAppointments(request, responseObserver);
    }

    @Override
    public void getTestResults(MonitoringOuterClass.PatientId request, StreamObserver<MonitoringOuterClass.TestResult> responseObserver) {
        super.getTestResults(request, responseObserver);
    }

    @Override
    public void getMedication(MonitoringOuterClass.PatientId request, StreamObserver<MonitoringOuterClass.Medications> responseObserver) {
        super.getMedication(request, responseObserver);
    }

    @Override
    public void setReminder(MonitoringOuterClass.Reminder request, StreamObserver<MonitoringOuterClass.Empty> responseObserver) {
        super.setReminder(request, responseObserver);
    }

    @Override
    public void openChat(MonitoringOuterClass.ChatMessage request, StreamObserver<MonitoringOuterClass.ChatMessage> responseObserver) {
        super.openChat(request, responseObserver);
    }

    @Override
    public void getNotifications(MonitoringOuterClass.Empty request, StreamObserver<MonitoringOuterClass.Notifications> responseObserver) {
        super.getNotifications(request, responseObserver);
    }
}
