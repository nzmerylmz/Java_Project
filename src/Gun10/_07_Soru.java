package Gun10;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Öğrencinin notunu giriniz= ");
        int not = scan.nextInt();

        if (not >= 50) {
            System.out.println("Geçtiniz");
        }
        if (not < 50) {
            System.out.println("Kaldınız");
        }
    }
}
