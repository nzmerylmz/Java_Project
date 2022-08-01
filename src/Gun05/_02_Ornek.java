package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String isim=oku.next(); // next() -> bir "kelime" okumak için
        System.out.println("isim = " + isim);
    }
}
