package clients;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import monitoring.MonitoringGrpc;
import monitoring.MonitoringOuterClass;

public class MonitoringClient {
    private final MonitoringGrpc.MonitoringStub stub;

    public MonitoringClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.stub = MonitoringGrpc.newStub(channel);
    }

    public void getPastAppointments(String patientId) {
        MonitoringOuterClass.PatientId request = MonitoringOuterClass.PatientId.newBuilder()
                .setId(Integer.parseInt(patientId))
                .build();

        this.stub.getPastAppointments(request, new StreamObserver<MonitoringOuterClass.Appointments>() {
            @Override
            public void onNext(MonitoringOuterClass.Appointments appointments) {
                System.out.println("Received past appointments: " + appointments);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error getting past appointments: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished getting past appointments");
            }
        });
    }

    public void getFutureAppointments(String patientId) {
        MonitoringOuterClass.PatientId request = MonitoringOuterClass.PatientId.newBuilder()
                .setId(Integer.parseInt(patientId))
                .build();

        this.stub.getFutureAppointments(request, new StreamObserver<MonitoringOuterClass.Appointments>() {
            @Override
            public void onNext(MonitoringOuterClass.Appointments appointments) {
                System.out.println("Received future appointments: " + appointments);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error getting future appointments: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished getting future appointments");
            }
        });
    }

    public void getTestResults(String patientId) {
        MonitoringOuterClass.PatientId request = MonitoringOuterClass.PatientId.newBuilder()
                .setId(Integer.parseInt(patientId))
                .build();

        this.stub.getTestResults(request, new StreamObserver<MonitoringOuterClass.TestResult>() {
            @Override
            public void onNext(MonitoringOuterClass.TestResult testResult) {
                System.out.println("Received test result: " + testResult);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error getting test results: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished getting test results");
            }
        });
    }

    public void getMedication(String patientId) {
        MonitoringOuterClass.PatientId request = MonitoringOuterClass.PatientId.newBuilder()
                .setId(Integer.parseInt(patientId))
                .build();

        this.stub.getMedication(request, new StreamObserver<MonitoringOuterClass.Medications>() {
            @Override
            public void onNext(MonitoringOuterClass.Medications medications) {
                System.out.println("Received medications: " + medications);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error getting medication: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished getting medication");
            }
        });
    }

    public void setReminder(String patientId, String reminder) {
        MonitoringOuterClass.Reminder request = MonitoringOuterClass.Reminder.newBuilder()
                .setMessage(reminder)
                .build();

        this.stub.setReminder(request, new StreamObserver<MonitoringOuterClass.Empty>() {
            @Override
            public void onNext(MonitoringOuterClass.Empty empty) {
                System.out.println("Received empty response: " + empty);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error setting reminder: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished setting reminder");
            }
        });
    }

    public void openChat(String patientId, String message) {
        MonitoringOuterClass.ChatMessage request = MonitoringOuterClass.ChatMessage.newBuilder()
                .setMessage(message)
                .build();

        this.stub.openChat(request, new StreamObserver<MonitoringOuterClass.ChatMessage>() {
            @Override
            public void onNext(MonitoringOuterClass.ChatMessage chatMessage) {
                System.out.println("Received chat message: " + chatMessage);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error opening chat: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished opening chat");
            }
        });
    }

}