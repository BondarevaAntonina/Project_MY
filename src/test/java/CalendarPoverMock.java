import homeworks.calendar.ApplicationCalendar;
import homeworks.calendar.EventDate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.yandex.qatools.allure.annotations.Title;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest(ApplicationCalendar.class)
public class CalendarPoverMock {

    private ApplicationCalendar calendar = new ApplicationCalendar();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Title("Create events on LocalDate.now ")
    @Test
    public void testCreateEventsToDate() {

        ArrayList <EventDate> events = calendar.getEvents();

        events.clear();

        calendar.createEvent(LocalDate.now(), "Testing");

        assertEquals("Testing", events.get(0).getNameEvent());

    }

    @Title("Create events on LocalDate.now ")
    @Test
    public void testshowDateInDifferentTimeZones() {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDateTime of = LocalDateTime.of(2018, 8, 16, 13, 0);

        when(ApplicationCalendar.getLocalDateTime()).thenReturn(of);

        System.out.println(ApplicationCalendar.getLocalDateTime());

//        assertEquals("2018-08-16T13:00", ApplicationCalendar.getLocalDateTime());

    }


    @Title("Create events on LocalDate.now ")
    @Test
    public void testShowDateInWeek() {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDate of = LocalDate.of(2018, 8, 16);

        PowerMockito.when(ApplicationCalendar.getLocalDate()).thenReturn(of);

        calendar.showDateInWeek();
    }

    @Title("Display the date format and display the date in this format ")
    @Test
    public void testShowFormatDate() throws ParseException {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDateTime of = LocalDateTime.of(2018, 8, 16, 13, 0);

        PowerMockito.when(ApplicationCalendar.getLocalDateTime()).thenReturn(of);

        calendar.showFormatDate();
    }

    @Title("Create events on LocalDate.now ")
    @Test
    public void testShowNumberOfDaysLeftUntilNewYear() {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDate of = LocalDate.of(2018, 8, 16);

        PowerMockito.when(ApplicationCalendar.getLocalDate()).thenReturn(of);

        calendar.showNumberOfDaysLeftUntilNewYear();
    }


}

