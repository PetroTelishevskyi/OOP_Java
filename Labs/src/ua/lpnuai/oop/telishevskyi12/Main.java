package ua.lpnuai.oop.stasiuk12;
import java.util.*;

public class Main {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many students  would you like to add: ");
        byte students = (byte) in.nextInt();

        for (int a = 0; a < students;a++) {

            System.out.println("Enter your name:");
            String name = in.next();
            Item reg = new Item();
            while (!reg.name(name)) {
                System.out.println("Incorrect input.Enter your name correctly");
                name = in.next();
            }
        }
        Item reg = new Item();



        System.out.println("Enter your phone number");
        String data = in.next();
        while(!reg.phone(data)){
            System.out.println("Incorrect input. Enter your passport date correctly(8 symbols: big letters and numbers)");
            data = in.next();
        }

        System.out.println("Enter your education");
        String education = in.next();
        while(!reg.education(education)){
            System.out.println("Incorrect input.Enter your education correctly");
            education = in.next();
        }
        System.out.println("Enter your ZNO mark");
        String zno = in.next();
        while(!reg.mark(zno)){
            System.out.println("Incorrect input. Enter your ZNO correctly");
            zno = in.next();
        }


        System.out.println("Enter your dreams - a set of properties and ratings");
        String dreams = in.next();
        while(!reg.character(dreams)){
            System.out.println("Incorrect input.Enter your dreams - a set of properties and ratings correctly");
            dreams = in.next();
        }

    }
}