package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz= ");
        int sayi1=scan.nextInt();

        System.out.print("İkinci sayıyı giriniz= ");
        int sayi2=scan.nextInt();

        System.out.println("Eşit mi= " + (sayi1==sayi2));

    }
}
