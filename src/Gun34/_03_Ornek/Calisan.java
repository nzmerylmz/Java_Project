package Gun34._03_Ornek;

public class Calisan {
    private String isim;
    private int maas;
    private int maasKatSayisi;

    public Calisan(String isim, int maas, int maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
    }

    public int maasHesapla(){
        return maas*maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }
}
