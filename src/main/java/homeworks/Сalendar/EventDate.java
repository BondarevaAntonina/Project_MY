package homeworks.Сalendar;

import java.lang.reflect.Array;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by antoni on 26.07.2018.
 */
public class EventDate {


    private String nameEvent;
    private LocalDate date;


    public EventDate(String nameEvent, LocalDate date) {
        this.nameEvent = nameEvent;
        this.date = date;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public LocalDate getDate() {
        return date;
    }
}

