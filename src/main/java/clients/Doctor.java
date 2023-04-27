package clients;

import java.sql.*;

public class Doctor {
    private String name;
    private int imc;
    private String specialty;
    private String[] placesOfCare;
    private String email;
    private String phoneNumber;
    private String photo;
    private String password;
    private int id;

    public Doctor(String name, int imc, String specialty, String[] placesOfCare, String email, String phoneNumber, String photo, String password, int id) {
        this.name = name;
        this.imc = imc;
        this.specialty = specialty;
        this.placesOfCare = placesOfCare;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.password = password;
        this.id = id;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String[] getPlacesOfCare() {
        return placesOfCare;
    }

    public void setPlacesOfCare(String[] placesOfCare) {
        this.placesOfCare = placesOfCare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // SQLite operations

}