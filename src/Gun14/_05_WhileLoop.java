package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int num = scan.nextInt();

        int sayac = 1;
        int toplam = 0;

        while (sayac <= num) {
            toplam = toplam + sayac;
            sayac = sayac + 2;
        }
        System.out.println("Tek sayıların toplamı= " + toplam);
    }
}
