package ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FutureAppointmentsScreen {

    public FutureAppointmentsScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // Add the label and the appointments to the panel
        panel.add(new JLabel("Future Appointments"));
        DefaultListModel<String> appointmentListModel = new DefaultListModel<>();
        JList<String> appointmentList = new JList<>(appointmentListModel);
        panel.add(new JScrollPane(appointmentList));

        // Create the frame and add the panel
        JFrame frame = new JFrame("Future Appointments");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        // Set the appointments
        setAppointments(List.of(
                "2023-05-12 - 10:30 AM - SouthSide Clinic",
                "2023-06-03 - 2:00 PM - NorthSide Clinic",
                "2023-07-21 - 9:00 AM - CityCenter Clinic"
        ), appointmentListModel);
    }

    private void setAppointments(List<String> appointments, DefaultListModel<String> appointmentListModel) {
        appointmentListModel.clear();
        for (String appointment : appointments) {
            appointmentListModel.addElement(appointment);
        }
    }
}
