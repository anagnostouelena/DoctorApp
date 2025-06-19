package org.example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDoctor {

    private Scanner scanner = new Scanner(System.in);
    private final List<Patient> patients;
    private final List<Appointment> appointment;

    public MenuDoctor(List<Patient> patients, List<Appointment> appointment) {
        this.patients = patients;
        this.appointment = appointment;
    }

    public void showMenuDoctor(List<Patient> patients, List<Appointment> appointment) {

        int option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu Doctor");
            System.out.println("1. Edit Patient personal information");
            System.out.println("2. Add Diagnosis to Patient");
            System.out.println("3. View Appointments by Day");
            System.out.println("4. View Appointments by Time:");
            System.out.println("5. Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    editDataPatient();
                    break;
                case 2:
                    addDiagnosisToPatient();
                    break;
                case 3:
                    viewAppointmentsByDay();
                    break;
                case 4:
                    viewAppointmentsByTimeRange();
                    break;
                case 5:
                    System.out.println("Exiting doctor menu...");
                default:
                    System.out.println("Invalid option");

            }
        }while (option != 5);
    }

    private void editDataPatient() {
        System.out.println("Enter the name of the patient");
        String name = scanner.nextLine();

        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                System.out.println("1)Edit personal data patient");
                patient.setName(name);
                System.out.println("2)Add new diagnosis");
                int option=Integer.parseInt(scanner.nextLine());

                if(option==1) {
                    System.out.println("Enter the phone number of the patient");
                    String phone = scanner.nextLine();
                    patient.setPhone(phone);
                    System.out.println("Phone updated");
                } else if(option==2) {
                    System.out.println("Enter the diagnosis of the patient");
                    patient.getDiagnosis().add(new Diagnosis(scanner.nextLine()));
                    System.out.println("Diagnosis added");
                }
                return;
            }
        }
        System.out.println("Patient not found");
    }

    private void addDiagnosisToPatient() {
        System.out.println("Enter the name of the patient");
        String name = scanner.nextLine();
        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                System.out.println("1)Add new diagnosis");
                patient.getDiagnosis().add(new Diagnosis(scanner.nextLine()));
                System.out.println("Diagnosis added");
                return;
            }
        }
        System.out.println("Patient not found");
    }

    private void viewAppointmentsByDay() {
        System.out.println("Enter the date of the appointment");
        String date = scanner.nextLine();
        boolean flag = false;
        for (Appointment app : appointment) {
            if(app.getDateAppointment().equalsIgnoreCase(date)) {
                System.out.println(app);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Appointment not found");
        }

    }

    private void viewAppointmentsByTimeRange() {
        System.out.println("Enter the start time of the appointment (e.g. 18:00)");
        String startTimeA = scanner.nextLine();

        System.out.println("Enter the end time of the appointment (e.g. 21:00)");
        String endTimeB = scanner.nextLine();

        try{
            LocalTime startTime =LocalTime.parse(startTimeA, DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime endTime = LocalTime.parse(endTimeB, DateTimeFormatter.ofPattern("HH:mm"));

            boolean found = false;
            for (Appointment appointment : appointment) {
                LocalTime appointmentTime = LocalTime.parse(appointment.getTimeAppointment(), DateTimeFormatter.ofPattern("HH:mm"));

                if(!appointmentTime.isBefore(startTime) && appointmentTime.isAfter(endTime)) {
                    System.out.println(appointment);
                    found = true;
                }
            }
        }catch(DateTimeParseException e) {
            System.out.println("Invalid date or time format (e.g. 18:00)");
        }
    }

}