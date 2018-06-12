package homeworks.meeting;


import homeworks.learn_enum.Sex;

import java.io.IOException;
import java.util.Scanner;

import static homeworks.test_zadanie.OperationArray.SCANNER;

public class TestMeeting {

    private PersonService personService;

    public TestMeeting() throws IOException {
        personService = new PersonService();
        //System.setOut();
    }

    public static void main(String[] args) throws Exception {

        TestMeeting testMeeting = new TestMeeting();
        testMeeting.showMenuOperationArray();
    }

    public void showMenuOperationArray() {

        int userActionNumber;

        do {
            System.out.println("------- Dating for dating -------\n" +
                    "1 - To be registered to the person is more senior 18 years\n" +
                    "2 - After registration, list the suitable men / women for this person by age\n" +
                    "3 - View people who have registered. For men, only women should be removed and vice versa\n" +
                    "4 - View the profile of an individual (search by name and surname)\n" +
                    "5 - Organize \"smart search\". The user enters requirements (city, gender, age, number of children) and displays people who meet the requirements\n" +
                    "0 - Exit");
            try {
                userActionNumber = SCANNER.nextInt();
                doAction(userActionNumber);
            } catch (Exception e) {
                System.out.println("Input Error\n:  " + e);
                userActionNumber = -1;
                e.printStackTrace();
            }
        } while (userActionNumber != 0);
    }

    public void doAction(int userActionNumber) {
        Scanner sc = new Scanner(System.in);

        switch (userActionNumber) {

            //1 - To be registered to the person is more senior 18 years
            case 1: {

                System.out.print("Enter the person's age:");

                int age = SCANNER.nextInt();

                System.out.print("Enter the person's gender:");

                Sex sex = Sex.valueOf(sc.nextLine().toUpperCase());

                System.out.println("Enter the person's name:");

                String name = sc.nextLine();

                System.out.println("Enter the person's surname:");

                String surname = sc.nextLine();

                System.out.print("Enter the number of children:");

                int children = SCANNER.nextInt();

                System.out.print("Enter the city where you live:");

                String city = sc.next();

                Man man = new Man(sex, name, surname, age, children, city);

                personService.addPersonWithMaxAge(man);
                break;
            }
            //После регистрации выводить список подходящих мужчин/ женщин для этого человека по возрасту
            //2 - After registration, list the suitable men / women for this person by age
            case 2: {

                System.out.print("Enter genter man: ");

                Sex sex = Sex.valueOf(sc.nextLine().toUpperCase());

                personService.showRegistrationPerson(sex);

                break;
            }

            //Просматривать зарегистрировавшихся людей. Для мужчин выводить только женщин и наоборот
            // View people who have registered. For men, only women should be removed and vice versa
            case 3: {

                System.out.print("Enter genter man: ");

                Sex sex = Sex.valueOf(sc.nextLine().toUpperCase());

                personService.showRegistrationPerson(sex);

                break;
            }


            //Просматривать анкету отдельного человека(поиск по имени и фамилии)
            // View people who have registered. For men, only women should be removed and vice versa
            case 4: {

                System.out.println("Enter the person's name:");

                String name = sc.nextLine();

                System.out.println("Enter the person's surname:");

                String surname = sc.nextLine();

                personService.searchManByFirstNameAndLastName(name, surname);

                break;
            }

            //Организовать "умный поиск". Пользователь вводит требования(город, пол, возраст, количество детей)
            //   и  выводить людей, которые соответствуют требованиям
            // Organize "smart search". The user enters requirements (city, gender, age, number of children) and displays people who meet the requirements
            case 5: {

                System.out.print("Enter the city where you live:");

                String city = sc.nextLine();

                System.out.print("Enter genter man");

                Sex sex = Sex.valueOf(sc.nextLine().toUpperCase());

                System.out.print("Enter the person's age:");

                int age = SCANNER.nextInt();

                System.out.print("Enter the number of children:");

                int children = SCANNER.nextInt();

                personService.smartSearchCitySexAgeChildren(city, sex, age, children);

                break;
            }

        }
    }
}