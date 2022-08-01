package Mentoring._020622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        String secim;
        int sayi = 0;

        do {
            System.out.print("a-Listeye eleman ekleme\nb-Listeyi yazdırma\nc-Elaman arama\nd-Listeyi sıralama\ne-Listeyi yazdırma\nf-Çıkış\nSeçiminiz: ");
            secim = scan.next();

            if (secim.equals("a")) {
                System.out.print("Girmek istediğiniz eleman: ");
                list.add(scanInt.nextInt());
            } else if (secim.equals("b")) {
                System.out.println(list);
            } else if (secim.equals("c")) {
                System.out.print("Aramak istediğiniz eleman: ");
                System.out.println(list.contains(scanInt.nextInt()));
            } else if (secim.equals("d")) {
                Collections.sort(list);
                System.out.print(list);
            } else if (secim.equals("e")) {
                System.out.println(list);
            }
        } while (!secim.equals("f"));
    }
}
