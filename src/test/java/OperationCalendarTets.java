import homeworks.calendar.ApplicationCalendar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDateTime;

/**
 * Created by antoni on 16.08.2018.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ApplicationCalendar.class})
public class OperationCalendarTets {

    @Test
    public void shouldMock() {
        PowerMockito.mockStatic(ApplicationCalendar.class);

        LocalDateTime time = LocalDateTime.of(18, 7, 7, 13, 0);

        PowerMockito.when(ApplicationCalendar.getLocalDateTime()).thenReturn(time);

        System.out.println(ApplicationCalendar.getLocalDateTime());
    }

}
