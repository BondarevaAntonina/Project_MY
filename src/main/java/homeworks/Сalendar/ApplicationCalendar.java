package homeworks.Сalendar;

import sun.security.util.Length;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.*;

/**
 * java.time
 * Приложение должно позволять:
 * 1) Выводить текущее время и дату в нескольких тайм-зонах(на выбор). При выводе даты и времени выводить также события
 * на даный день. СДЕЛАНО
 * 2) Создавать событие на конкретную дату и по требованию пользователя выводить список событий. Добавить возможность
 * удалять события. СДЕЛАНО
 * 3) Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и выводить текущее время, день
 * недели в этой тайм-зоне. СДЕЛАНО
 * 4) По требованию пользователя выводить в консоль дату через неделю, месяц, год. СДЕЛАНО
 * 5) По требованию пользователя выводить в консоль только время и/или дату, день недели, номер дня в году, количество
 * дней оставшеееся  до Нового Года.
 * 6) Позволить пользователю вводить формат даты и выводить дату в этом формате.
 */
public class ApplicationCalendar {

    private ArrayList<EventDate> events;

    public ApplicationCalendar() {
        events = new ArrayList<>();
    }


    //Display the current time and date in several time zones (to choose from)

    public void showDateInDifferentTimeZones() {

        LocalDateTime today = LocalDateTime.now();

        System.out.println("Current Date= " + today);

        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println("Current Date in IST=" + todayKolkata);

        events.add(new EventDate("Trip on a business trip", LocalDate.now()));

        events.add(new EventDate("Webinar2", LocalDate.of(2018, 8, 3)));

        events.add(new EventDate("Vacation", LocalDate.of(2018, 8, 2)));

        events.add(new EventDate("Vacation", LocalDate.of(2018, 8, 1)));

        reviewListOfEventsOnTheDate(LocalDate.now());
    }

    //Create an event on a specific date and list the events as required by the user

    public void createEvent(LocalDate date, String nameEvent) {

        EventDate event = new EventDate(nameEvent, LocalDate.now());

        events.add(event);
    }

    //Output event list

    public void showEventsBySpecificDate(LocalDate date) {

        events.add(new EventDate("Lessons", LocalDate.of(2018, 8, 3)));

        events.add(new EventDate("Webinar", LocalDate.of(2018, 8, 2)));

        events.add(new EventDate("Webinar2", LocalDate.of(2018, 8, 1)));

        events.add(new EventDate("Webinar3", LocalDate.of(2018, 8, 3)));

        events.add(new EventDate("Webinar4", LocalDate.now()));

        reviewListOfEventsOnTheDate(LocalDate.now());

    }

    public void reviewListOfEventsOnTheDate(LocalDate date) {
        for (EventDate event : events) {

            if (event.getDate().equals(date)) {

                System.out.println(event.getNameEvent());
            }
        }

    }

    //Possibility to delete events by date

    public void deleteEvents(LocalDate date) throws ConcurrentModificationException {

        events.add(new EventDate("BirthDay", LocalDate.of(2018, 8, 3)));

        events.add(new EventDate("BirthDay2", LocalDate.now()));

        for (EventDate event : events) {

            if (event.getDate().equals(date)) {

                events.remove(event);

                System.out.println(event.getNameEvent());
            }
        }
        System.out.println();
    }

    // Allow the user to enter his city (country / city), define his time zone

    public void showDateInSpecificCountryAndCity(String countryAndCity) {

        ZoneId zoneName = ZoneId.of(countryAndCity);

        LocalDateTime localtDateAndTime = LocalDateTime.now();

        System.out.println(localtDateAndTime);

        ZonedDateTime dateTime = ZonedDateTime.now(zoneName);

        DayOfWeek dayOfWeek = localtDateAndTime.getDayOfWeek();

        System.out.println("Current date and time in a particular timezone : " + dateTime +
                " week day " + dayOfWeek);
    }

    // Output date in a week, month, year

    public void showDateInWeek() {

        LocalDate localtDate = LocalDate.now();

        System.out.println("The current date: " + localtDate);

        localtDate = localtDate.plusWeeks(1);

        System.out.println("Output date in a week: " + localtDate);

        localtDate = localtDate.plusMonths(1);

        System.out.println("Output date in a month: " + localtDate);

        localtDate = localtDate.plusYears(1);

        System.out.println("Output date in a year: " + localtDate);

    }


    //Conclusion time and / or date, day of the week, day of the year, the number of days left before the New Year

    public void showNumberOfDaysLeftUntilNewYear() {

        LocalDate localDate = LocalDate.now();

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();


        System.out.println("The current date: " + localDate + "\n" +
                "week:  " + dayOfWeek + "\n" +
                "day of the year:  " + localDate.getDayOfYear() + "\n" +
                "number of days left until the New Year: " +
                (localDate.lengthOfYear() - localDate.getDayOfYear()));
    }

    // Display the date format and display the date in this format

    public void showFormatDate() throws ParseException {

        LocalDate localDate = LocalDate.now();
        System.out.println("standard date format for LocalDate : " + localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("standard date format for LocalDateTime : " + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        System.out.println("standard date format: " + timestamp);

        String date_s = " 2018-08-01 00:00:00.0";
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = dt.parse(date_s);
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(dt1.format(date));
    }
}

