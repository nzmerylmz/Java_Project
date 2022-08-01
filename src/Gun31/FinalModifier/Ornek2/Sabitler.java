package Gun31.FinalModifier.Ornek2;

public class Sabitler {
    final static int gundekiSaat=24;
    final static int saattekiDakika=60;
    final static int dakikadakiSaniye=60;

    public static int hesapla (int gun, int saat, int dak){
        int toplamSaniye= gun*gundekiSaat*saattekiDakika*dakikadakiSaniye+
                          saat*saattekiDakika*dakikadakiSaniye+
                          dak*dakikadakiSaniye;
        return toplamSaniye;
    }
}
