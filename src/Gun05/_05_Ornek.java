package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız
        int sayi1,sayi2; //int diye burada tanımlarsak aşağıda int sayi1=scan...
                         // diye yazmaya gerek yok

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        sayi1=scan.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        sayi2= scan.nextInt();

        int toplam= sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
