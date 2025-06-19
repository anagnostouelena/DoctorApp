package org.example;

import java.util.List;
import java.util.Scanner;

public class DoctorManager {

    private final List<Doctor> doctors;
    private final Scanner scanner = new Scanner(System.in);

    public DoctorManager(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void addNewDoctor() {

        System.out.println("Enter the first name of the doctor");
        String firstnameDoctor = scanner.nextLine();

        System.out.println("Enter the last name of the doctor");
        String lastnameDoctor = scanner.nextLine();

        System.out.println("Enter the user name of the doctor");
        String userNameDoctor = scanner.nextLine();

        System.out.println("Enter the password of the doctor");
        String passwordDoctor = scanner.nextLine();

        System.out.println("Enter the speciality of the doctor");
        String specialityDoctor = scanner.nextLine();

        System.out.println("Enter the age of the doctor");
        int ageDoctor = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the phone number of the doctor");
        String phoneDoctor = scanner.nextLine();

        doctors.add(new Doctor(userNameDoctor,passwordDoctor, firstnameDoctor, lastnameDoctor, specialityDoctor, ageDoctor, phoneDoctor));
        System.out.println("New doctor added");
    }

    public void editDoctor() {

        System.out.println("Enter the user name of the doctor");
        String userNameDoctor = scanner.nextLine();

        for(Doctor doctor : doctors) {
            if(doctor.getUerNameDoctor().equalsIgnoreCase(userNameDoctor)) {

                System.out.println("Enter the first name of the doctor");
                String firstnameDoctor = scanner.nextLine();
                doctor.setFirstnameDoctor(firstnameDoctor);

                System.out.println("Enter the last name of the doctor");
                String lastnameDoctor = scanner.nextLine();
                doctor.setLastNameDoctor(lastnameDoctor);

                System.out.println("Enter the phone number of the doctor");
                String phoneDoctor = scanner.nextLine();
                doctor.setPhoneDoctor(phoneDoctor);

                System.out.println("Enter the age of the doctor");
                int ageDoctor = Integer.parseInt(scanner.nextLine());
                doctor.setAgeDoctor(ageDoctor);

                System.out.println("Enter the speciality number of the doctor");
                String specialityDoctor = scanner.nextLine();
                doctor.setSpecialityDoctor(specialityDoctor);

                System.out.println("Doctor's details edited successfully");
                return;
            }
        }
        System.out.println("doctor not found"); //Άμα κάνει λάθος ο χρήστης το username
    }

    public Doctor login(Scanner scanner) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Doctor doctor : doctors) {
            if (doctor.getUerNameDoctor().equals(username) && doctor.getPasswordDoctor().equals(password)) {
                System.out.println("Login successful. Welcome Dr. " + doctor.getFirstnameDoctor());
                return doctor;
            }
        }

        System.out.println("Invalid username or password.");
        return null;
    }


}
