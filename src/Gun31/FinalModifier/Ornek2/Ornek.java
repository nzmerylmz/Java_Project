package Gun31.FinalModifier.Ornek2;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun=0;
        int saat=0;
        int dak=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Gun="); gun= scan.nextInt();
        System.out.print("Saat="); saat= scan.nextInt();
        System.out.print("Dakika="); dak= scan.nextInt();

        //1.yöntem
        int toplamSan=gun*Sabitler.gundekiSaat*Sabitler.saattekiDakika*Sabitler.dakikadakiSaniye+
                      saat*Sabitler.saattekiDakika*Sabitler.dakikadakiSaniye+
                      dak*Sabitler.dakikadakiSaniye;

        System.out.println("Toplam san: "+toplamSan);

        //2.yöntem
        System.out.println("Toplam saniye: " + Sabitler.hesapla(gun,saat,dak));

    }
}
