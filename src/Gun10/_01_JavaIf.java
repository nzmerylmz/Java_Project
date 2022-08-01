package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi=if
        // girilen bir sayının 10 dan büyük ise ekrana 10 büyük diye yazdırınız
        // Algoritma
        // 1-basla
        // 2-sayı oku
        // 3-sayi>10 ise 10 dan büyük yaz
        // 4-Dur

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi= scan.nextInt();

        if (sayi > 10) {
            System.out.println("10 dan büyük");
        }
    }
}
