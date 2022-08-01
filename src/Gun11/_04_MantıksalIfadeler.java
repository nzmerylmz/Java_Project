package Gun11;

import java.util.Scanner;

public class _04_MantıksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal (Lojik) İfadeler
        // && -> ve  || -> veya
        // Girilen sayi pozitif ve tek ise ekrana uygun sayı girildi
        //değilse uygun sayi girilmedi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi= scan.nextInt();

        if (sayi>0 && sayi%2==1){
            System.out.println("Uygun sayi girildi");
        }else {
            System.out.println("Uygun sayi girilmedi");
        }



    }
}
