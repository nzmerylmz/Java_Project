package Gun41.PeriodAndDuration;

import Gun27._01_Ornek.Person;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    //iki tarih arasındaki farkı gösterir
    //LocalDate ler için kullanılır
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1984, 1, 16);
        LocalDate bugunTarihi = LocalDate.now();

        Period fark= Period.between(dogumTarihi,bugunTarihi);
        System.out.println(fark);

        System.out.println(fark.getYears());
        System.out.println(fark.getMonths());
        System.out.println(fark.getDays());

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        LocalDate ucGunSonra= bugunTarihi.plus(period3Gun);
        LocalDate ucAySonra=bugunTarihi.plus(period3Ay);

        System.out.println(ucGunSonra);
        System.out.println(ucAySonra);

        Period period6Ay=Period.ofMonths(6);
        LocalDate kursunBaslangici = LocalDate.of(2022, 4, 18);
        LocalDate altiAySonra=kursunBaslangici.plus(period6Ay);
        System.out.println(altiAySonra);

        Period kalanSure= Period.between(altiAySonra,bugunTarihi);
        System.out.println(kalanSure);

    }
}
