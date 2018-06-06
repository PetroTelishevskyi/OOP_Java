package ua.lpnuai.oop.stasiuk14;
import java.util.Scanner;

public class Human_Depart {
    public String ReadInfo() {
        Scanner infowriter = new Scanner(System.in);
        System.out.println("Work_specialty: ");
        String work_specialty = infowriter.nextLine();
        System.out.println("Salary: ");
        String salary = infowriter.nextLine();
        System.out.println("Experiance");
        String experiance = infowriter.nextLine();
        System.out.println("Education");
        String education = infowriter.nextLine();

        return "work_specialty:      " + work_specialty+"\n"+
                "salary:         " + salary+"\n"+
                "experiance:         " + experiance+"\n"+
                "education: " + education;
    }

    public Integer Depart() {
        Scanner infowriter = new Scanner(System.in);
        System.out.println("Please fill up this form \n Id of your anket:");
        Integer id = infowriter.nextInt();
        return id;


    }}