package Gun41;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocaleDate sadece gün ay yıl bilgisi tutar

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " +
                tarih.format(DateTimeFormatter.ISO_DATE));

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.GERMANY)));

        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.FRENCH)));

        Locale[] kullanilabilirLocaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLocaller) {
            if (l.getDisplayCountry().toLowerCase().contains("new")) {
                System.out.println("l.getDisplayCountry() = " + l.getDisplayCountry() + " " + l + " " + l.getDisplayLanguage());
            }
        }
        Locale lokalIzlanda = new Locale("is", "IS");
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(lokalIzlanda)));

        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd.MM yy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("EEEE dd.MM yy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat2));

        LocalDate tarih1= LocalDate.of(1994,5,20);
        LocalDate tarih2= LocalDate.of(2021, Month.APRIL,12);

        System.out.println("tarih1.getDayOfWeek() = " + tarih1.getDayOfWeek());
        
    }
}
