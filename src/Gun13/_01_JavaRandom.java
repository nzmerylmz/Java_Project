package Gun13;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        //1 den 10 a kadar sayı ürettik, 5 ile 10 arası desek
        //nasıl yapabilirdik
        // 5 ->  01234
        // 6-10 -> 6789 : aradaki fark kadar sayı ürettir ve min ekle

        Scanner oku = new Scanner(System.in);
        System.out.print("Min: ");
        int min = oku.nextInt();

        System.out.print("Max: ");
        int max = oku.nextInt();

        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("numberInRange = " + numberInRange);
        

    }
}
