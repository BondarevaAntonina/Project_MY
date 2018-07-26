package homeworks.Сalendar;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by antoni on 25.07.2018.
 */
public class OperationCalendar {

    public static final Scanner SCANNER = new Scanner(System.in);

    private ApplicationCalendar applicationCalendar;

    public OperationCalendar() throws IOException {
        applicationCalendar = new ApplicationCalendar();

    }
    EventDate eventDate = new EventDate();

    public static void main(String[] args) throws IOException {


        OperationCalendar operationCalendar = new OperationCalendar();
        operationCalendar.showMenuOperationCalendar();

    }

    public void showMenuOperationCalendar() {

        int actionNumber;

        do {
            System.out.println("\n---------- Menu -----------\n" +
                    "1 - Display the current time and date in several time zones (to choose from). When outputting the " +
                    "date and time, also output the events for the given day\n" +


                    "0 - Exit");
            try {
                actionNumber = SCANNER.nextInt();
                doAction(actionNumber);
            } catch (Exception e) {
                System.out.println("Input Error: " + e);
                actionNumber = -1;
                e.printStackTrace();
            }
        } while (actionNumber != 0);

    }

    public void doAction(int actionNumber) throws Exception {
        Scanner sc = new Scanner(System.in);
        switch (actionNumber) {
            case 1:
                applicationCalendar.souldDateZoneAndDevelopments();
                eventDate.shoudDateEvent();
                break;



        }

    }






}
