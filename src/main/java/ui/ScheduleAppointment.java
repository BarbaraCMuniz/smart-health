package ui;

import clients.Appointment;
import clients.AppointmentDatabaseClient;

import javax.swing.*;
import java.awt.*;

public class ScheduleAppointment extends JFrame {

    private JTextField patientNameField;
    private JTextField dateField;
    private JTextField timeField;
    private JTextField locationField;
    private JTextArea notesArea;

    private AppointmentDatabaseClient client;

    public ScheduleAppointment() {
        client = new AppointmentDatabaseClient();
        // Set up the main frame
        setTitle("Schedule Appointment");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        // Set up the title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Schedule Appointment");
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Set up the form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel patientNameLabel = new JLabel("Patient ID:");
        patientNameField = new JTextField();
        JLabel dateLabel = new JLabel("Name:");
        dateField = new JTextField();
        JLabel timeLabel = new JLabel("Date - Time:");
        timeField = new JTextField();
        JLabel locationLabel = new JLabel("Location:");
        locationField = new JTextField();
        JLabel notesLabel = new JLabel("Notes:");
        notesArea = new JTextArea();
        notesArea.setLineWrap(true);
        notesArea.setWrapStyleWord(true);
        JScrollPane notesScrollPane = new JScrollPane(notesArea);
        notesScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        formPanel.add(patientNameLabel);
        formPanel.add(patientNameField);
        formPanel.add(dateLabel);
        formPanel.add(dateField);
        formPanel.add(timeLabel);
        formPanel.add(timeField);
        formPanel.add(locationLabel);
        formPanel.add(locationField);
        formPanel.add(notesLabel);
        formPanel.add(notesScrollPane);
        add(formPanel, BorderLayout.CENTER);

        // Set up the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            Appointment appointment = new Appointment();
            appointment.setPatientId(Integer.parseInt(patientNameField.getText()));
            appointment.setDate(dateField.getText());
            appointment.setTime(timeField.getText());
            appointment.setLocation(locationField.getText());
            appointment.setNotes(notesArea.getText());
            client.createAppointment(appointment);
            dispose();
        });
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> {
            dispose();
        });
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Show the main frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScheduleAppointment();
    }
}
