package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Bir sayi giriniz= ");
//        int sayi=scan.nextInt();
//        int toplam = 0;
//
//        while (sayi!=0) {
//            toplam=toplam+sayi;
//            System.out.print("bir sayı giriniz= ");
//            sayi = scan.nextInt();
//        }
//        System.out.print("Toplam= "+toplam);

        //2.Yol
        int toplam=0;
        int sayi=0;

        do {
            System.out.print("Bir sayi giriniz= ");
            sayi=scan.nextInt();
            toplam=toplam+sayi;
        } while (sayi!=0);
        System.out.print("Toplam = "+toplam);
    }
}
