package homeworks.Сalendar;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * java.time
 * Приложение должно позволять:
 * 1) Выводить текущее время и дату в нескольких тайм-зонах(на выбор). При выводе даты и времени выводить также снобытия на даный день.
 * 2) Создавать событие на конкретную дату и по требованию пользователя выводить список событий. Добавить возможность удалять события.
 * 3) Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и выводить текущее время, день недели в этой тайм-зоне.
 * 4) По требованию пользователя выводить в консоль дату через неделю, месяц, год.
 * 5) По требованию пользователя выводить в консоль только время и/или дату, день недели, номер дня в году, количество дней оставшеееся до Нового Года.
 * 6) Позволить пользователю вводить формат даты и выводить дату в этом формате.
 */
public class ApplicationCalendar {


        public void souldDateZoneAndDevelopments() {

            ZoneId america = ZoneId.of("America/New_York");
            LocalDateTime localtDateAndTime = LocalDateTime.now();
            System.out.println(localtDateAndTime);
            ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
            System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);



        }

}

