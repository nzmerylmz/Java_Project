package Gun20;

import java.util.Scanner;

public class _06_JavaMethodSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int işlem;
        do {
            System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n5.Faktöriyel\n6.Çıkış\nBir işlem seçiniz: ");
            işlem = scan.nextInt();
            switch (işlem) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    faktoriyel();
                    break;
            }
        } while (işlem != 6);
        System.out.println("İşlem bitti!");
    }

    public static void toplama() {
        Scanner oku = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();
        System.out.println("Toplam sonuc: " + (sayi1 + sayi2));
        System.out.println();
    }

    public static void cıkarma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();
        System.out.println("Cıkarma sonuc: " + (sayi1 - sayi2));
        System.out.println();
    }

    public static void carpma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();
        System.out.println("Carpım: " + (sayi1 * sayi2));
        System.out.println();
    }

    public static void bolme() {
        Scanner oku = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();
        System.out.println("Bolum: " + (sayi1 / sayi2));
        System.out.println();
    }

    public static void faktoriyel() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int sayi = oku.nextInt();
        int carpım = 1;
        for (int i = 1; i <= sayi; i++) {
            carpım *= i;
        }
        System.out.println("Sonuc: "+carpım);
        System.out.println();
    }
}
