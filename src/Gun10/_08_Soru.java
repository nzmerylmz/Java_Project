package Gun10;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayı = scan.nextInt();

        int birler=sayı%10;
        int onlar = (sayı/10)%10;

        if (birler==onlar){
            System.out.println("birler ve onlar eşit");
        }
        if (birler!=onlar){
            System.out.println("birler ve onlar eşit");
        }

    }
}
