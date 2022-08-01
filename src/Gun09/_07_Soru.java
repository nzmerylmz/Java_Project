package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi= scan.nextInt();

        boolean tekSayi=(sayi%2)==1;
        System.out.println("Tek sayı mi= "+tekSayi);

    }
}
