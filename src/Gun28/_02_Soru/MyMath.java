package Gun28._02_Soru;

public class MyMath {
    public static int max (int [] sayi){
        int enb=sayi [0];

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]>enb) {
                enb=sayi [i];
            }
        }
        return enb;
    }
    public static int min (int [] sayi){
        int enk=sayi [0];

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]<enk) {
                enk=sayi [i];
            }
        }
        return enk;
    }
    public static double getPow (int sayi1,int sayi2){
        double sonuc=Math.pow(sayi1,sayi2);

        return sonuc;
    }
    public static int dizileriTopla (int [] sayi){
        int toplam=0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];
        }
        return toplam;
    }
}
