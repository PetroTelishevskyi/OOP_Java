package ua.lpnuai.oop.telishevskyi08;

public class Helper {
    public static void PrintSymbols(final String line) {

        StringBuilder str = new StringBuilder();

        for (char symbol : line.toCharArray()) {
            str.append(symbol + ",\t");
        }

        System.out.println(str.toString());
    }

    public static void PrintSymbol(final String line) {


        StringBuffer str = new StringBuffer("");
        for(char ch : line.toCharArray()){
            if(Character.isAlphabetic(ch))
                str.append(String.format("%s,\t", ch));
        }

        System.out.println(str.toString());
    }