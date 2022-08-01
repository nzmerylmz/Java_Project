package Gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2DArrayList {
    public static void main(String[] args) {
        int sayi = 5;
        int[] dizi = new int[20];
        int[][] tablo = new int[20][4];

        ArrayList<Integer> liste = new ArrayList<>();

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);

        ArrayList<Integer> fizikNotlar = new ArrayList<>();
        fizikNotlar.add(65);
        fizikNotlar.add(75);
        fizikNotlar.add(85);

        ArrayList<Integer> kimyaNotlar = new ArrayList<>();
        kimyaNotlar.add(85);
        kimyaNotlar.add(95);
        kimyaNotlar.add(55);

        notlarListesi.add(matNotlar); //burada 2 boyutlu listeye attık
        notlarListesi.add(fizikNotlar);
        notlarListesi.add(kimyaNotlar);

        notlarListesi.get(0); //her bir elemanı bir liste
        notlarListesi.get(0).get(0); //listenin 0 indexli eleanı

//        for (int i = 0; i <notlarListesi.size() ; i++) {
//            System.out.println(notlarListesi.get(i));
//        }

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler.get(i));
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(i + ".yaprak, " + j + ". not= ");
                System.out.println(notlarListesi.get(i).get(j));
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Ders No (0-Mat, 1-Fiz, 2-Kim) :");
        int dersNo = scan.nextInt();
//        dersNotlarınıYazdır(notlarListesi, dersNo, dersler);
        int ort= ortalamaYaz(notlarListesi,dersNo);
        System.out.println(ort);


    }
//    public static void dersNotlarınıYazdır(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo, ArrayList<String> dersler) {
//        System.out.println(dersler.get(dersNo));
//
//        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
//            System.out.println(notlarListesi.get(dersNo).get(i));
//        }
//    }
    public static int ortalamaYaz (ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
        int toplam=0;
        for (int i = 0; i <notlarListesi.get(dersNo).size(); i++) {
            toplam=toplam+notlarListesi.get(dersNo).get(i);
        }
        int ortalama=toplam/notlarListesi.get(dersNo).size();
        return ortalama;
    }
}
