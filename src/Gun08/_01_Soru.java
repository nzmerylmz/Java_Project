package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir ad giriniz= ");
        String ad=scan.nextLine();
        System.out.print("Bir soyad giriniz= ");
        String soyAd=scan.nextLine();

        System.out.println(ad.concat(" ").concat(soyAd));
    }
}
