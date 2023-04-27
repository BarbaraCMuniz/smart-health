package ui;

import clients.Appointment;
import clients.AppointmentDatabaseClient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CancelAppointmentScreen extends JFrame implements ActionListener {

    // GUI components
    private JTable appointmentsTable;
    private JButton cancelButton;
    private AppointmentDatabaseClient client;

    public CancelAppointmentScreen() {
        client = new AppointmentDatabaseClient();
        // Set up the screen
        setTitle("View Appointments");
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create GUI components
        String[] columnNames = {"Appointment ID", "Name", "Date - Time", "Location"};
        ArrayList<Appointment> appointments = client.listAppointments();

        String[][] data = new String[appointments.size()][4];
        for (int i = 0; i < appointments.size(); i++) {
            data[i][0] = String.valueOf(appointments.get(i).getId());
            data[i][1] = appointments.get(i).getDate();
            data[i][2] = appointments.get(i).getTime();
            data[i][3] = appointments.get(i).getLocation();
        }

        appointmentsTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(appointmentsTable);
        cancelButton = new JButton("Cancel Selected Appointment");

        // Add components to the screen
        add(scrollPane, BorderLayout.CENTER);
        add(cancelButton, BorderLayout.SOUTH);
        cancelButton.addActionListener(this); // Add ActionListener to the button

        setVisible(true);
        setLocationRelativeTo(null);
    }

    // ActionListener for the "Cancel Selected Appointment" button
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected row from the table
        int row = appointmentsTable.getSelectedRow();
        if (row == -1) {

            // If no row is selected, display an error message
            JOptionPane.showMessageDialog(this, "Please select an appointment to cancel.");
        } else {
            // Get the appointment ID from the selected row
            String appointmentId = (String) appointmentsTable.getValueAt(row, 0);
            // Cancel the appointment
            client.deleteAppointment(Integer.parseInt(appointmentId));

            // Display a success message

            JOptionPane.showMessageDialog(this, "Appointment " + appointmentId + " has been cancelled.");

            // Refresh the table by deleting the selected row
            DefaultTableModel model = (DefaultTableModel) appointmentsTable.getModel();
            model.removeRow(row);

            dispose();
        }
    }
}
