package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //girilen bir vize ve final notunu okuyarak geçme kalma hesaplayan program
        Scanner scan=new Scanner(System.in);
        System.out.print("Vize notu giriniz= ");
        int vize= scan.nextInt();
        System.out.print("Final notu giriniz= ");
        int finalNotu= scan.nextInt();

        double ortalama=vize*0.4+finalNotu*0.6;

        if (ortalama>=60) {
            System.out.println("ortalama = " + ortalama);
            System.out.println("Geçtiniz, tebrikler");
        } else {
            System.out.println("ortalama = " + ortalama);
            System.out.println("Bütünlemeye kaldınız");
        }
    }
}
