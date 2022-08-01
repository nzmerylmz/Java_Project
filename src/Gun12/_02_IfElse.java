package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi>0) {
            System.out.println("Sayi pozitif");
        }
        else {
            if (sayi==0){
                System.out.println("Sayı sıfırdır");
            } else {
                System.out.println("negatif");
            }
        }
    }
}
