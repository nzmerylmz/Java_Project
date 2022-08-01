package Gun34._03_Ornek;

public class GenelMudur extends Calisan {
    int tazminat;
    public GenelMudur(String isim, int maas, int maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }

    @Override
    public int maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                '}'+super.toString()+"Toplam Maaş: "+(super.maasHesapla()+this.tazminat);
    }
}
