package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("İki sayıyı giriniz: ");
        String sayi= scan.nextLine();

        String parca1=sayi.substring(0,sayi.indexOf(" "));
        String parca2=sayi.substring(sayi.indexOf(" ")+1);

        int ilkSayi=Integer.parseInt(parca1);
        int ikinciSayi=Integer.parseInt(parca2);

        if (ilkSayi==ikinciSayi) {
            System.out.println("eşit");
        } else {
            System.out.println("değil");
        }
    }
}
