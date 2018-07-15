package lessons.learn_date;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class UseDate {
    public static void main(String[] args) {
        Date date = new Date(1500102588000L);

        date.setTime(new Date().getTime());

//        System.out.println(date);

        LocalDateTime ldt = LocalDateTime.now();

        LocalDateTime localDateTime = ldt.plusDays(3);

        Calendar calendar = Calendar.getInstance();

    }
}
