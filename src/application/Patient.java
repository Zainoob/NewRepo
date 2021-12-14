package application;

public class Patient {
    String PatientID;//p.key
    Person patient;
    int History;//if patient is present in clinic records

    public Patient(String patientID, Person patient, int history) {
        PatientID = patientID;
        this.patient = patient;
        History = history;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String patientID) {
        PatientID = patientID;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public int getHistory() {
        return History;
    }

    public void setHistory(int history) {
        History = history;
    }

    public void setPatientDetails(String patientID, int history,String age, String name, int CNIC, String emailAddress, int contactNo)
    {
        PatientID = patientID;
        this.patient.setPersonDetails(age,name,CNIC, emailAddress,contactNo);
        History = history;
    }
}
