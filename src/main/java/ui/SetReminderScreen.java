package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class SetReminderScreen {

    public SetReminderScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        // Add the description label and text field
        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionTextField = new JTextField();
        panel.add(descriptionLabel);
        panel.add(descriptionTextField);

        // Add the date label and picker
        JLabel dateLabel = new JLabel("Date:");
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "MM/dd/yyyy");
        dateSpinner.setEditor(dateEditor);
        panel.add(dateLabel);
        panel.add(dateSpinner);

        // Add the time label and spinner
        JLabel timeLabel = new JLabel("Time:");
        JSpinner timeSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "hh:mm a");
        timeSpinner.setEditor(timeEditor);
        panel.add(timeLabel);
        panel.add(timeSpinner);

        // Add the save button
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields and spinners
                String description = descriptionTextField.getText();
                Date date = (Date) dateSpinner.getValue();
                Date time = (Date) timeSpinner.getValue();

                // Combine the date and time into a single Date object
                Date reminderDate = new Date(date.getYear(), date.getMonth(), date.getDate(), time.getHours(), time.getMinutes());


                // Close the window
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel);
                frame.dispose();
            }
        });
        panel.add(new JPanel());
        panel.add(saveButton);

        // Create and show the frame
        JFrame frame = new JFrame("Set Reminder");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
