package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MonitoringDashboard {
    
    private JButton pastApptButton;
    private JButton futureApptButton;
    private JButton testResultsButton;
    private JButton medicationButton;
    private JButton reminderButton;
    private JButton notificationsButton;
    
    public MonitoringDashboard() {
        // Create the UI components
        pastApptButton = new JButton("Past Appointments");
        futureApptButton = new JButton("Future Appointments");
        testResultsButton = new JButton("Test Results");
        medicationButton = new JButton("Medication");
        reminderButton = new JButton("Set Reminder");
        notificationsButton = new JButton("Notifications");
        
        // Add action listeners to the buttons
        pastApptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the GetPastAppointments() method of the Monitoring service
                new PastAppointmentsScreen();
            }
        });
        
        futureApptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the GetFutureAppointments() method of the Monitoring service
                new FutureAppointmentsScreen();
            }
        });
        
        testResultsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the GetTestResults() method of the Monitoring service
                new TestResultsScreen();
            }
        });
        
        medicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the GetMedication() method of the Monitoring service
                new MedicationScreen();
            }
        });
        
        reminderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open a dialog box to allow the user to set a reminder
                // and call the SetReminder() method of the Monitoring service
                new SetReminderScreen();
            }
        });
        
        notificationsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the GetNotifications() method of the Monitoring service
                new NotificationsScreen();
            }
        });
        
        // Create the panel and add the UI components
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(pastApptButton, constraints);
        constraints.gridx = 1;
        panel.add(futureApptButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(testResultsButton, constraints);
        constraints.gridx = 1;
        panel.add(medicationButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(reminderButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        panel.add(notificationsButton, constraints);
        
        // Create the frame and add the panel
        JFrame frame = new JFrame("Monitoring Dashboard");
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
