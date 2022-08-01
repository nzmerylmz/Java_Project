package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi = scan.nextInt();

        if (sayi < 0) {
            sayi = sayi * -1;
        }
        if (sayi % 2 == 1) {
            System.out.println("Tek");
        } else {
            System.out.println("Çift");
        }
    }
}
