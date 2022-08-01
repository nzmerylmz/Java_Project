package Gun35._01_Ornek;

public class Otobus extends Arac {
    private int yolcuSayisi;

    public Otobus(String renk, double motor, int model,int yolcuSayisi) {
        super(renk, motor, model);
        setYolcuSayisi(yolcuSayisi);
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuSayisi=" + yolcuSayisi +
                '}'+super.toString();
    }
}
