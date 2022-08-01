package Gun05;

import java.util.Locale;
import java.util.Scanner;

public class _08_DoubleGirisi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH); //console'da virgül yerine nokta yazılabilsin
                                        // diye bunu yazıyoruz

        System.out.println("Bir DOUBLE deger giriniz: ");
        double deger= scan.nextDouble();
        System.out.println("deger = " + deger);
    }
}
