package ua.lpnuai.oop.telishevskyi08;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Helper.PrintSymbols(text);
        Helper.PrintSymbol(text);
    }
}