package Gun36.Soru;

public class Kisi {
    private String ad;
    private String soyAd;
    private String gorev;

    public Kisi(String ad, String soyAd, String gorev) {
        setAd(ad);
        setSoyAd(soyAd);
        setGorev(gorev);
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

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void kimlikBelgesi(Kisi kisi) {
        if (kisi instanceof Ogrenci) {
            System.out.println("ad=" + this.ad + " " + "soyad=" + soyAd + " " + "gorevi=" + gorev + " " + "subesi=" + ((Ogrenci) kisi).getSubesi());
        } else if (kisi instanceof Calisan) {
            System.out.println("ad=" + this.ad + " " + "soyad=" + soyAd + " " + "gorevi=" + gorev + " " + "departman=" + ((Calisan) kisi).getDepartman());
        }

    }
}
