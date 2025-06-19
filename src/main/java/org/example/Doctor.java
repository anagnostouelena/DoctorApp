package org.example;

import java.util.List;

public class Doctor {

    // Θα φτιάξουμε μια κλάση DoctorManager
    // γιατί η Doctor είναι ενα μοντέλο πληροφορίας
    // δλδ παρέχει απλά πληροφορίες για έναν γιατρό
    //γιατί ένας Doctor δεν ξέρει άλλους γιατρούς
    // Αρα δημιουργούμε μια ξεχωριστή κλάση DoctorManager που χειρίζεται τους γιατρούς
    // δλδ
    //προσθήκη νέου γιατρού και τα σχετικά
    //Την κλάση Doctor την κρατάμε μόνο για τα δεδομένα του γιατρού.

    private String userNameDoctor;
    private String passwordDoctor;
    private String firstnameDoctor;
    private String lastNameDoctor;
    private String specialityDoctor;
    private int ageDoctor;
    private String phoneDoctor;

    public Doctor(
            String userNameDoctor,
            String passwordDoctor,
            String firstnameDoctor,
            String lastNameDoctor,
            String specialityDoctor,
            int ageDoctor,
            String phoneDoctor) {
        this.userNameDoctor = userNameDoctor;
        this.passwordDoctor = passwordDoctor;
        this.firstnameDoctor = firstnameDoctor;
        this.lastNameDoctor = lastNameDoctor;
        this.specialityDoctor = specialityDoctor;
        this.ageDoctor = ageDoctor;
        this.phoneDoctor = phoneDoctor;
    }

    public Doctor(){}

    public Doctor(List<Patient> patients, List<Appointment> appointments) {
    }

    public void getMenu() {}

    public String getFirstnameDoctor() {
        return firstnameDoctor;
    }

    public void setFirstnameDoctor(String firstnameDoctor) {
        this.firstnameDoctor = firstnameDoctor;
    }

    public String getLastNameDoctor() {
        return lastNameDoctor;
    }

    public void setLastNameDoctor(String lastNameDoctor) {
        this.lastNameDoctor = lastNameDoctor;
    }

    public String getSpecialityDoctor() {
        return specialityDoctor;
    }

    public void setSpecialityDoctor(String specialityDoctor) {
        this.specialityDoctor = specialityDoctor;
    }

    public int getAgeDoctor() {
        return ageDoctor;
    }

    public void setAgeDoctor(int ageDoctor) {
        this.ageDoctor = ageDoctor;
    }

    public String getPhoneDoctor() {
        return phoneDoctor;
    }

    public void setPhoneDoctor(String phoneDoctor) {
        this.phoneDoctor = phoneDoctor;
    }

    public String getUerNameDoctor() {
        return userNameDoctor;
    }

    public String getPasswordDoctor() {
        return passwordDoctor;
    }

      public void setPasswordDoctor(String passwordDoctor) {
        this.passwordDoctor = passwordDoctor;
    }

}