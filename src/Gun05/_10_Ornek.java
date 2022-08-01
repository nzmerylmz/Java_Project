package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("İstediğiniz bilet adeti : ");
        byte biletAdedi= scan.nextByte();

        System.out.print("Sigorta İstiyor Musunuz?: ");
        boolean cevap=scan.nextBoolean();

        System.out.println("biletAdedi = " + biletAdedi);
        System.out.println("cevap = " + cevap);
    }
}
