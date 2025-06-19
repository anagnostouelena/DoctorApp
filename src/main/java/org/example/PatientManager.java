package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientManager {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Patient> patients;

    public PatientManager(List<Patient> patients) {
        this.patients = patients;
    }

    public void addNewPatient() {

        System.out.println("Enter the name of the patient");
        String name = scanner.nextLine();

        System.out.println("Enter the age of the patient");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the phone number of the patient");
        String phone = scanner.nextLine();

        List<Diagnosis> nameofDiagnosis = new ArrayList<>();

        System.out.println("Enter the diagnosis of the patient");
        String diagnosis = scanner.nextLine();

        nameofDiagnosis.add(new Diagnosis(diagnosis));
        patients.add(new Patient(name, age, phone, nameofDiagnosis));
        System.out.println("New patient added");

    }

    public void editPatient() {
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
                } else if(option==2) {
                    System.out.println("Enter the diagnosis of the patient");
                    patient.getDiagnosis().add(new Diagnosis(scanner.nextLine()));
                }
                return;
            }
        }
        System.out.println("Patient not found");
    }
}
