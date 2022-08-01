package Gun25;

import java.util.HashMap;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük: Kullanıcıya aşağıdaki gibi bir menü çıkarınız
        // 1-Ekleme (bu seçenekte kelimenin kendisi ile manasını bir cümle ile yazınız)
        // 2-Düzeltme (bu seçenekte kelimeyi buldurup manasını düzelttiriniz)
        // 3-Listeleme
        // 4-Arama (bu seçenekte verilen bir kelimeyle bağlayan tüm kelimelerin manaları
        // 5-Çıkış
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> sozluk = new HashMap<>();

        int secim;

        do {
            menuYaz();
            secim = scan.nextInt();
            islemYap(sozluk, secim);
        } while (secim < 6);

        System.out.println("sozluk = " + sozluk);

    }
    public static void menuYaz() {
        System.out.print("1-Ekleme\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış\nYapmak istediğiniz işlem: ");
    }
    public static void islemYap(HashMap<String, String> map, int secim) {
        Scanner scan1 = new Scanner(System.in);
        String kelime="";
        String anlamı="";
        switch (secim) {
            case 1:
                ekleme(map,kelime,anlamı);
                break;
            case 2:
                düzeltme(map,kelime,anlamı);
                break;
            case 3:
                listeleme(map);
                break;
            case 4:
                arama(map,kelime);
                break;
            case 5:
                silme(map,kelime);
                break;
        }
    }
    public static void ekleme(HashMap<String, String> map, String s1, String s2) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        s1 = scan1.nextLine();
        System.out.println("Anlamı giriniz: ");
        s2 = scan1.nextLine();
        map.put(s1, s2);
    }
    public static void düzeltme(HashMap<String, String> map, String s1, String s2) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Düzeltmek istediğiniz kelimeyi nedir?: ");
        s1 = scan1.nextLine();
        if (map.containsKey(s1)) {
            System.out.println("Anlamı giriniz: ");
            s2 = scan1.nextLine();
            map.put(s1, s2);
        }
    }
    public static void listeleme(HashMap<String, String> map){
        System.out.println(map);
    }
    public static void arama (HashMap<String,String>map,String s1){
        Scanner scan1=new Scanner(System.in);
        System.out.print("Arama yapınız: ");
        s1 = scan1.nextLine();
        int sayac=0;
        for (String s : map.keySet()) {
            if (s.contains(s1)){
                System.out.println(s);
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println("Aradığınız kelime yoktur.");
        }

    }
    public static void silme(HashMap<String,String> map,String s1){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Silmek istediğiniz kelimeyi giriniz: ");
        s1 = scan1.nextLine();
        map.remove(s1);
    }
}
