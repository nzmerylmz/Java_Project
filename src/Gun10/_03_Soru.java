package Gun10;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz= ");
        int num1= scan.nextInt();

        System.out.println("İkinci sayıyı giriniz= ");
        int num2= scan.nextInt();

        if (num1>num2) {
            System.out.println("Sayi 1 büyük");
        }
        if (num2>num1) {
            System.out.println("Sayi 2 büyük");
        }
        if (num1==num2) {
            System.out.println("İki sayi eşit");
        }
    }
}
