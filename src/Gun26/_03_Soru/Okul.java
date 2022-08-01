package Gun26._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciBilgileri = new ArrayList<>();
        Ogrenci bilgiler = new Ogrenci();
        for (int i = 0; i < 2; i++) {
            System.out.print("İlk öğrencinin adını giriniz: ");
            bilgiler.adi = scan.nextLine();

            System.out.print("Oğrencinin soyadını giriniz: ");
            bilgiler.soyadi = scan.nextLine();

            System.out.print("Oğrencinin sınıfını giriniz: ");
            bilgiler.sinif = scan1.nextInt();

            System.out.print("Oğrencinin adresini giriniz: ");
            bilgiler.adres = scan.nextLine();

            ogrenciBilgileri.add(bilgiler);
        }
        for (Ogrenci ogr : ogrenciBilgileri) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}
