package Gun15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i=1; i<=5; i++) {
            System.out.print("Bir sayı giriniz= ");
            int sayi=scan.nextInt();

            if (sayi>6 && sayi<10)
                continue;

            toplam=toplam+sayi;
        }
        System.out.println(toplam);
    }
}
