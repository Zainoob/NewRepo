package application;

public class Booking {
    int BookingRefCode;//p.key
    Patient patient;
    int BookingStatus;
    String DateBooking;

    public Booking(int bookingRefCode, Patient patient, int bookingStatus, String dateBooking) {
        BookingRefCode = bookingRefCode;
        this.patient = patient;
        BookingStatus = bookingStatus;
        DateBooking = dateBooking;
    }
    public void setBookingDetails(int bookingRefCode, Patient patient, int bookingStatus, String dateBooking)
    {
        BookingRefCode = bookingRefCode;
        this.patient = patient;
        BookingStatus = bookingStatus;
        DateBooking = dateBooking;
    }
    public int getBookingRefCode() {
        return BookingRefCode;
    }
    public void setBookingRefCode(int bookingRefCode) {
        BookingRefCode = bookingRefCode;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getBookingStatus() {
        return BookingStatus;
    }

    public void setBookingStatus(int bookingStatus) {
        BookingStatus = bookingStatus;
    }

    public String getDateBooking() {
        return DateBooking;
    }

    public void setDateBooking(String dateBooking) {
        DateBooking = dateBooking;
    }
}
