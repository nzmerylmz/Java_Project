package Gun33.EnumEk;

import Gun33.EnumEk.Aylar;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay=Aylar.AGUSTOS;

        System.out.println(ay.ayNo);
        System.out.println(ay.gunMiktar);
        System.out.println(ay.isim);

        System.out.println("------------------");

        System.out.println(ay);
    }
}
