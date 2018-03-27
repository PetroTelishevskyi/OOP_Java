package com.tasks6.rle;
import java.util.Scanner;

public class Application
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String str = "";
        int count = 1;
        if (s == "") {
            System.out.println("");
            if(s == null){
                System.out.println("Error");
            }
        }
        else {
            char[] str1 = s.toCharArray();
            for (int i = 0; i <str1.length-1; i++) {
                if (str1[i] == str1[i + 1] && count < 9)  {
                    count++;
                }
                else {
                    if(count==1){
                        str=str+str1[i];
                    }
                    else {
                        str = str + str1[i] + count;
                        count=1;
                    }
                }
            }
            if(count==1) {
            str=str+str1[str1.length-1];
            }
            else {
            str=str+str1[str1.length-1]+count;
            }

        }
        System.out.println(str);
    }
}
