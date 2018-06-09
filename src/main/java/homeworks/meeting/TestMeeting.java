package homeworks.meeting;


import java.io.IOException;

import static homeworks.test_zadanie.OperationArray.SCANNER;

public class TestMeeting {

    private PersonService personService;

    public TestMeeting() throws IOException {
        personService = new PersonService();
        //System.setOut();
    }

    public static void main(String[] args) throws Exception{
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

    public void doAction(int userActionNumber) throws Exception {

        switch (userActionNumber) {
            case 1:
                System.out.println("Enter number ");
                personService.addMan();
                break;


        }
    }
}