package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir öğrencinin notuna göre 50'den büyük eşit ise geçtiniz
        //kücük ise kaldınız yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Not giriniz= ");
        int not= scan.nextInt();

//        if (not>=50) { //hangi not girilirse girilsin burası her zaman kontrol edilir
//            System.out.println("Geçtiniz");
//        }
//        if (not<50) {
//            System.out.println("Kaldırınız");
//        }

        // yukarıdaki iflerde her zaman kontrol edilme durumu vardır
        //halbuki aşağıdaki IF-ELSE yapsıında IF şartı çalıştığında ELSE
        //kontrol edilmesine gerek kalmaz.
        if (not >= 50) { //baklava dilimi
            System.out.println("geçtiniz"); //evet çıkışı
        }
        else {
            System.out.println("kaldınız"); //hayır çıkışı
        }
    }
}
