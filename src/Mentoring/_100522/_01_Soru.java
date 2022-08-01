package Mentoring._100522;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //haftanın günlerini alarak çalışma günlerini gösteren program

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen günü giriniz= ");
        String gun= scan.nextLine();

        if (gun.equals("Pazartesi")) {System.out.println("Çalışmaya Devam");}
        if (gun.equals("Salı")) {System.out.println("Çalışmaya Devam");}
        if (gun.equals("Çarşamba")) {System.out.println("Çalışmaya Devam");}
        if (gun.equals("Perşembe")) {System.out.println("Çalışmaya Devam");}
        if (gun.equals("Cuma")) {System.out.println("Çalışmaya Devam");}
        if (gun.equals("Cumartesi")) {System.out.println("Yaşasın Tatil");}
        if (gun.equals("Pazar")) {System.out.println("Yaşasın Tatil");}
    }
}
