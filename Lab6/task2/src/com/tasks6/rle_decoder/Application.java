package com.tasks6.rle_decoder;
import java.util.Scanner;
public class Application
{
    public static void main(String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String source = scan.nextLine();
        if (source == "" || source == null) {
            System.out.println("");
        }
        else {
            char[] stArr = source.toCharArray();
            char lastseen = 0;
            StringBuffer sb = new StringBuffer();
            for (char s : stArr) {
                    if (!Character.isDigit(s)) {
                    lastseen = s;
                    sb.append(s);
                    } else {
                    int n = Integer.parseInt(String.valueOf(s));
                    for (int i = 0; i < n - 1; i++) {
        sb.append(lastseen);
        }
        }
        }
        System.out.println(sb.toString());
        }
        }
        }
