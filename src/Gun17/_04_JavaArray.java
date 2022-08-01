package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        int toplam = 0;
        int ortalama;
        int adet=0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Not giriniz= ");
            dizi[i] = scan.nextInt();
            toplam = toplam + dizi[i];
        }
        ortalama = (toplam / dizi.length);
        for (int j = 0; j < dizi.length ; j++) {
            if (dizi[j]>ortalama) {
                System.out.println(dizi[j]);
                adet=adet+1;
            }
        }
        System.out.println(adet);
    }
}
