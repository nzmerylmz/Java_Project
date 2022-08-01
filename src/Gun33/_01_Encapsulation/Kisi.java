package Gun33._01_Encapsulation;

public class Kisi {
    String ad;
    String soyAd;
    private int yas;

    //değişkene direkt erişimi kapatıp
    //bir metod ile korumalı veri gönderme ve alma işlemine
    //Encapsulation denir.

    public Kisi(){

    }

    public Kisi(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        yasAta(yas);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }

    public void yasAta(int i) {
        this.yas=Math.abs(i);
    }

    public int yasGetir() {
        return this.yas;
    }
}
