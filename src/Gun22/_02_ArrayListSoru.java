package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayListSoru {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        String cevap = "";
        int toplam = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Not giriniz= ");
            int not = okuInt.nextInt();
            System.out.print("Devam etmek istiyor musunuz (E/H): ");
            cevap = scan.nextLine();
            notlar.add(not);
            toplam += not;
        } while (cevap.equalsIgnoreCase("E"));

        int ortalama = toplam / notlar.size();

        System.out.println("Ortalama= " + ortalama);
    }
    public static void gecenSayisiYaz (ArrayList < Integer > dizilist,int ort){
        int ortalamaUstuOgrenciSayısı = 0;
        for (int i = 0; i < dizilist.size(); i++) {
            if (dizilist.get(i) >= ort) {
                ortalamaUstuOgrenciSayısı++;
            }
        }
        System.out.println("Geçen sayısı: " + ortalamaUstuOgrenciSayısı);
    }
}
