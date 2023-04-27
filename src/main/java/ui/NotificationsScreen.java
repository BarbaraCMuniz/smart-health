package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NotificationsScreen {

    public NotificationsScreen() {
        // Create the panel and set the layout
        JPanel panel = new JPanel(new BorderLayout());

        // Create the notifications label and add it to the panel
        JLabel notificationsLabel = new JLabel("Notifications");
        notificationsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        notificationsLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(notificationsLabel, BorderLayout.NORTH);

        // Create the scroll pane and list for the notifications
        JScrollPane scrollPane = new JScrollPane();
        JList<String> notificationsList = new JList<>();
        notificationsList.setListData(getNotifications().toArray(new String[0]));
        scrollPane.setViewportView(notificationsList);
        panel.add(scrollPane, BorderLayout.CENTER);

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
        JFrame frame = new JFrame("Notifications");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private List<String> getNotifications() {
        // Example method to retrieve a list of notifications
        List<String> notifications = new ArrayList<>();
        notifications.add("Appointment Reminder: tomorrow at 9am");
        notifications.add("New test results available");
        notifications.add("Prescription refill reminder");
        return notifications;
    }
}
