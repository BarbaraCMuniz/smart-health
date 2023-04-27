package ui;

import javax.swing.*;
import java.awt.*;

public class TestResultsScreen {

    private JTextField testResultsField;

    public TestResultsScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel(new BorderLayout());

        // Create the test results label and add it to the panel
        JLabel testResultsLabel = new JLabel("Test Results:");
        testResultsField = new JTextField();
        testResultsField.setEditable(false);
        testResultsField.setText(getTestResults());
        panel.add(testResultsLabel, BorderLayout.NORTH);
        panel.add(testResultsField, BorderLayout.CENTER);

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
        JFrame frame = new JFrame("Test Results");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private String getTestResults() {
        // Example method to retrieve the patient's test results
        return "Cholesterol: 210 mg/dL\nTriglycerides: 170 mg/dL\nHDL: 40 mg/dL\nLDL: 150 mg/dL";
    }

}
