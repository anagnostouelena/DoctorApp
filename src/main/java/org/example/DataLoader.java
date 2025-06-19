package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    // Σε αυτη την κλαση ορίζουμε τα δεδομένα μου θλεουμε να φορτω´σουμε γιατι
    // το γραφει στην ασκσηση και οχι στην  main

    public static List<Doctor> loadDoctors() {
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("docjohn", "pass123", "John", "Doe", "Cardiologist", 45, "6981234567"));
        doctors.add(new Doctor("docjane", "pass456", "Jane", "Smith", "Cardiologist", 40, "6999876543"));
        return doctors;
    }

    public static List<Patient> loadPatients() {
        List<Patient> patients = new ArrayList<>();
        List<Diagnosis> diagnoses1 = new ArrayList<>();
        List<Diagnosis> diagnoses2 = new ArrayList<>();
        List<Diagnosis> diagnoses3 = new ArrayList<>();

        diagnoses1.add(new Diagnosis("High blood presure"));
        diagnoses2.add(new Diagnosis("Diabetic blood presure"));
        diagnoses3.add(new Diagnosis("Astma"));

        patients.add(new Patient("Alice",30,"1234567880",diagnoses1));
        patients.add(new Patient("Bob",30,"1234567890",diagnoses2));
        patients.add(new Patient("Charlie",30,"1234567890",diagnoses3));

        return patients;
    }
    public static List<Appointment> loadAppointments() {
        List<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("John Doe", "Alice", "2025-06-20", "10:00", "Cardiology Consultation"));
        appointments.add(new Appointment("Jane Smith", "Bob", "2025-06-20", "11:00", "Cardiology Consultation"));

return appointments;

    }
}
