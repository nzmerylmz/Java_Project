package Gun20;

import java.util.Scanner;

public class _06_JavaMethodSoruCozum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secim = 0;
        do {

            menuYaz();
            secim = scan.nextInt();
            if (secim < 6 && secim > 0) {
                islemYap(secim);
            }

        } while (secim < 6 && secim > 0);
    }

    public static void menuYaz() {
        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n5.Faktöriyel\n6.Çıkış\nBir işlem seçiniz: ");
    }

    public static void islemYap(int secim) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;

        if (secim < 5) {
            System.out.print("1.sayi= ");
            sayi1 = scan.nextInt();
            System.out.print("2.sayi= ");
            sayi2 = scan.nextInt();
        } else {
            System.out.print("Sayi= ");
            sayi1 = scan.nextInt();
        }
        switch (secim) {
            case 1: toplamYaz(sayi1,sayi2); break;
            case 2: cıkartmaYaz(sayi1,sayi2); break;
            case 3: carpmaYaz(sayi1,sayi2); break;
            case 4: bolmeYaz(sayi1,sayi2); break;
            case 5: faktoriyelYaz(sayi1); break;
        }
    }
    public static void toplamYaz (int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }
    public static void cıkartmaYaz (int sayi1, int sayi2){
        System.out.println(sayi1-sayi2);
    }
    public static void carpmaYaz (int sayi1, int sayi2){
        System.out.println(sayi1*sayi2);
    }
    public static void bolmeYaz (int sayi1, int sayi2){
        System.out.println(sayi1/sayi2);
    }
    public static void faktoriyelYaz (int sayi1){
        int carpım = 1;
        for (int i = 1; i <= sayi1; i++) {
            carpım *= i;
        }
        System.out.println("Sonuc: "+carpım);
    }
}
