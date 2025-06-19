package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppoitmentManager {

    private final List<Appointment> appointments;
    private final Scanner scanner = new Scanner(System.in);
    private final List<Doctor> doctors;

    public AppoitmentManager(List<Appointment> appointments, List<Doctor> doctors) {
        this.appointments = appointments;
        this.doctors = doctors;
    }

    public void addNewAppointment() {

        System.out.println("Enter the name of doctor");
        String doctor = scanner.nextLine();

        System.out.println("Enter patient's name");
        String patientName = scanner.nextLine();

        System.out.println("Enter the date of the appointment");
        String date = scanner.nextLine();

        System.out.println("Enter the time of the appointment");
        String time = scanner.nextLine();

        System.out.println("Enter services");
        String services = scanner.nextLine();

        Appointment newAppointment = new Appointment(doctor, patientName, date, time, services);
        appointments.add(newAppointment);

        System.out.println("Appointment added!");
    }

    public void viewAppointments() {
        System.out.println("Viewing appointments");
        System.out.println("1. Show by doctor username");
        System.out.println("2. Show by date");
        System.out.println("3. Show by time");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                System.out.print("Enter doctor username: ");
                String username = scanner.nextLine();
                String fullName = findDoctorFullNameByUsername(username);
                if (fullName == null) {
                    System.out.println("Doctor not found");
                    return;
                }
                for (Appointment a : appointments) {
                    if (a.getDoctorName().equalsIgnoreCase(fullName)) {
                        System.out.println(a);
                    }
                }
                break;

            case 2:
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                for (Appointment a : appointments) {
                    if (a.getDateAppointment().equalsIgnoreCase(date)) {
                        System.out.println(a);
                    }
                }
                break;

            case 3:
                System.out.print("Enter time (HH:MM): ");
                String time = scanner.nextLine();
                for (Appointment a : appointments) {
                    if (a.getTimeAppointment().equalsIgnoreCase(time)) {
                        System.out.println(a);
                    }
                }
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    private String findDoctorFullNameByUsername(String username) {
        for (Doctor doc : doctors) {
            if (doc.getUerNameDoctor().equalsIgnoreCase(username)) {
                return doc.getFirstnameDoctor() + " " + doc.getLastNameDoctor();
            }
        }
        return null;
    }
}
