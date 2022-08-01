package Gun10;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = scan.nextInt();

        if (sayi < 0) {
            sayi = sayi * -1;
        }

        if (sayi % 2 == 1) {
            System.out.println("sayi tektir");
        }

        if (sayi % 2 == 0) {
            System.out.println("sayi çifttir");
        }

    }
}
