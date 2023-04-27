package ui;

import clients.Patient;
import clients.RegistrationClient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class DoctorDashboard extends JFrame implements ActionListener {
    private JTable patientTable;
    private JScrollPane patientScrollPane;
    private JButton scheduleButton;
    private JButton cancelButton;
    private JButton updateButton;
    private JButton deleteButton;
    private RegistrationClient client;
    Patient[] patients;

    public DoctorDashboard() {
        client = new RegistrationClient();
        // Set up the main frame
        setTitle("Doctor Dashboard");
        setLayout(new BorderLayout());
        setSize(1024, 800);
        // Set up the title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Doctor Dashboard");
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
        titlePanel.add(titleLabel);
        add(titlePanel, BorderLayout.NORTH);

        // Set up the button panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));

        // Set up the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        scheduleButton = new JButton("Schedule Appointment");
        scheduleButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        scheduleButton.addActionListener(this);
        cancelButton = new JButton("View Appointments");
        cancelButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        cancelButton.addActionListener(this);

        updateButton = new JButton("Update Patient Data");
        updateButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        updateButton.addActionListener(this);
        buttonPanel.add(updateButton);
        deleteButton = new JButton("Delete Patient Data");
        deleteButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        deleteButton.addActionListener(this);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);

        // Set up the patient table
        String[] columns = {"ID", "User", "Email", "Phone Number", "Address", "Date of Birth", "Blood Type", "Height", "Weight"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        patientTable = new JTable(model);
        patientScrollPane = new JScrollPane(patientTable);
        add(patientScrollPane, BorderLayout.CENTER);

        topPanel.add(cancelButton);
        topPanel.add(scheduleButton);


        // Show the main frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(1024, 800);


        // Load patients into the table
        loadPatients();
    }


    private void loadPatients() {
        patients = client.getPatients();
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for (Patient patient : patients) {
            model.addRow(new Object[]{patient.getId(), patient.getName(), patient.getEmail(), patient.getPhoneNumber(), patient.getAddress(), patient.getDateOfBirth(), patient.getBloodType(), patient.getHeight(), patient.getWeight()});
        }

    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == scheduleButton) {
            // Show the schedule appointment screen
            new ScheduleAppointment();

        } else if (e.getSource() == cancelButton) {
            // Show the cancel appointment screen
            new CancelAppointmentScreen();
        } else if (e.getSource() == updateButton) {
           // get selected row index
              int selectedRowIndex = patientTable.getSelectedRow();
                // get selected row data
                String id = patientTable.getModel().getValueAt(selectedRowIndex, 0).toString();
                String name = patientTable.getModel().getValueAt(selectedRowIndex, 1).toString();
                String email = patientTable.getModel().getValueAt(selectedRowIndex, 2).toString();
                String phoneNumber = patientTable.getModel().getValueAt(selectedRowIndex, 3).toString();
                String address = patientTable.getModel().getValueAt(selectedRowIndex, 4).toString();
                String dateOfBirth = patientTable.getModel().getValueAt(selectedRowIndex, 5).toString();
                String bloodType = patientTable.getModel().getValueAt(selectedRowIndex, 6).toString();
                String height = patientTable.getModel().getValueAt(selectedRowIndex, 7).toString();
                String weight = patientTable.getModel().getValueAt(selectedRowIndex, 8).toString();

                // Show the update patient screen
                Patient patient = patients[selectedRowIndex];
                patient.setAddress(address);
                patient.setEmail(email);
                patient.setName(name);
                patient.setPhoneNumber(phoneNumber);
                patient.setDateOfBirth(dateOfBirth);
                patient.setBloodType(bloodType);
                patient.setHeight(Float.parseFloat(height));
                patient.setWeight(Float.parseFloat(weight));

                client.updatePatient(patient);

        } else if (e.getSource() == deleteButton) {
            // get selected row index
            int selectedRowIndex = patientTable.getSelectedRow();
            // get selected row data
            int id = patients[selectedRowIndex].getId();
            // delete the patient
            client.deletePatient(id);

            // remove selected row from the model
            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
            model.removeRow(selectedRowIndex);

        }
    }

    public static void main(String[] args) {
        new DoctorDashboard();
    }
    
}
