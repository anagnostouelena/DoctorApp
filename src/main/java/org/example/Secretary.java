package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secretary {

    // Ότι έχει να κανει με τα δεδομενα του γιατρου θα πανε στην DoctorManager
    // To idio κια με τιςε υπόλοιπες μεθόδους
//    η καθε μία στην αντίστοιχη κλάση Manager

    private final Scanner scanner = new Scanner(System.in);
    private final List<Patient> patients;
    private final List<Appointment> appointment ;
    private final List<Doctor> doctors;
    private final DoctorManager doctorManager ;
    private final PatientManager patientManager ;
    private final AppoitmentManager appoitmentManager;

    public Secretary(List<Doctor> doctors, List<Patient> patients, List<Appointment> appointment) {
        this.doctors = doctors;
        this.patients = patients;
        this.appointment = appointment;

        this.doctorManager = new DoctorManager(doctors);
        this.patientManager = new PatientManager(patients);
        this.appoitmentManager = new AppoitmentManager(appointment, doctors);
    }


    public void getMenu() {
        int choice;

        do{
            System.out.println("Menu Secretary");
            System.out.println("1. Add new patient");
            System.out.println("2. Edit data patient");
            System.out.println("3. Add new doctor");
            System.out.println("4. Edit data doctor");
            System.out.println("5. Add new appointment");
            System.out.println("6. Show all the appointments");
            System.out.println("7. Exit");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                   patientManager. addNewPatient();
                    break;
                case 2:
                    patientManager.editPatient();
                    break;
                case 3:
                    doctorManager.addNewDoctor();
                    break;
                case 4:
                    doctorManager.editDoctor();
                    break;
                case 5:
                    appoitmentManager.addNewAppointment();
                    break;
                case 6:
                    appoitmentManager.viewAppointments();
                    break;
                case 7:
                    System.out.println("Disconnection from the system");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 7);
    }


    public boolean login(Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login successful. Welcome Secretary.");
            return true;
        } else {
            System.out.println("Invalid secretary credentials.");
            return false;
        }
    }

}