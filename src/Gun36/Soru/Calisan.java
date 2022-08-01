package Gun36.Soru;

public class Calisan extends Kisi {
    private String departman;

    public Calisan(String ad, String soyAd, String gorev, String departman) {
        super(ad, soyAd, gorev);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "departman='" + departman + '\'' +
                '}'+super.toString();
    }
}
