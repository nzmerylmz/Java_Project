package Gun37.Deneme;

public class Dikdortgen implements Geometri {
    private int kisaKenar;

    private int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }


    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    @Override
    public void Alan(int... deger) {
        System.out.println("Dikdörtgen Alani = " + (kisaKenar * uzunKenar));
    }

    @Override
    public void Cevre(int...deger) {
        System.out.println("Dikdörtgen Cevresi = " + (2 * (kisaKenar + uzunKenar)));
    }
}
