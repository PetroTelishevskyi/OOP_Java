package ua.lpnuai.oop.telishevskyi11;



import java.util.Scanner;

public class Main {

    static void auto(){
        System.out.println("Creating list...");
        LinkedList<String> list = new LinkedList<String>();

        list.add("реєстраційний номер: 0011100");
        list.add("спеціальність: гружчик");
        list.add("освіта: вища");
        list.add("дата звільнення: 12.04.2018");
        list.add("вимоги до майбутньої роботи -\n спеціальність: менеджер");
        list.add("умови праці: повний робочий день");
        list.add("мінімальна зарплата: 10000");
        System.out.println(list.toString());
        list.delete(2);
        System.out.println("Конвертувати в масив...");
        Object[] arr = list.toArray();
        for (Object e: arr
                ) {
            System.out.println(e);
        }
        System.out.println("Очистити...");
        list.clean();
        System.out.println(list.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----Меню-----");
        String in;

        LinkedList<String> list = new LinkedList<String>();

        System.out.println("1-автозаповнення");
        System.out.println("2-заповнити");
        System.out.println("3-видалити");
        System.out.println("4-вивести");
        System.out.println("5-в масив");
        System.out.println("6-вийти");

        while(true){
            in = sc.nextLine();
            switch(in.toLowerCase()){

                case "1":
                    auto();
                    System.exit(0);
                    break;

                case "2":
                    System.out.println("реєстраційний номер:");
                    list.add(sc.nextLine());
                    System.out.println("спеціальність:");
                    list.add(sc.nextLine());
                    System.out.println("стаж:");
                    list.add(sc.nextLine());
                    System.out.println("освіта:");
                    list.add(sc.nextLine());
                    System.out.println("дата звільнення:");
                    list.add(sc.nextLine());
                    System.out.println("вимоги до майбутньої роботи -");
                    System.out.println("спеціальність:");
                    list.add(sc.nextLine());
                    System.out.println("умови праці:");
                    list.add(sc.nextLine());
                    System.out.println("мінімальна зарплата:");
                    list.add(sc.nextLine());
                    break;

                case "3":

                    System.out.println("Очистити лист...");
                    list.clean();
                    System.out.println("Очищено.");

                case "4":
                    System.out.println(list.toString());
                    break;

                case "5":
                    System.out.println("Конвертувати в масив...");
                    Object[] arr = list.toArray();
                    for (Object e: arr
                            ) {
                        System.out.println(e);
                    }
                    break;

                case "6":
                    System.out.println("До побачення");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}