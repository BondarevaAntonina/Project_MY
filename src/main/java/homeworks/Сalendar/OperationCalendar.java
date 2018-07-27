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

    public OperationCalendar() throws IOException {
        applicationCalendar = new ApplicationCalendar();

    }

    public static void main(String[] args) throws IOException {


        //OperationCalendar operationCalendar = new OperationCalendar();
        //operationCalendar.showMenuOperationCalendar();

        ApplicationCalendar applicationCalendar = new ApplicationCalendar();
        Date d1 = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d1);
        c.add(Calendar.DATE, 1);
        d1 = c.getTime();


        applicationCalendar.createEvent( d1, "task1");
        //applicationCalendar.createEvent(new Date(), "task2");


        applicationCalendar.souldDateZone();

    }


/*
    public void showMenuOperationCalendar() {

        int actionNumber;

        do {
            System.out.println("\n---------- Menu -----------\n" +
                    "1 - Add events on date \n" +
                    "2 - Display the current time and date in several time zones (to choose from). When outputting the " +
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
            // add events on date
            case 1:
                System.out.print("Enter the month: ");
                int month = sc.nextInt();
                System.out.print("Enter the day: ");
                int day   = sc.nextInt();
                System.out.print("Enter the year: ");
                int year  = sc.nextInt();
                Date date = Date. of(year, month, day);
                System.out.print("Enter the event: ");
                String name = sc.next();
                applicationCalendar.createEvent(date, name);
                System.out.println(date + " " + "Event: " + name);
                break;

            case 2:
                System.out.print("Enter the month: ");
                int month1 = sc.nextInt();
                System.out.print("Enter the day: ");
                int day1   = sc.nextInt();
                System.out.print("Enter the year: ");
                int year1  = sc.nextInt();
                LocalDate date1 = LocalDate.of(year1, month1, day1);
                applicationCalendar.souldDateZone();
                break;
        }

    }
    */
}
