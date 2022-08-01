package Gun40.Ornek4;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        ArrayList<IFood> list = new ArrayList<>();
        int secim;
        do {
            System.out.println("*********Menü********\n" +
                    "1-Adana Kebap (55 TL)\n" +
                    "2-Lahmacun (33 TL)\n" +
                    "3-Borsh (33 TL)\n" +
                    "4-Palov (44 TL)\n" +
                    "0-Tamam");
            secim = scan.nextInt();
            if (secim > 0 && secim < 5) {
                TechnoKitchen.siparisAl(secim);
            }
        } while (secim != 0);
        TechnoKitchen.siparisHazirlaniyor();
    }
}

