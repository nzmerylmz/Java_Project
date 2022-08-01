package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Öğrenci adı: ");
            String isim = scan.nextLine();

            System.out.print("Öğrenci notları: ");
            String notlar = scan.nextLine();

            int ort = ortalamaBul(notlar);
            System.out.println("İsim ve ortalama = " + isim + " " + ort);
        }
    }

    public static int ortalamaBul(String notlar) {
        String[] notDizisi = notlar.split(" ");
        int toplam = 0;
        for (int i = 0; i < notDizisi.length; i++) {
            toplam = toplam + Integer.parseInt(notDizisi[i]);
        }
        return toplam / notDizisi.length;
    }

}
