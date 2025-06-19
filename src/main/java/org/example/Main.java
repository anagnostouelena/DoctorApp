package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Φορτώνουμε τα δεδομένα κατά την εκτέλεση
        List<Doctor> doctors = DataLoader.loadDoctors();
        List<Patient> patients = DataLoader.loadPatients();
        List<Appointment> appointments = DataLoader.loadAppointments();

        Secretary secretary = new Secretary(doctors, patients, appointments);
        DoctorManager doctorManager = new DoctorManager(doctors);

        int choice;
        do {
            System.out.println("\n--- Medical Management System ---");
            System.out.println("1. Secretary Login");
            System.out.println("2. Doctor Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (secretary.login(scanner)) {
                        secretary.getMenu();
                    }
                    break;
                case 2:
                    Doctor loggedDoctor = doctorManager.login(scanner);
                    if (loggedDoctor != null) {
                        MenuDoctor menuDoctor = new MenuDoctor(patients, appointments);
                        menuDoctor.showMenuDoctor(patients, appointments);
                    }

                    break;
                case 3:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);
    }
}
