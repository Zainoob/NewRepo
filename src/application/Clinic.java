package application;

import java.util.ArrayList;
import java.util.Date;

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

	public void setFeedback(String str)
	{
			Feedback f = new Feedback();
			f.setFeedback(str);
			f.setDateAdded(new Date());
			DBHandler ins = new DBHandler();
			ins.setFeedback(f);
			//Feedbacks.add(f);

	}
}
