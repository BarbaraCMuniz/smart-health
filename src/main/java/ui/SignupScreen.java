package ui;

import clients.Patient;
import clients.RegistrationClient;

import javax.swing.*;
import java.awt.*;

public class SignupScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JPasswordField confirmPasswordField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextField dateOfBirthField;
    private JTextField genderField;
    private JTextField heightField;
    private JTextField weightField;
    private JTextField bloodTypeField;
    private JTextField organDonorField;
    private JTextField medicalHistoryField;

    private RegistrationClient client;

    public SignupScreen() {
        client = new RegistrationClient();
        // Set window title
        setTitle("Patient Signup Screen");

        // Create panel to hold input fields
        JPanel panel = new JPanel(new GridLayout(0, 2));

        // Add username field to panel
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        // Add password field to panel
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Add email field to panel
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        // Add confirm password field to panel
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        // Add phone number field to panel
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneField = new JTextField();
        panel.add(phoneLabel);
        panel.add(phoneField);

        // Add address field to panel
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        panel.add(addressLabel);
        panel.add(addressField);


        // Add date of birth field to panel
        JLabel dateOfBirthLabel = new JLabel("Date of Birth:");
        dateOfBirthField = new JTextField();
        panel.add(dateOfBirthLabel);
        panel.add(dateOfBirthField);

        // Add the height field to the panel
        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField();
        panel.add(heightLabel);
        panel.add(heightField);

// Add the weight field to the panel
        JLabel weightLabel = new JLabel("Weight:");
        weightField = new JTextField();
        panel.add(weightLabel);
        panel.add(weightField);

// Add the blood type field to the panel
        JLabel bloodTypeLabel = new JLabel("Blood Type:");
        bloodTypeField = new JTextField();
        panel.add(bloodTypeLabel);
        panel.add(bloodTypeField);

// Add the organ donor field to the panel
        JLabel organDonorLabel = new JLabel("Organ Donor:");
        organDonorField = new JTextField();
        panel.add(organDonorLabel);
        panel.add(organDonorField);

// Add the medical history field to the panel
        JLabel medicalHistoryLabel = new JLabel("Medical History:");
        medicalHistoryField = new JTextField();
        panel.add(medicalHistoryLabel);
        panel.add(medicalHistoryField);


        // Create button to submit signup information
        JButton signupButton = new JButton("Sign Up");

        // Add action listener to button
        signupButton.addActionListener(e -> {
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();
            String email = emailField.getText();
            char[] confirmPassword = confirmPasswordField.getPassword();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String dateOfBirth = dateOfBirthField.getText();
            String height = heightField.getText();
            String weight = weightField.getText();
            String bloodType = bloodTypeField.getText();
            String organDonor = organDonorField.getText();
            String medicalHistory = medicalHistoryField.getText();

            // validate input
            if (username.isEmpty() || password.length == 0 || email.isEmpty() || confirmPassword.length == 0 || phone.isEmpty() || address.isEmpty() || dateOfBirth.isEmpty() || height.isEmpty() || weight.isEmpty() || bloodType.isEmpty() || organDonor.isEmpty() || medicalHistory.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
                return;
            }

            // check if passwords match
            if (!String.copyValueOf(password).equals(String.copyValueOf(confirmPassword))) {
               JOptionPane.showMessageDialog(null, "Passwords do not match");
            }

            Patient patient = new Patient();
            patient.setName(username);
            patient.setPassword(String.copyValueOf(password));
            patient.setEmail(email);
            patient.setPhoneNumber(phone);
            patient.setAddress(address);
            patient.setDateOfBirth(dateOfBirth);
            patient.setHeight(Float.parseFloat(height));
            patient.setWeight(Float.parseFloat(weight));
            patient.setBloodType(bloodType);
            patient.setOrganDonor(organDonor.equals("Yes"));
            patient.setMedicalHistory(medicalHistory);

            Patient registerefd = client.registerPatient(patient);

            if (registerefd == null) {
                JOptionPane.showMessageDialog(null, "Registration failed");
                return;
            }

            setVisible(false);
            new MonitoringDashboard();
        });

        // Create button for doctor signup
        JButton doctorSignupButton = new JButton("Doctor Signup");
        JButton loginButton = new JButton("Login");

        // Add action listener to doctor signup button
        doctorSignupButton.addActionListener(e -> {
            // Code to open doctor signup screen
            setVisible(false);
            new DoctorSignupScreen();
        });


        loginButton.addActionListener(e -> {
            // Code to open login screen
            setVisible(false);
        });

        // Create panel to hold doctor signup button
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(doctorSignupButton);
        buttonPanel.add(loginButton);

        // Add components to main frame
        add(panel, BorderLayout.CENTER);
        add(signupButton, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.NORTH);

        // Set size and visibility of frame
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
