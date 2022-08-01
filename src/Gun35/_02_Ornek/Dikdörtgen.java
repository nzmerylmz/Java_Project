package Gun35._02_Ornek;

public class Dikdörtgen extends Sekil {
    private int uzunluk;
    private int genislik;

    public Dikdörtgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    @Override
    public double getAlan() {
        return this.uzunluk*this.genislik;
    }

    @Override
    public double getCevre() {
        return 2*(this.uzunluk+this.genislik);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    @Override
    public String toString() {
        return "Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}'+super.toString();
    }
}
