package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz= ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz= ");
        int sayi2 = scanner.nextInt();

        System.out.println("Bölüm= " + (sayi1 / sayi2));
    }
}
