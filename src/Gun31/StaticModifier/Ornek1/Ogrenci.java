package Gun31.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyAd;
    static String okulAd="Yıldırım Ortaokulu";

    //hepsi için geçerli tek bir tane eleman
    //tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz

    public Ogrenci(String ad, String soyAd) {
        this.ad = ad;
        this.soyAd = soyAd;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
