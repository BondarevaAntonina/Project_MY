package homeworks.Сalendar;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    ArrayList<EventDate> events = new ArrayList<>();

// Выводить текущее время и дату в нескольких тайм-зонах(на выбор)
    public void souldDateZone() {

        //ZoneId america = ZoneId.of("America/New_York");

        //LocalDateTime localtDateAndTime = LocalDateTime.now();
        //       System.out.println(localtDateAndTime);

//        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        //sdf3.setTimeZone(TimeZone.getTimeZone("Europe/Copenhagen"));
        //System.out.println( "Current date and time in a particular timezone America/New_York :" + sdf.format(calendar.getTime()));



        int countEvent = 0;
        for ( EventDate events: events) {
            //System.out.println(events.getDate().compareTo(calendar.getTime()));
            if ( events.getDate().compareTo(calendar.getTime()) == 0 /*after(calendar.getTime()*/) {


                //sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                System.out.println( "Current date and time in a particular timezone America/New_York :" + sdf.format(calendar.getTime()));
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                System.out.println( "Current date and time in a particular timezone                  :" + sdf1.format(events.getDate()));
               // sdf.setTimeZone(TimeZone.getDefault());
               // System.out.println(sdf.format(calendar.getTime()));
//                System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
                countEvent++;
            }
            // System.out.println("Нет событий на заданную дату");
        }

        if(countEvent == 0)
            System.out.println("No events on the given date");
    }

    public void createEvent(Date date, String name) {
        EventDate event = new EventDate(name, date);
        events.add(event);
    }



    public void shoudDateEvent() {
        LocalDateTime arrivalDate = LocalDateTime.now();

        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at : %s %n %s", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }

    }
}

