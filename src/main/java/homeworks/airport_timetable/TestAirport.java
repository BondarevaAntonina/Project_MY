package homeworks.airport_timetable;

import homeworks.learn_enum.Sex;
import homeworks.meeting.TestMeeting;

import java.util.Scanner;

import static homeworks.test_zadanie.OperationArray.SCANNER;

/**
 * Created by antoni on 12.06.2018.
 Создать приложение, позволяющие создавать расписание аэропорта.
 Приложение должно позволять:
 1) Создавать c.
 2) После ввода город прибытия и/или город отправления выводить список подходящих рейсов.
 3) Просматривать все рейсы.
 4) Просматривать информацию о конкретном рейсе.
 5) Организовать "умный поиск". Пользователь вводит требования(город отправления, город прибытия, время в полете, количество мест)
 и выводить рейс, который соответствует требованиям.
 Для полей "город отправления", "город прибытия" использовать enums.
 */
public class TestAirport {

    private TestAirport testAirport;

    public TestAirport() throws Exception {
        testAirport = new TestAirport();
    }

    public static void main(String[] args) throws Exception {

        TestAirport testAirport = new TestAirport();
        testAirport.showMenuFlight();
    }

    public void showMenuFlight() {

        int userActionNumber;

        do {
            System.out.println("------- Dating for dating -------\n" +
                    "1 - To be registered to the person is more senior 18 years\n" +

                    "0 - Exit");
            try {
                userActionNumber = SCANNER.nextInt();
                doAction(userActionNumber);
            } catch (Exception e) {
                System.out.println("Input Error\n:" + e);
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


//                testAirport.addPersonWithMaxAge(man);
                break;
            }


        }
    }
}
