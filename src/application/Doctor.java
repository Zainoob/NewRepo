package application;

public class Doctor {
    String Designation;
    Person doctor;

    public Doctor(String designation, Person person) {
       Designation = designation;
        this.doctor = person;
    }
    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Person getPerson() {
        return doctor;
    }

    public void setPerson(Person person) {
        this.doctor = person;
    }

    public void setDoctorDetails(String designation,String age, String name, int CNIC, String emailAddress, int contactNo) {
        Designation = designation;
        this.doctor.setPersonDetails(age,name,CNIC, emailAddress,contactNo);
    }
}
