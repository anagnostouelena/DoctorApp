package org.example;

public class Appointment {

    private String doctorName;
    private String patientName;
    private String dateAppointment;
    private String timeAppointment;
    private String servicesDoctor;

    public Appointment(String doctorName, String patientName, String dateAppointment, String timeAppointment, String servicesDoctor) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.dateAppointment = dateAppointment;
        this.timeAppointment = timeAppointment;
        this.servicesDoctor = servicesDoctor;
    }

    public Appointment() {}

    public String getDoctorName() {
        return doctorName;
    }

    public String getDateAppointment() {
        return dateAppointment;
    }

    public String getTimeAppointment() {
        return timeAppointment;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getServicesDoctor() {
        return servicesDoctor;
    }

    @Override
    public String toString() {
        return "Doctor: " + doctorName +
                ", Patient: " + patientName +
                ", Date: " + dateAppointment +
                ", Time: " + timeAppointment +
                ", Services: " + servicesDoctor;
    }
}