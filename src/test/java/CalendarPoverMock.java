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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


@RunWith(PowerMockRunner.class)
@PrepareForTest(LocalDateTime.class)
public class CalendarPoverMock {

    private ApplicationCalendar calendar = new ApplicationCalendar();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Title("Create events on LocalDate.now ")
    @Test
    public void testCreateEventsToDate() {

        ArrayList<EventDate> events = calendar.getEvents();

        events.clear();

        calendar.createEvent(LocalDate.now(), "Testing");

        assertEquals("Testing", events.get(0).getNameEvent());

    }

    @Test
    public void shouldShowDateinDifferentTimeZones() {

        PowerMockito.mockStatic(LocalDateTime.class);

        PowerMockito.when(LocalDateTime.now()).thenReturn(LocalDateTime.of(2018, 8, 11, 13, 0));

        System.out.println();
    }

    @Test
    public void shouldEventsToDate() throws Exception {

        assertEquals(LocalDate.now(), "Testing");


    }

    @Test
    public void nowShouldReturnSameYear() throws Exception {

        ApplicationCalendar applicationCalendar = new ApplicationCalendar();

        ApplicationCalendar spyCalend = PowerMockito.spy(applicationCalendar);

        PowerMockito.doReturn(spyCalend).when(spyCalend, LocalDate.now());


    }

}

