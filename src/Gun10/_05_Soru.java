package Gun10;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi/10)%10;

        if (onlar == 2 && sayi!=20) {
            System.out.print("Yirmi ");
        }
        if (sayi == 20) {
            System.out.print("Yirmi");
        }

        if (birler == 1) {
            System.out.print("Bir");
        }
        if (birler == 2) {
            System.out.print("İki");
        }
        if (birler == 3) {
            System.out.print("Üç");
        }
        if (birler == 4) {
            System.out.print("Dört");
        }
        if (birler == 5) {
            System.out.print("Beş");
        }
        if (birler == 6) {
            System.out.print("Altı");
        }
        if (birler == 7) {
            System.out.print("Yedi");
        }
        if (birler == 8) {
            System.out.print("Sekiz");
        }
        if (birler == 9) {
            System.out.print("Dokuz");
        }
    }
}
