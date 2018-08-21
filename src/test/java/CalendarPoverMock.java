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
import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest(ApplicationCalendar.class)
public class CalendarPoverMock {

    private ApplicationCalendar calendar = new ApplicationCalendar();

    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();


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

        LocalDateTime ldt = LocalDateTime.of(2018, 8, 16, 13, 0);//move to constant

        when(ApplicationCalendar.getLocalDateTime()).thenReturn(ldt);

        calendar.showDateInDifferentTimeZones();

        assertEquals(ldt, ApplicationCalendar.getLocalDateTime());

    }


    @Title("Create events on LocalDate.now ")
    @Test
    public void testShowDateInWeek() {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDate ldt = LocalDate.of(2018, 8, 16);

        PowerMockito.when(ApplicationCalendar.getLocalDate()).thenReturn(ldt);

        calendar.showDateInWeek();

        String log = outRule.getLog();

        assertTrue(log.contains("The current date: 2018-08-17"));

        assertTrue(log.contains("Output date in a week: 2018-08-24"));

        assertTrue(log.contains("Output date in a month: 2018-09-24"));

        assertTrue(log.contains("Output date in a year: 2019-09-24"));
    }

    @Title("Display the date format and display the date in this format ")
    @Test
    public void testShowFormatDate() throws ParseException {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDateTime of = LocalDateTime.of(2018, 8, 16, 13, 0);

        PowerMockito.when(ApplicationCalendar.getLocalDateTime()).thenReturn(of);

        calendar.showFormatDate();

        String log = outRule.getLog();

        assertEquals(of, ApplicationCalendar.getLocalDateTime());


    }

    @Title("Create events on LocalDate.now ")
    @Test
    public void testShowNumberOfDaysLeftUntilNewYear() {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDate of = LocalDate.of(2018, 8, 16);

        PowerMockito.when(ApplicationCalendar.getLocalDate()).thenReturn(of);

        calendar.showNumberOfDaysLeftUntilNewYear();

        String log = outRule.getLog();

        assertTrue(log.contains("The current date: 2018-08-17"));

        assertTrue(log.contains("week:  FRIDAY"));

        assertTrue(log.contains("day of the year:  229"));

        assertTrue(log.contains("number of days left until the New Year: 136"));

    }

    @Title("Display the date format and display the date in this format ")
    @Test
    public void testShowDateInSpecificCountryAndCity() throws ParseException {

        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDateTime of = LocalDateTime.of(2018, 8, 16, 13, 0);

        PowerMockito.when(ApplicationCalendar.getLocalDateTime()).thenReturn(of);

        calendar.showDateInSpecificCountryAndCity("Asia/Kolkata");

        String log = outRule.getLog();


    }


}


