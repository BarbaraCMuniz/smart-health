package ui;

import clients.Doctor;
import clients.RegistrationClient;

import javax.swing.*;
import java.awt.*;

public class DoctorSignupScreen extends JFrame {
    private JTextField nameField;
    private JTextField imcField;
    private JTextField specialtyField;
    private JTextArea placesOfCareTextArea;
    private JTextField emailField;
    private JTextField phoneNumberField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JLabel errorLabel;
    private JButton registerButton;

    private JButton loginButton;
    private RegistrationClient client;

    public DoctorSignupScreen() {
        client = new RegistrationClient();
        // Set window title
        setTitle("Doctor Signup Screen");

        // Create panel to hold input fields
        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

        // Add name field to panel
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        // Add IMC field to panel
        JLabel imcLabel = new JLabel("IMC:");
        imcField = new JTextField();
        panel.add(imcLabel);
        panel.add(imcField);

        // Add specialty field to panel
        JLabel specialtyLabel = new JLabel("Specialty:");
        specialtyField = new JTextField();
        panel.add(specialtyLabel);
        panel.add(specialtyField);

        // Add places of care text area to panel
        JLabel placesOfCareLabel = new JLabel("Places of Care:");
        placesOfCareTextArea = new JTextArea();
        JScrollPane placesOfCareScrollPane = new JScrollPane(placesOfCareTextArea);
        placesOfCareScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        placesOfCareScrollPane.setPreferredSize(new Dimension(0, 80));
        panel.add(placesOfCareLabel);
        panel.add(placesOfCareScrollPane);

        // Add email field to panel
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        // Add phone number field to panel
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);


        // Add password field to panel
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Add confirm password field to panel
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        // Add error label to panel
        errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);
        panel.add(errorLabel);
        panel.add(new JPanel());

        // Add register button to panel
        registerButton = new JButton("Register");
        panel.add(registerButton);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String imc = imcField.getText();
            String specialty = specialtyField.getText();
            String placesOfCare = placesOfCareTextArea.getText();
            String email = emailField.getText();
            String phoneNumber = phoneNumberField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (name.isEmpty() || imc.isEmpty() || specialty.isEmpty() || placesOfCare.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                errorLabel.setText("Please fill in all fields.");
                return;
            }

            if (!password.equals(confirmPassword)) {
                errorLabel.setText("Passwords do not match.");
                return;
            }

            Doctor doctor = new Doctor(name, Integer.parseInt(imc), specialty, placesOfCare.split(","), email, phoneNumber, password, confirmPassword, 0);

            Doctor registeredDoctor = client.registerDoctor(doctor);

            if (registeredDoctor == null) {
                errorLabel.setText("Error registering doctor.");
                return;
            }

            setVisible(false);
            new DoctorDashboard();

        });

        //add login button
        loginButton = new JButton("Login");
        panel.add(loginButton);

        loginButton.addActionListener(e -> {
            setVisible(false);
            dispose();
        });

        // Set panel as content pane
        setContentPane(panel);

        // Set window size and make it visible
        setSize(400, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}