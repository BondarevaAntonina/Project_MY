package homeworks.Сalendar;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by antoni on 25.07.2018.
 */
public class OperationCalendar {

    public static final Scanner SCANNER = new Scanner(System.in);

    private ApplicationCalendar applicationCalendar;
    Calendar c = Calendar.getInstance();

    public OperationCalendar() throws IOException {
        applicationCalendar = new ApplicationCalendar();

    }

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
                    "2 - Create an event on a specific date and list the events as required by the user \n" +
                    "3 - Possibility to delete events \n" +
                    "4 - Allow the user to enter his city (country / city), define his time zone and display the " +
                        "current time, day of the week in this time zone \n" +

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

    public void doAction(int actionNumber) {
        Scanner sc = new Scanner(System.in);
        switch (actionNumber) {

    // Display the current time and date in several time zones (to choose from)
            case 1:

                Date d1 = new Date();

                c.setTime(d1);

                c.add(Calendar.DATE, 1);

                d1 = c.getTime();

                applicationCalendar.createEvent(d1, "task1");

                applicationCalendar.createEvent(new Date(), "task2");

                applicationCalendar.createEvent(new Date(), "task3");

                applicationCalendar.createEvent(new Date(), "task4");

                applicationCalendar.showDateInDifferentTimeZones();

                break;
    //Create an event on a specific date and list the events as required by the user
            case 2:
                Date d2 = new Date();

                c.setTime(d2);

                applicationCalendar.showEventsBySpecificDate();

                break;
    //Possibility to delete events
            case 3:
                Date d3 = new Date();

                c.setTime(d3);

                System.out.println("Delete list events");

                applicationCalendar.deleteEvents(new Date(1532846338000L));

                break;
    //Allow the user to enter his city (country / city), define his time zone
            case 4:

                System.out.print("Enter country/city:");

                String nameFlightCountryCity = sc.nextLine();

                applicationCalendar.showDateInSpecificCountryAndCity(nameFlightCountryCity);


                break;
        }

    }

}
