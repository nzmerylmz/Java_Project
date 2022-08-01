package Gun12;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayı= scan.nextInt();

        System.out.println((sayı>50) ? "1" : "0");
    }
}
