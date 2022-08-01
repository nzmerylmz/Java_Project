package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        int sayac = 1;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);

        while (sayac <= 5) {
            System.out.println(sayac+".sayı giriniz= ");
            int num = scan.nextInt();
            sayac++;
            toplam = toplam + num;
        }
        System.out.println(toplam);
    }
}
