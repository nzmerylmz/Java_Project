package Gun32._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        int secim = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Boyutlar> boyutlar = new ArrayList<>();
        do {
            menuGoster();
            secim = scan.nextInt();
            sepeteEkle(secim, boyutlar);
        } while (secim != 4);
        adetYaz(boyutlar);

    }

    private static void adetYaz(ArrayList<Boyutlar> boyutlar) {
        int smallCount = 0;
        int mediumCount = 0;
        int largeCount = 0;
        for (Boyutlar b : boyutlar) {
            if (b == Boyutlar.SMALL) {
                smallCount++;
            }
            if (b == Boyutlar.MEDIUM) {
                mediumCount++;
            }
            if (b == Boyutlar.LARGE) {
                largeCount++;
            }
        }
        System.out.println(smallCount + " adet Small pizza");
        System.out.println(mediumCount + " adet Medium pizza");
        System.out.println(largeCount + " adet Large pizza");
    }

    private static void sepeteEkle(int secim, ArrayList<Boyutlar> boyutlar) {
        switch (secim) {
            case 1:
                boyutlar.add(Boyutlar.SMALL);
                break;
            case 2:
                boyutlar.add(Boyutlar.MEDIUM);
                break;
            case 3:
                boyutlar.add(Boyutlar.LARGE);
                break;
        }
    }

    private static void menuGoster() {
        System.out.print("1-Small\n2-Medium\n3-Large\n4-Goster\nSeciminiz:");
    }
}
