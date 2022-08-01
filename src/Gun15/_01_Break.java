package Gun15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        int arananSayi = 0;

        while (sayac < sayi) {
            if (sayi == sayac * sayac) {
                System.out.println("Bu sayi çalışır");
                arananSayi = sayac;
                break;
            }
            sayac++;
        }

        if (arananSayi > 0) {
            System.out.println("Tam karedir");
        } else {
            System.out.println("Tam kare değildir");
        }
    }
}

