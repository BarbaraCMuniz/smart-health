package clients;
import java.sql.*;
import java.util.ArrayList;

public class AppointmentDatabaseClient {
    private Connection conn;

    public AppointmentDatabaseClient() {
        try {
            // Create a connection to the database
            conn = DriverManager.getConnection("jdbc:sqlite:medical.db");
            System.out.println("Connection to SQLite has been established.");

            // Create a table for appointments if it doesn't already exist
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS appointments (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "patient_id INTEGER," +
                    "location TEXT," +
                    "date TEXT," +
                    "time TEXT," +
                    "notes TEXT" +
                    ")";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createAppointment(Appointment appointment) {
        try {
            // Insert the new appointment into the database
            String sql = "INSERT INTO appointments (patient_id, location, date, time, notes) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, appointment.getPatientId());
            pstmt.setString(2, appointment.getLocation());
            pstmt.setString(3, appointment.getDate());
            pstmt.setString(4, appointment.getTime());
            pstmt.setString(5, appointment.getNotes());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAppointment(int appointmentId) {
        try {
            // Delete the appointment with the given ID from the database
            String sql = "DELETE FROM appointments WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, appointmentId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Appointment> listAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();
        try {
            // Select all appointments from the database
            String sql = "SELECT * FROM appointments";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Loop through the result set and create an Appointment object for each row
            while (rs.next()) {
                Appointment appointment = new Appointment();
                appointment.setId(rs.getInt("id"));
                appointment.setPatientId(rs.getInt("patient_id"));
                appointment.setLocation(rs.getString("location"));
                appointment.setDate(rs.getString("date"));
                appointment.setTime(rs.getString("time"));
                appointment.setNotes(rs.getString("notes"));
                appointments.add(appointment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }


    public void close() {
        try {
            // Close the database connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
