package com.tasks5.command;

public class Application {
    public static void main(String[] args) {
        if(args == null || args.length > 2 || args.length == 0){
            System.out.println("Error");
            return;
        }
        if(args[0].equals("help") && args.length == 1)
            new Help().execute();
        else if(args[0].equals("echo") && args.length == 2) {
            new Echo(args[1]).execute();
        } else if(args[0].equals("date") && args.length == 2 && args[1].equals("now") ) {
            new Date().execute();
        } else if(args[0].equals("exit") && args.length == 1)
            new Exit().execute();
        else System.out.println("Error");
    }
}