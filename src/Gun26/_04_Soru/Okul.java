package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //Ogretmen için not defteri programı yapılması isteniyor.
        //Her öğrencinin okulno (int), tamAdı(String) ve notu (int) vardır.
        //Ogretmenden 3 öğrenci için bu bilgileri alınız.
        //Butun sınıfı bir metodda yazdırınız.
        //Sınıfın not ortalamasını yine bir metodda yazdırınız.


        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        ArrayList<Ogrenci> snf = new ArrayList<>();


        for (int i = 0; i < 2; i++) {
            Ogrenci ogrenciBilgileri = new Ogrenci();
            System.out.print("Okul nosu giriniz: ");
            ogrenciBilgileri.okulNo = scanInt.nextInt();

            System.out.print("Ogrenci tam adı yazınız: ");
            ogrenciBilgileri.tamAdi = scan.nextLine();

            System.out.print("Not girişi yapınız: ");
            ogrenciBilgileri.not = scanInt.nextInt();

            snf.add(ogrenciBilgileri);
        }

        bilgiYazdir(snf);
        ortalamaYaz(snf);
    }

    public static void bilgiYazdir(ArrayList<Ogrenci> snf) {
        for (Ogrenci ogr : snf) {
            System.out.println(ogr.okulNo + " " + ogr.tamAdi + " " + ogr.not);
        }
    }

    public static void ortalamaYaz(ArrayList<Ogrenci> snf) {
        int toplam = 0;
        for (Ogrenci ogr : snf) {
            toplam += ogr.not;
        }
        System.out.println("Ortalama: " + (toplam / snf.size()));
    }
}


