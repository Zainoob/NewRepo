package application;

public class Person {
    int Age;
    String Name;
    int CNIC;//p.key
    String EmailAddress;
    int ContactNo;

    public Person(int age, String name, int CNIC, String emailAddress, int contactNo) {
        Age = age;
        Name = name;
        this.CNIC = CNIC;
        EmailAddress = emailAddress;
        ContactNo = contactNo;
    }
    public void setPersonDetails(int age, String name, int CNIC, String emailAddress, int contactNo) {
        Age = age;
        Name = name;
        this.CNIC = CNIC;
        EmailAddress = emailAddress;
        ContactNo = contactNo;
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCNIC() {
        return CNIC;
    }

    public void setCNIC(int CNIC) {
        this.CNIC = CNIC;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int contactNo) {
        ContactNo = contactNo;
    }
}
