package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    // Σε αυτη την κλαση ορίζουμε τα δεδομένα μου θλεουμε να φορτω´σουμε γιατι
    // το γραφει στην ασκσηση και οχι στην  main

    public static List<Doctor> loadDoctors() {
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("PetrAlm1", "1995", "Petros", "Almiros", "Cardiologist", 30, "697802051"));
        doctors.add(new Doctor("Nikosad99", "8011", "Nikos", "Adreou", "Cardiologist", 36, "697540022"));
        return doctors;
    }

    public static List<Patient> loadPatients() {
        List<Patient> patients = new ArrayList<>();
        List<Diagnosis> diagnoses1 = new ArrayList<>();
        List<Diagnosis> diagnoses2 = new ArrayList<>();
        List<Diagnosis> diagnoses3 = new ArrayList<>();

        diagnoses1.add(new Diagnosis("Arithmia"));
        diagnoses2.add(new Diagnosis("Arithmia"));
        diagnoses3.add(new Diagnosis("Arithmia"));

        patients.add(new Patient("Anastasia Panagou",60,"697363676",diagnoses1));
        patients.add(new Patient("Eua Kalergh",79,"1234567890",diagnoses2));
        patients.add(new Patient("Ioanna Kokkinou",80,"1234567890",diagnoses3));

        return patients;
    }
    public static List<Appointment> loadAppointments() {
        List<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("Petros", "Anastasia Panagou", "20-04-2025", "Monday", "Cardiology", "13:00"));
        appointments.add(new Appointment("Nikos", "Eua Kalergh", "20-04-2025", "Monday", "Cardiology", "18:00"));
        appointments.add(new Appointment("Petros", "Ioanna kokkinou", "12-04-2025", "Friday", "Cardiology", "17:00"));

return appointments;

    }
}
