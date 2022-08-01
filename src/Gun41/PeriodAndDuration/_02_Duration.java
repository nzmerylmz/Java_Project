package Gun41.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    //Localtime ve LocalDateTime için kullanılır
    //bunlar arasındaki farkı gösterir
    public static void main(String[] args) {
        LocalTime geceYarisi = LocalTime.of(0, 0);
        LocalTime ogleVakti = LocalTime.of(13, 3, 2);

        Duration fark = Duration.between(geceYarisi, ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark.toDays() = " + fark.toDays());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.getSeconds() = " + fark.getSeconds());


        LocalDateTime from=LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to=LocalDateTime.of(2020,11,14,11,21,56);

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());
        System.out.println("farkZaman.getSeconds() = " + farkZaman.getSeconds());


    }
}
