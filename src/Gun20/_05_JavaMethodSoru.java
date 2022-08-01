package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethodSoru {
    public static void main(String[] args) {
        int[] dizi = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi: ");
            dizi[i] = scan.nextInt();
        }
        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

        int[] dizi2=new int[5];
        for (int i = 0; i < dizi.length ; i++) {
                dizi2[i]=dizi[i]*dizi[i];
        }
        enKucukYaz(dizi2);
        enBuyukYaz(dizi2);
        ortalamaYaz(dizi2);
    }
    public static void enKucukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En kucuk: " + dizi[0]);
    }
    public static void enBuyukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En kucuk: " + dizi[dizi.length - 1]);
    }
    public static void ortalamaYaz(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        int ort = toplam / dizi.length;
        System.out.println("Ort: " + ort);
    }
}
