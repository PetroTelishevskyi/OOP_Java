package ua.lpnuai.oop.telishevskyi10;

import java.io.Serializable;

public class CadreAgency implements Serializable {
    private static int registration_number = 0;
    private String specialty;
    private String experience;
    private String education;
    private String date_release;
    private String new_specialty;
    private String working_conditions;
    private String salary;

    public CadreAgency(String specialty, String experience, String education, String date_release,
                       String new_specialty, String working_conditions, String salary) {
        this.specialty = specialty;
        this.experience = experience;
        this.education = education;
        this.date_release = date_release;
        this.new_specialty = new_specialty;
        this.working_conditions = working_conditions;
        this.salary = salary;
        registration_number++;
    }

    public CadreAgency() {

    }

    public static int getRegistration_number() {
        return registration_number;
    }

    public static void setRegistration_number(int registration_number) {
        System.out.println("");
        CadreAgency.registration_number = registration_number;
    }

    public String getSpecialty(){
        System.out.print("Спеціальність: ");
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience(){
        System.out.print("Стаж: ");
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        System.out.print("Освіта: ");
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDate_release() {
        System.out.print("Дата звільнення: ");
        return date_release;
    }

    public void setDate_release(String date_release) {
        this.date_release = date_release;
    }

    public String getNew_specialty() {
        System.out.print("Нова спеціальність: ");
        return new_specialty;
    }

    public void setNew_specialty(String new_specialty) {
        this.new_specialty = new_specialty;
    }

    public String getWorking_conditions() {
        System.out.print("Умови праці: ");
        return working_conditions;
    }

    public void setWorking_conditions(String working_conditions) {
        this.working_conditions = working_conditions;
    }

    public String getSalary() {
        System.out.print("Мінімальна зарплата: ");
        return salary;
    }

    public void setSalary(String salary) {

        this.salary = salary;
    }
}
