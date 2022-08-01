package Gun34._02_Ornek;

public class Yılanlar extends Hayvan {
    int uzunluk;

    public Yılanlar(String renk, int kilo, String cins, int uzunluk) {
        super(renk, kilo, cins);
        this.uzunluk=uzunluk;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Tıs dedi");
    }
}
