package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir isim soyisim giriniz: ");
        String adSoyad= oku.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1);

        System.out.println(adSoyad.charAt(0)+"."+adSoyad.charAt(6)+".");
        System.out.println(adSoyad.charAt(0)+"."+adSoyad.charAt(adSoyad.indexOf(" ")+1)+".");
        System.out.println("Şifreli Ad= " + ilkHarf+"."+soyadIlkHarf+".");
    }
}
