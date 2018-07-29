package homeworks.Сalendar;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * java.time
 * Приложение должно позволять:
 * 1) Выводить текущее время и дату в нескольких тайм-зонах(на выбор). При выводе даты и времени выводить также события
 * на даный день.
 * 2) Создавать событие на конкретную дату и по требованию пользователя выводить список событий. Добавить возможность
 * удалять события.
 * 3) Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и выводить текущее время, день
 * недели в этой тайм-зоне.
 * 4) По требованию пользователя выводить в консоль дату через неделю, месяц, год.
 * 5) По требованию пользователя выводить в консоль только время и/или дату, день недели, номер дня в году, количество
 * дней оставшеееся до Нового Года.
 * 6) Позволить пользователю вводить формат даты и выводить дату в этом формате.
 */
public class ApplicationCalendar {

    private ArrayList<EventDate> events;

    public ApplicationCalendar() {
        events = new ArrayList<>();
    }

    private int countEvent = 0;//move to local variable

    Calendar calendar = Calendar.getInstance();//shouldn't use

    // Выводить текущее время и дату в нескольких тайм-зонах(на выбор)
    public void showDateInDifferentTimeZones() {

        calendar.setTime(new Date());//shouldn't use

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//shouldn't use

        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        //sdf3.setTimeZone(TimeZone.getTimeZone("Europe/Copenhagen"));
        //System.out.println( "Current date and time in a particular timezone America/New_York :" + sdf.format(calendar.getTime()));

        for (EventDate events : events) {//move to separate
            //System.out.println(events.getDate().compareTo(calendar.getTime()));
            if (events.getDate().equals(calendar.getTime()) /*after(calendar.getTime()*/) {

                //sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                System.out.println("Current date and time in a particular timezone America/New_York: "
                        + sdf.format(calendar.getTime()));

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                System.out.println("Current date and time in a particular timezone Our time zone:    "
                        + sdf1.format(events.getDate()));
                // sdf.setTimeZone(TimeZone.getDefault());
                // System.out.println(sdf.format(calendar.getTime()));
//                System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
                countEvent++;//should use boolean variable
            }
        }

        if (countEvent == 0) {
            System.out.println("No events on the given date");
        }
    }

    public void createEvent(Date date, String name) {

        EventDate event = new EventDate(name, date);

        events.add(event);
    }

    public void showEventsBySpecificDate() {

        for (EventDate events : events) {

            if (events.getDate().equals(calendar.getTime())) {

                System.out.println(events.getNameEvent());
            }
        }

        if (countEvent == 0)

            System.out.println("No events on the given date");

    }

    //Possibility to delete events by date
    public void deleteEvents(Date date) {

        events.add(new EventDate("BirthDay", new Date(1532846338000L)));
        events.add(new EventDate("BirthDay2", new Date()));


        for (EventDate event : events) {

            if (event.getDate().equals(date)) {
                events.remove(event);
                System.out.println(event.getNameEvent());
            }

        }

        System.out.println();

    }

    public void showDateInSpecificCountryAndCity(String countryAndCity) {

        ZoneId zoneName = ZoneId.of(countryAndCity);

        LocalDateTime localtDateAndTime = LocalDateTime.now();

        System.out.println(localtDateAndTime);

        ZonedDateTime dateTime = ZonedDateTime.now(zoneName);

//        int week = calendar.get(Calendar.DAY_OF_WEEK);

        DayOfWeek dayOfWeek = localtDateAndTime.getDayOfWeek();

        System.out.println("Current date and time in a particular timezone : " + dateTime +
                " week day " + dayOfWeek);

    }


}

