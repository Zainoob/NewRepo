package application;

public class Receptionist {
    String Password;
    String Username;//p.key?
    Person receptionist;

    public Receptionist(String password, String username, Person receptionist) {
        Password = password;
        Username = username;
        this.receptionist = receptionist;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Person getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Person receptionist) {
        this.receptionist = receptionist;
    }

    public void setReceptionistDetails(String password, String username,String age, String name, int CNIC, String emailAddress, int contactNo)
    {
        Password = password;
        Username = username;
        this.receptionist.setPersonDetails(age,name,CNIC, emailAddress,contactNo);
    }
}
