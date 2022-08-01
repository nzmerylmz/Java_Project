package Gun40.Ornek1;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsiMi;
    private String dogumTarihi;

    static int sayac=0;

    public Hayvan(String isim, boolean vahsiMi, String dogumTarihi) {
        this.id=++sayac;
        setIsim(isim);
        setVahsiMi(vahsiMi);
        setDogumTarihi(dogumTarihi);
    }

    public abstract void yiyecegi();
    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsiMi() {
        return vahsiMi;
    }

    public void setVahsiMi(boolean vahsiMi) {
        this.vahsiMi = vahsiMi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsiMi=" + vahsiMi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
