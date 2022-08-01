package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //kullanıcıdan adını ve soyadını ayrı ayrı okutarak alıp
        //birlikte ekrana yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Adı giriniz = ");
        String ad= scan.nextLine();
        System.out.print("Soyad giriniz = ");
        String soyAd= scan.nextLine();

        System.out.println("Ad Soyad = "+ ad +" "+ soyAd);
    }
}
