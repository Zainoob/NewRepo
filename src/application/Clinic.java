package application;

import java.util.ArrayList;

import javafx.collections.ObservableList;

public class Clinic {
    String Adress;
    String Name;
    int PhoneNo;
    int ClinicID;
    Ledger ledger1;
    Doctor doctor1;
    static int num;
    ArrayList<Appointment> AppointmentSchedule=new ArrayList<Appointment>();
    ArrayList<AppointmentDescription> AppointmentCatalogue=new ArrayList<AppointmentDescription>();
    ArrayList<Feedback> Feedbacks=new  ArrayList<Feedback>();
    
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
	public void updateFeedbacks(String s)
	{
		Feedback e=new Feedback();
		e.setFeedback(s);
		e.setFeedbackNum(num);
		num++;
		Feedbacks.add(e);
		
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public int getClinicID() {
		return ClinicID;
	}
	public void setClinicID(int clinicID) {
		ClinicID = clinicID;
	}
	public Ledger getLedger1() {
		return ledger1;
	}
	public void setLedger1(Ledger ledger1) {
		this.ledger1 = ledger1;
	}
	public Doctor getDoctor1() {
		return doctor1;
	}
	public void setDoctor1(Doctor doctor1) {
		this.doctor1 = doctor1;
	}
	public ArrayList<Appointment> getAppointmentSchedule() {
		return AppointmentSchedule;
	}
	public void setAppointmentSchedule(ArrayList<Appointment> appointmentSchedule) {
		AppointmentSchedule = appointmentSchedule;
	}
	public ArrayList<AppointmentDescription> getAppointmentCatalogue() {
		return AppointmentCatalogue;
	}
	public void setAppointmentCatalogue(ArrayList<AppointmentDescription> appointmentCatalogue) {
		AppointmentCatalogue = appointmentCatalogue;
	}
	public ArrayList<Feedback> getFeedbacks() {
		return Feedbacks;
	}
	public void setFeedbacks(ArrayList<Feedback> feedbacks) {
		Feedbacks = feedbacks;
	}
	public void loadAppointmentCatalogue()
	{
		ArrayList<AppointmentDescription> AC=new ArrayList<AppointmentDescription>();
		AppointmentDescription a = new AppointmentDescription(1,"Regular Check-up",1000);
		AppointmentDescription b = new AppointmentDescription(2,"Teeth whitening",1500);
		AppointmentDescription c = new AppointmentDescription(3,"Crowning",7000);
		AppointmentDescription d = new AppointmentDescription(4,"Denture",25000);
		AppointmentDescription e = new AppointmentDescription(5,"Scaling",1000);
		AppointmentDescription f = new AppointmentDescription(6,"Invisible braces",50000);
		AppointmentDescription g = new AppointmentDescription(7,"Polishing",3500);
		AppointmentDescription h = new AppointmentDescription(8,"Root Canal",4000);
		AppointmentDescription i = new AppointmentDescription(9,"Implant",9000);
		AppointmentDescription j = new AppointmentDescription(10,"Tooth Extraction",1500);
		AC.add(a);
		AC.add(b);
		AC.add(c);
		AC.add(d);
		AC.add(e);
		AC.add(f);
		AC.add(g);
		AC.add(h);
		AC.add(i);
		AC.add(j);
		clinic.setAppointmentCatalogue(AC);
	}
	

}
