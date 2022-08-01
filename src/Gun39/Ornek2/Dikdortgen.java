package Gun39.Ornek2;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genişlik;

    public Dikdortgen(double uzunluk, double genişlik) {
        setUzunluk(uzunluk);
        setGenişlik(genişlik);
    }

    public double getUzunluk() {
        return uzunluk;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenişlik() {
        return genişlik;
    }

    public void setGenişlik(double genişlik) {
        this.genişlik = genişlik;
    }

    @Override
    public double cevre() {
        return (uzunluk+genişlik)*2;
    }

    @Override
    public String getName() {
        return "Dikdortgen";
    }

    @Override
    public double alan() {
        return (uzunluk*genişlik);
    }

    @Override
    public String ciz() {
        return "Dikdörtgen çizildi";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
