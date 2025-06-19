package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {

    private String name; //όνομα ασθενή
    private int age;     //ηλικία ασθενή
    private String phone; //αριθμός τηλεφώνου ασθενή
    private List<Diagnosis> diagnosis;

    public Patient(String name, int age, String phone, List<Diagnosis> diagnosis) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void addDiagnosis(Diagnosis diagnosis) {
        this.diagnosis.add(diagnosis);
    }

    public void addNewPatient(Scanner scanner, List<Patient> patients) {
        String input = "yes";

        do {
            System.out.print("Enter the name of the patient: ");
            String name = scanner.nextLine();

            System.out.print("Enter the age of the patient: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the phone number of the patient: ");
            String phone = scanner.nextLine();

            List<Diagnosis> nameofDiagnosis = new ArrayList<>();

            String moreDiagnosis;
            do{
                System.out.print("Enter more diagnosis: ");
                String diagnosisName = scanner.nextLine();
                nameofDiagnosis.add(new Diagnosis(diagnosisName));

                System.out.print("Add another diagnosis? ");
                moreDiagnosis = scanner.nextLine();

            }while (!moreDiagnosis.equals("yes"));

            patients.add(new Patient(name, age, phone, nameofDiagnosis));
            System.out.print("New patient added? ");

            System.out.print("Do you want to add another patient? ");
            input = scanner.nextLine();

        }while (input.equals("yes"));

    }

}