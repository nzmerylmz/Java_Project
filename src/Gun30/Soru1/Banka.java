package Gun30.Soru1;

public class Banka {
    public static void main(String[] args) {
        Musteri m1 = new Musteri();
        m1.ad = "Nazım";
        m1.soyAd = "Eryılmaz";
        m1.hesapID = 1;

        m1.musteriHesap = new Hesap();

        m1.musteriHesap.paraYatirma(100);
        m1.musteriHesap.paraYatirma(200);
        m1.musteriHesap.paraCekme(50);

        System.out.println(m1.musteriHesap);

    }
}
