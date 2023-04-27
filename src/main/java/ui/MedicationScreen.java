package ui;

import javax.swing.*;
import java.awt.*;

public class MedicationScreen {

    private JTextField medicationField;

    public MedicationScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel(new BorderLayout());

        // Create the medication label and add it to the panel
        JLabel medicationLabel = new JLabel("Medication:");
        medicationField = new JTextField();
        medicationField.setEditable(false);
        medicationField.setText(getMedication());
        panel.add(medicationLabel, BorderLayout.NORTH);
        panel.add(medicationField, BorderLayout.CENTER);

        // Create the close button and add it to the panel
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel);
            frame.dispose();
        });
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(closeButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Create and show the frame
        JFrame frame = new JFrame("Medication");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private String getMedication() {
        // Example method to retrieve the patient's medication
        return "Carbimazole: 20mg once daily\nParacetamol: 1000mg twice daily\nLevothyroxine: 100mcg once daily";
    }

}
