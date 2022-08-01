package Gun10;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz= ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Negatif");
        }
        if (number > 0) {
            System.out.println("Pozitif");
        }
        if (number == 0) {
            System.out.println("Sifir");
        }
    }
}
