import homeworks.Сalendar.ApplicationCalendar;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.yandex.qatools.allure.annotations.Title;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Calendar.class)

public class CalendarPoverMock {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Title("Create events on LocalDate.now ")
    @Test
    public void testCreateEventsToDate() {

        ApplicationCalendar applicationCalendar = new ApplicationCalendar();

        String nameEvent = applicationCalendar.createEvent(LocalDate.now(), "Testing");

        System.out.println(nameEvent);

        String log = systemOutRule.getLog();

        assertTrue(log.contains("Testing"));


    }

    @Test
    public void testSchouldEventsToDate() throws Exception {

        ApplicationCalendar applicationCalendar = new ApplicationCalendar();

        ApplicationCalendar spyCalend = PowerMockito.spy(applicationCalendar);

        PowerMockito.doReturn(LocalDate.now()).when(spyCalend, LocalDate.now());

        assertEquals(LocalDate.now(), "Testing");


    }

    @Test
    public void nowShouldReturnSameYear() throws Exception {

        ApplicationCalendar applicationCalendar = new ApplicationCalendar();

        ApplicationCalendar spyCalend = PowerMockito.spy(applicationCalendar);

        PowerMockito.doReturn(spyCalend).when(spyCalend, LocalDate.now());


    }

}

