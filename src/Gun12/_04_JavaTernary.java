package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayı= scan.nextInt();

        //Klasik yöntem
        if (sayı%2==1)
            System.out.println("Tek");
        else
            System.out.println("çift");

        //Tek satırda yazma yöntemi
        String sonuc=(sayı%2==1) ? "Tek":"Çift";
        System.out.println(sonuc);
        System.out.println(((sayı%2==1) ? "Tek":"Çift"));
    }
}
