package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        //Length'in -1'i bana son harfin indexini verir
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string değer giriniz: ");
        String girilen= oku.nextLine();

        int uzunluk= girilen.length();
        char sonHarf= girilen.charAt(uzunluk-1);
        //Toplam karakter sayısı okundu
        //Fakat charAt indexe göre çalıştığından 1 eksiği alındı.

        System.out.println("Son harf= " + sonHarf);

    }
}
