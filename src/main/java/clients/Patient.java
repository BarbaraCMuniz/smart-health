package clients;

public class Patient {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setOrganDonor(boolean organDonor) {
        this.organDonor = organDonor;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String phoneNumber;
    private String address;
    private String dateOfBirth;
    private String gender;
    private float height;
    private float weight;
    private String bloodType;
    private boolean organDonor;
    private String medicalHistory;
    private String photo;
    private String password;
    private int id;

    public Patient() {

    }

    public Patient(String name, String email, String phoneNumber, String address, String dateOfBirth,
                   String gender, float height, float weight, String bloodType, boolean organDonor,
                   String medicalHistory, String photo, String password, int id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.organDonor = organDonor;
        this.medicalHistory = medicalHistory;
        this.photo = photo;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public boolean isOrganDonor() {
        return organDonor;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getPhoto() {
        return photo;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public Object getOrgandonor() {
		
		// TODO Auto-generated method stub
		return null;
	}

    // Static method to create a Patient object from a PatientProto message
}
