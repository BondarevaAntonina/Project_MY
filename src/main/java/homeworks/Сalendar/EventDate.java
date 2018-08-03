package homeworks.Сalendar;

import java.time.LocalDate;


/**
 * Created by antoni on 26.07.2018.
 */
public class EventDate {

    private String nameEvent;
    private LocalDate date;
//    private Date date;


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

