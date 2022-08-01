package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayListSoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Sayi giriniz");
            array[i] = scan.nextInt();
        }
        System.out.println(tekleriYazdır(array));
    }

    public static ArrayList<Integer> tekleriYazdır(int[] dizi) {

        ArrayList<Integer> sayılar = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                sayılar.add(dizi[i]);
            }
        }
        return sayılar;
    }
}
