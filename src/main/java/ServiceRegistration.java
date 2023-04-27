import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;
import java.util.logging.Logger;

public class ServiceRegistration implements Runnable {

    private MonitoringService monitoringService;
    private AppointmentService appointmentService;
    private ServiceRegistration registrationService;

    ServiceRegistration() {
        setMonitoringService(new MonitoringService());
        setAppointmentService(new AppointmentService());
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(ServiceRegistration.class.getName());
        try {
            JmDNS jmdns;
            jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo appointment = ServiceInfo.create("_grpc._tcp.local.", "Appointment Service", 3001, "path=/appointment");
            ServiceInfo monitoring = ServiceInfo.create("_grpc._tcp.local.", "Monitoring Service", 5678, "path=/monitoring");
            ServiceInfo registration_service = ServiceInfo.create("_grpc._tcp.local.", "Registration Service", 9012, "path=/registration");

            // Register the services
            jmdns.registerService(appointment);
            jmdns.registerService(monitoring);
            jmdns.registerService(registration_service);


        } catch (Exception e) {
            logger.warning("Cannot get local host " + e.getMessage());
            System.exit(1);
        }
    }

	public MonitoringService getMonitoringService() {
		return monitoringService;
	}

	public void setMonitoringService(MonitoringService monitoringService) {
		this.monitoringService = monitoringService;
	}

	public AppointmentService getAppointmentService() {
		return appointmentService;
	}

	public void setAppointmentService(AppointmentService appointmentService) {
		this.appointmentService = appointmentService;
	}

	public ServiceRegistration getRegistrationService() {
		return registrationService;
	}

	public void setRegistrationService(ServiceRegistration registrationService) {
		this.registrationService = registrationService;
	}
}
