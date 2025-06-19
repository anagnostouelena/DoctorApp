package org.example;

public class Appointment {

    private String doctorName;
    private String patientName;
    private String dateAppointment;
    private String dayAppointment;
    private String servicesDoctor;
    private String timeAppointment;

    public Appointment(String doctorName, String patientName, String dateAppointment, String dayAppointment, String servicesDoctor, String timeAppointment) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.dateAppointment = dateAppointment;
        this.dayAppointment = dayAppointment;
        this.servicesDoctor = servicesDoctor;
        this.timeAppointment = timeAppointment;
    }

    public Appointment() {}

    public String getDoctorName() {
        return doctorName;
    }

    public String getDateAppointment() {
        return dateAppointment;
    }

    public String getDayAppointment() {
        return dayAppointment;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getServicesDoctor() {
        return servicesDoctor;
    }

    public String getTimeAppointment() { return timeAppointment; }

    public void setTimeAppointment(String timeAppointment) { this.timeAppointment = timeAppointment; }

    @Override
    public String toString() {
        return "Doctor: " + doctorName +
                ", Patient: " + patientName +
                ", Date: " + dateAppointment +
                ", Day: " + dayAppointment +
                ", Services: " + servicesDoctor +
                ", Time: " + timeAppointment;
    }


}