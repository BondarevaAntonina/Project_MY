package homeworks.Сalendar;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
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
                    "3 - output event lists \n" +
                    "4 - Possibility to delete events \n" +
                    "5 - Allow the user to enter his city (country / city), define his time zone and display the " +
                    "5 - Allow the user to enter his city (country / city), define his time zone and display the " +
                        "current time, day of the week in this time zone \n" +
                    "6 - Output date in a week, month, year \n" +
                    "7 -  \n" +

                    "0 - Exit");
            try {
                actionNumber = SCANNER.nextInt();
                doAction(actionNumber);
            } catch (Exception e ) {
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

                applicationCalendar.showDateInDifferentTimeZones();

                break;

    //Create an event on a specific date and list the events as required by the user
            case 2:

                applicationCalendar.createEvent(LocalDate.now(),"Going to the gym");

                break;

    //Output event list

            case 3:

                applicationCalendar.showEventsBySpecificDate(LocalDate.now());

                break;

    //Possibility to delete events
            case 4:

                applicationCalendar.deleteEvents(LocalDate.of(2018,8,3));

                break;

    //Allow the user to enter his city (country / city), define his time zone
            case 5:

                System.out.print("Enter country/city:");

                String nameFlightCountryCity = sc.nextLine();

                applicationCalendar.showDateInSpecificCountryAndCity(nameFlightCountryCity);

                break;

    // Output date in a week, month, year

            case 6:

                applicationCalendar.showDateInWeek();

                break;
        }

    }

}
