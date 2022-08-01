package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("ozelFormat1 = " + saat.format(ozelFormat1));

        while (!saat.format(ozelFormat1).equals("08:52:45")){
            saat=LocalTime.now();
            System.out.print("\rsaat = "+ saat.format(ozelFormat1));
            Thread.sleep(1000);
        }

    }
}
