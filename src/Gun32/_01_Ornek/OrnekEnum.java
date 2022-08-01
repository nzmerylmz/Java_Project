package Gun32._01_Ornek;

import java.util.Scanner;

public class OrnekEnum {
    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {

        Aylar ay = Aylar.MAYIS;

        switch (ay) {
            case SUBAT:
                System.out.println("28");
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println("31");
                break;
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM:
                System.out.println("30");
                break;
        }

        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a : Aylar.values()) {
            System.out.println(a.ordinal() + " = " + a);
        }

    }
}
