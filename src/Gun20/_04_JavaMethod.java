package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
//        tekmiCiftmi(3);
//        tekmiCiftmi(2);

        tekmiCiftmiOku();
    }

    public static void tekmiCiftmi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }
    }

    public static void tekmiCiftmiOku() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }
    }
}
