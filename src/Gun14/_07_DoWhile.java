package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz: ");
        String ifade =scan.nextLine();
//        do {
//            System.out.println("Program çalışıyor");
//            System.out.print("Bir harf giriniz: ");
//            ifade = scan.nextLine();
//        }
//        while (!ifade.equalsIgnoreCase("X"));
//        System.out.println("Program bitti");

        while (!ifade.equalsIgnoreCase("X")) {
            System.out.println("Program çalışıyor");
            System.out.print("Bir harf giriniz: ");
            ifade = scan.nextLine();
        }
        System.out.println("Program Bitti");
    }
}
