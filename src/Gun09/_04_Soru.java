package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz= ");
        int sayi=scan.nextInt();

        int yuzlerBasamagi=(sayi/100)%10;
        int onlarBasamagi=(sayi/10)%10;
        int birlerBasamagi=sayi%10;

        System.out.println("Sayının tersi : "+ ((birlerBasamagi*100)+ (onlarBasamagi*10)+yuzlerBasamagi));

    }
}
