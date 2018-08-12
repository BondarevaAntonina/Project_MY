import homeworks.calendar.ApplicationCalendar;
import homeworks.calendar.EventDate;
import homeworks.calendar.OperationCalendar;
import org.junit.Test;
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
@PrepareForTest(OperationCalendar.class)


public class LocalDateTimePowerMoke {


    private ApplicationCalendar calendar = new ApplicationCalendar();

    @Title("Create events on LocalDate.now ")
    @Test
    public void testCreateEventsToDate() {

        ArrayList<EventDate> events = calendar.getEvents();

        events.clear();

        calendar.createEvent(LocalDate.now(), "Testing");

        assertEquals("Testing", events.get(0).getNameEvent());

    }

    @Title("List events on LocalDate.now ")
    @Test
    public void testShouldEventsToDate() {

        ArrayList<EventDate> events = calendar.getEvents();

        LocalDate date = LocalDate.now();

        calendar.reviewListOfEventsOnTheDate(date);

    }

    @Test
    public void shouldMock() {
        PowerMockito.mockStatic(LocalDateTime.class);

        LocalDateTime of = LocalDateTime.of(18, 8, 13,4,2);

        PowerMockito.when(LocalDateTime.now()).thenReturn(of);

        System.out.println(LocalDateTime.now());
    }
}

