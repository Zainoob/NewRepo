package application;

public class Person {
    String Age;
    String Name;
    int CNIC;//p.key
    String EmailAddress;
    int ContactNo;

    public Person(String age, String name, int CNIC, String emailAddress, int contactNo) {
        Age = age;
        Name = name;
        this.CNIC = CNIC;
        EmailAddress = emailAddress;
        ContactNo = contactNo;
    }
    public void setPersonDetails(String age, String name, int CNIC, String emailAddress, int contactNo) {
        Age = age;
        Name = name;
        this.CNIC = CNIC;
        EmailAddress = emailAddress;
        ContactNo = contactNo;
    }
    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
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
