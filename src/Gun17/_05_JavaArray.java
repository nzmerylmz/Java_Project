package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[7];
        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int ortalama;
        int adet = 0;

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi giriniz= ");
            dizi[i] = scan.nextInt();
            toplam = toplam + dizi[i];
        }
        ortalama = toplam / dizi.length;

        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j] > ortalama && dizi[j] % 2 == 1) {
                adet++;
                System.out.println(dizi[j]);
            }
        }
        System.out.println(adet);
    }
}
