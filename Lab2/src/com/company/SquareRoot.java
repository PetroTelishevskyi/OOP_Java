package com.company;
import java.util.Scanner;
public class SquareRoot {

    public static void main(String[] args) {
        //Ввід з калавіатури коєфіцієнтів a,b,c.
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        //Перевірка чи кофіцієнти не рівні нулю;
        if((a != 0) & (b != 0) & (c != 0)) {
            //Знаходження дескрімананта і коренів рівняння;
            double Descriminant = (b * b) - (4 * a * c);
            double D = Math.sqrt(Descriminant);
            //Перевірка дескріманта чи </> за 0;
            if (D < 0) {
                System.out.println("x1=" + "\n");
                System.out.println("x2=" + "\n");
                return;
            }
            else if (D >= 0) {
                double x1 = (-b + D) / (2 * a);
                double x2 = (-b - D) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
                return;
            }
        }
        // Перевірки кофіціїнтів чи вони нерівні 0;
        if(((a==0) & (b==0) & (c==0)) || ((a==0) & (b == 0))) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }

        if((a==0) & (b != 0)) {
            if(c == 0) {
                double x1 = 0.0;
                System.out.println("x1="+x1);
                System.out.println("x2="+x1);
                return;
            }
            else if(c != 0) {
                double x1 = -(c/b);
                System.out.println("x1="+x1);
                System.out.println("x2="+x1);
                return;
            }

        }
        else if((a !=0) & (b == 0)){
            if(c != 0) {
                double x = c/a;
                double x1 = Math.sqrt(x);
                System.out.println("x1="+x1);
                System.out.println("x2="+x1);
            }
            else {
                double x1 = 0.0;
                System.out.println("x1="+x1);
                System.out.println("x2="+x1);
            }
        }

    }

}
