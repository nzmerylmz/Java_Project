package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getHour = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " +
                            dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " +
                            dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("ozelFormat gün ve saat = " + dt.format(ozelFormat));



    }
}
