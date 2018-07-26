package homeworks.Сalendar;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by antoni on 26.07.2018.
 */
public class EventDate {


    private String nameEvent = "Вебинар";
    LocalDate date = LocalDate.of(2018, Month.JULY, 26);

    public void shoudDateEvent() {
        LocalDateTime arrivalDate = LocalDateTime.now();

        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at : %s %n %s", landing, nameEvent);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }
    }
}

