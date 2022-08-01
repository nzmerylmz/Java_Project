package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //başka zaman bölgelerinin saat dilimlerini alma

        ZonedDateTime zdtLokal = ZonedDateTime.now();
        System.out.println("zdtLokal = " + zdtLokal);

//        

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("chic")) {
                System.out.println("z = " + z);
            }
        }

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        
        ZoneId zoneChicago=ZoneId.of("America/Chicago");
        ZonedDateTime ztdChi = ZonedDateTime.now(zoneChicago);
        System.out.println("ztdChi = " + ztdChi);
        System.out.println("Chicago Local Time: " + ztdChi.format(ozelFormat));
    }
}
