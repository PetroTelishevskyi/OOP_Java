package ua.lpnuai.oop.telishevskyi10;



public class Application {

    public static void main(String[] args) {
        CadreAgency[] list_people=new CadreAgency[2];

        list_people[0]= new CadreAgency();
        list_people[0].setSpecialty("Автомеханік");
        list_people[0].setExperience("1,5 року");
        list_people[0].setEducation("Вища");
        list_people[0].setDate_release("12 липня");
        list_people[0].setNew_specialty("Інженер");
        list_people[0].setWorking_conditions("Повний робочий день");
        list_people[0].setSalary("12000 гривень");

        list_people[1]= new CadreAgency();
        list_people[1].setSpecialty("Відсутня");
        list_people[1].setExperience("Відсутня");
        list_people[1].setEducation("Вища");
        list_people[1].setDate_release("Не працював до того");
        list_people[1].setNew_specialty("Продавець");
        list_people[1].setWorking_conditions("Неповний робочий день");
        list_people[1].setSalary("1200 гривень");

        for (int i = 0; i < 2; i++) {
            System.out.println(list_people[i].getSpecialty());
            System.out.println(list_people[i].getExperience());
            System.out.println(list_people[i].getEducation());
            System.out.println(list_people[i].getDate_release());
            System.out.println(list_people[i].getNew_specialty());
            System.out.println(list_people[i].getWorking_conditions());
            System.out.println(list_people[i].getSalary());
            System.out.println();
        }
    }
}
