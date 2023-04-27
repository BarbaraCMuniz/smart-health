package clients;

import java.sql.*;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class RegistrationClient {


    private Connection conn;
    private final String DB_NAME = "medical.db";

    public RegistrationClient() {

        connect();
        initializeDatabase();
    }

    public void initializeDatabase() {
        initializePatientTable();
        initializeDoctorTable();
    }

    public Connection connect() {
        String url = "jdbc:sqlite:"+ DB_NAME;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection to SQLite has been closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



    public void initializePatientTable() {
        String query = "CREATE TABLE IF NOT EXISTS patients ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT,"
                + "email TEXT,"
                + "phone_number TEXT,"
                + "address TEXT,"
                + "date_of_birth TEXT,"
                + "gender TEXT,"
                + "height REAL,"
                + "weight REAL,"
                + "blood_type TEXT,"
                + "organ_donor INTEGER,"
                + "medical_history TEXT,"
                + "photo TEXT,"
                + "password TEXT"
                + ")";

        try (
             Statement stmt = conn.createStatement()) {
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println("Error initializing patients table: " + e.getMessage());
        }
    }


    public void initializeDoctorTable() {
        String query = "CREATE TABLE IF NOT EXISTS doctors ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT,"
                + "imc INTEGER,"
                + "specialty TEXT,"
                + "places_of_care TEXT,"
                + "email TEXT,"
                + "phone_number TEXT,"
                + "photo TEXT,"
                + "password TEXT"
                + ")";

        try (
             Statement stmt = conn.createStatement()) {
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println("Error initializing doctors table: " + e.getMessage());
        }
    }

    public Patient registerPatient(Patient patient) {
        String query = "INSERT INTO patients (name, email, phone_number, address, date_of_birth, gender, height, weight, blood_type, organ_donor, medical_history, photo, password) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, patient.getName());
            stmt.setString(2, patient.getEmail());
            stmt.setString(3, patient.getPhoneNumber());
            stmt.setString(4, patient.getAddress());
            stmt.setString(5, patient.getDateOfBirth());
            stmt.setString(6, patient.getGender());
            stmt.setFloat(7, patient.getHeight());
            stmt.setFloat(8, patient.getWeight());
            stmt.setString(9, patient.getBloodType());
            stmt.setBoolean(10, patient.isOrganDonor());
            stmt.setString(11, patient.getMedicalHistory());
            stmt.setString(12, patient.getPhoto());
            stmt.setString(13, patient.getPassword());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating patient failed, no rows affected.");
            }

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                patient.setId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("Creating patient failed, no ID obtained.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patient;
    }

    public Doctor registerDoctor(Doctor doctor) {
        String query = "INSERT INTO doctors (name, imc, specialty, places_of_care, email, phone_number, photo, password) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, doctor.getName());
            stmt.setInt(2, doctor.getImc());
            stmt.setString(3, doctor.getSpecialty());
            stmt.setString(4, String.join(",", doctor.getPlacesOfCare()));
            stmt.setString(5, doctor.getEmail());
            stmt.setString(6, doctor.getPhoneNumber());
            stmt.setString(7, doctor.getPhoto());
            stmt.setString(8, doctor.getPassword());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating doctor failed, no rows affected.");
            }

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                doctor.setId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("Creating doctor failed, no ID obtained.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctor;
    }

    public Patient loginPatient(String email, String password) {
        Patient patient = null;

        String query = "SELECT * FROM patients WHERE email = ? AND password = ?";

        try (
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                patient = new Patient(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("address"),
                        rs.getString("date_of_birth"),
                        rs.getString("gender"),
                        rs.getFloat("height"),
                        rs.getFloat("weight"),
                        rs.getString("blood_type"),
                        rs.getBoolean("organ_donor"),
                        rs.getString("medical_history"),
                        rs.getString("photo"),
                        rs.getString("password"),
                        rs.getInt("id")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return patient;
    }

    public Doctor loginDoctor(String email, String password) {
        Doctor doctor = null;

        String query = "SELECT * FROM doctors WHERE email = ? AND password = ?";

        try (
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                doctor = new Doctor(
                        rs.getString("name"),
                        rs.getInt("imc"),
                        rs.getString("specialty"),
                        rs.getString("places_of_care").split(","),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("photo"),
                        rs.getString("password"),
                        rs.getInt("id")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return doctor;
    }



    public void deleteDoctor(int id) {
        String query = "DELETE FROM doctors WHERE id = ?";

        try (
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePatient(int id) {
        String query = "DELETE FROM patients WHERE id = ?";

        try (
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Patient[] getPatients()  {
         String query = "SELECT * FROM patients";
         Patient[] patients = null;

         try {
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery();
             ArrayList<Patient> patientsList = new ArrayList<Patient>();
             while (rs.next()) {
                     Patient patient = new Patient(
                             rs.getString("name"),
                             rs.getString("email"),
                             rs.getString("phone_number"),
                             rs.getString("address"),
                             rs.getString("date_of_birth"),
                             rs.getString("gender"),
                             rs.getFloat("height"),
                             rs.getFloat("weight"),
                             rs.getString("blood_type"),
                             rs.getBoolean("organ_donor"),
                             rs.getString("medical_history"),
                             rs.getString("photo"),
                             rs.getString("password"),
                             rs.getInt("id")
                     );

                     System.out.println(patient.getName());

                     patientsList.add(patient);
             }


                patients = patientsList.toArray(new Patient[0]);
         } catch (SQLException e) {
             e.printStackTrace();
         }

            return patients;
    }

    public void updatePatient(Patient patient) {
        String query = "UPDATE patients SET "
                + "name = '" + patient.getName() + "', "
                + "email = '" + patient.getEmail() + "', "
                + "phone_number = '" + patient.getPhoneNumber() + "', "
                + "address = '" + patient.getAddress() + "', "
                + "date_of_birth = '" + patient.getDateOfBirth() + "', "
                + "gender = '" + patient.getGender() + "', "
                + "height = " + patient.getHeight() + ", "
                + "weight = " + patient.getWeight() + ", "
                + "blood_type = '" + patient.getBloodType() + "', "
                + "organ_donor = " + (patient.isOrganDonor() ? 1 : 0) + ", "
                + "medical_history = '" + patient.getMedicalHistory() + "', "
                + "photo = '" + patient.getPhoto() + "', "
                + "password = '" + patient.getPassword() + "' "
                + "WHERE id = " + patient.getId();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error executing query: " + query);
            e.printStackTrace();
        }
    }

}

