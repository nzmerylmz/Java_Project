package Gun40.Ornek1;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsiMi, String dogumTarihi) {
        super(isim, vahsiMi, dogumTarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mama yedi");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("günde 3 kez yemek yiyor");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("günde 5 saat uyur");
    }

    @Override
    public void sesi() {
        System.out.println("mırrr sesi çıkarır");
    }
}
