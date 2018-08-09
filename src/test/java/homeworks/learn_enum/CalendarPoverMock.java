package homeworks.learn_enum;


import homeworks.Сalendar.ApplicationCalendar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calendar.class)

public class CalendarPoverMock {


    @Test
    public void nowShouldReturnSameYear() throws Exception {
        LocalDate expected = LocalDate.parse();

        PowerMockito.spy(LocalDate.class);
        when(LocalDate.now()).thenReturn(LocalDate.parse("2018-08-08"));

        ApplicationCalendar ac = new ApplicationCalendar();

        Assert.assertEquals(expected.getDayOfYear(),ac.showDateInWeek();
    }



    @Test
    public void doTest() {
        mockStatic(LocalDateTime.class);
        when(LocalDateTime.now()).thenReturn(null);
        assertEquals(null, LocalDateTime.now());

        assertEquals(null, new Object() {

            public LocalDateTime run() {
                return LocalDateTime.now();
            }

        }.run());
    }

}
