package Gun40.Ornek1;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsiMi, String dogumTarihi) {
        super(isim, vahsiMi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("et yiyor");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günde 2 kilo et yer");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("gunde 6 saat uyur");
    }

    @Override
    public void sesi() {
        System.out.println("keskin bir ses çıkarır");
    }
}
