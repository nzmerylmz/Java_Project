package Gun36.Soru;

public class Ogrenci extends Kisi{
    private int subesi;

    public Ogrenci(String ad, String soyAd, String gorev, int subesi) {
        super(ad, soyAd, gorev);
        setSubesi(subesi);
    }

    public int getSubesi() {
        return subesi;
    }

    public void setSubesi(int subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi=" + subesi +
                '}'+super.toString();
    }
}
