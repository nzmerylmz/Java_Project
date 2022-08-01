package Gun42.StringToLocalDateAndTimeParse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        String strDate = "25 01 2020";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih = LocalDate.parse(strDate, format);
        System.out.println("tarih= " + tarih.format(format));
    }
}
