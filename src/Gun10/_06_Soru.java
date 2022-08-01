package Gun10;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz= ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayiyi giriniz= ");
        int sayi2 = scan.nextInt();
        System.out.print("Üçüncü sayiyi giriniz= ");
        int sayi3 = scan.nextInt();

        int enb=sayi1;

        if (sayi2>enb) {
            enb=sayi2;
        }
        if (sayi3>enb) {
            enb=sayi3;
        }
        System.out.println("enb = " + enb);
    }
}
