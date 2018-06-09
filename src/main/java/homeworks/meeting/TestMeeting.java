package homeworks.meeting;


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
                    "0 - Exit");
            try {
                userActionNumber = SCANNER.nextInt();
                doAction(userActionNumber);
            } catch (Exception e) {
                System.out.println("Input Error\n:  " + e);
                userActionNumber = -1;
            }
        } while (userActionNumber != 0);
    }

    public void doAction(int userActionNumber) {
        Scanner sc = new Scanner(System.in);

        switch (userActionNumber) {

            //1 - To be registered to the person is more senior 18 years
            case 1:

                System.out.print("Enter the person's age:");

                int age = SCANNER.nextInt();

                System.out.print("Enter the person's gender:");

                String shortName = sc.nextLine();

                System.out.println("Enter the person's name:");

                String name = sc.nextLine();

                System.out.println("Enter the person's surname:");

                String surname = sc.nextLine();

                System.out.print("Enter the number of children:");

                int children = SCANNER.nextInt();

                System.out.print("Enter the city where you live:");

                String city = sc.nextLine();

                personService.addMan(age, shortName, name, surname, children, city);

                break;


        }
    }
}