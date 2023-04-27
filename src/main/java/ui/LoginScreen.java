package ui;

import clients.Doctor;
import clients.Patient;
import clients.RegistrationClient;

import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private RegistrationClient client;

    public LoginScreen() {

        // Create client to connect to database
        client = new RegistrationClient();
        // Set window title
        setTitle("Login and Registration Screen");

        // Create panel to hold login and registration components
        JPanel panel = new JPanel(new BorderLayout());

        // Create header panel with title and logo
        JPanel headerPanel = new JPanel(new FlowLayout());
        JLabel titleLabel = new JLabel("My Application");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel);
        ImageIcon logo = new ImageIcon("logo.png");
        JLabel logoLabel = new JLabel(logo);
        headerPanel.add(logoLabel);
        panel.add(headerPanel, BorderLayout.NORTH);

        // Create panel to hold input fields
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        // Add username field to input panel
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);

        // Add password field to input panel
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        panel.add(inputPanel, BorderLayout.CENTER);

        // Create panel to hold login and registration buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Create button to login
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            // Validate login information here
            Doctor doctor = client.loginDoctor(username, password);
            if (doctor != null) {
                // Open main screen here
                JOptionPane.showMessageDialog(null, "Doctor Login Successful!");
                setVisible(false);
                new DoctorDashboard();
                return;
            }

            Patient patient = client.loginPatient(username, password);
            if (patient != null) {
                // Open main screen here
                JOptionPane.showMessageDialog(null, "Patient Login Successful!");
                setVisible(false);
                new MonitoringDashboard();
                return;
            }

            JOptionPane.showMessageDialog(null, "Login Failed!");
        });
        buttonPanel.add(loginButton);


        // Create button to register
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> {
            // Open registration screen here
            new SignupScreen();
        });
        buttonPanel.add(registerButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Add components to main frame
        add(panel);

        // Set size and visibility of frame
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}