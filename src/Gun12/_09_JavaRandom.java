package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi= scan.nextInt();

        int randomSayi=(int)(Math.random()*sayi);

        System.out.print("Bir tahmin giriniz: ");
        int sayi2= scan.nextInt();

        String Sonuc=(randomSayi==sayi2) ? "Tebrikler" : "Hatalı";
        System.out.println("Random sayı = " + randomSayi);
        System.out.println("Sonuc = " + Sonuc);
    }
}
