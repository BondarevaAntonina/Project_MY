package homeworks.Сalendar;

import java.util.Date;


/**
 * Created by antoni on 26.07.2018.
 */
public class EventDate {


    private String nameEvent;
    //private LocalDate date;
    private Date date;


    public EventDate(String nameEvent, Date date) {
        this.nameEvent = nameEvent;
        this.date = date;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public Date getDate() {

        return date;
    }
}

