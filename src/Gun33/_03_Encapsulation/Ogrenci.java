package Gun33._03_Encapsulation;

public class Ogrenci {
    private String ad;
    private String soyAd;
    private int yas;

    private static int id=0;

    public Ogrenci(String ad, String soyAd, int yas) {
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
