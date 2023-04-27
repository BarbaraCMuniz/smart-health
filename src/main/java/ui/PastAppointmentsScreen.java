package ui;

import javax.swing.*;
import java.util.List;

public class PastAppointmentsScreen {

    public PastAppointmentsScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // Add the label and the appointments to the panel
        panel.add(new JLabel("Past Appointments"));
        DefaultListModel<String> appointmentListModel = new DefaultListModel<>();
        JList<String> appointmentList = new JList<>(appointmentListModel);
        panel.add(new JScrollPane(appointmentList));

        // Create the frame and add the panel
        JFrame frame = new JFrame("Past Appointments");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        // Set the appointments
        setAppointments(List.of(
                "2023-02-08 - 11:30 AM - CityCenter Clinic",
                "2023-03-15 - 3:00 PM - SouthSide Clinic",
                "2023-04-02 - 8:00 AM - NorthSide Clinic"
        ), appointmentListModel);
    }

    private void setAppointments(List<String> appointments, DefaultListModel<String> appointmentListModel) {
        appointmentListModel.clear();
        for (String appointment : appointments) {
            appointmentListModel.addElement(appointment);
        }
    }
}
