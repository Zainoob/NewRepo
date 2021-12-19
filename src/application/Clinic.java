package application;

import java.util.ArrayList;

public class Clinic {
    String Adress;
    String Name;
    int PhoneNo;
    int ClinicID;
    Ledger ledger1;
    Doctor doctor1;
    ArrayList<Appointment> AppointmentSchedule=new ArrayList<Appointment>();
    
    private static Clinic clinic = null; 
    private Clinic() {
	}
	public synchronized static Clinic getInstance()
    {
        if (clinic == null) {
        	clinic = new Clinic();
            //can initialize here
        }
        return clinic;
    }

}
