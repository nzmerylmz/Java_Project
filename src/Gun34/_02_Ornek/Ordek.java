package Gun34._02_Ornek;

public class Ordek extends Hayvan {
    int kanatAcikligi;


    public Ordek(String renk, int kilo, String cins,int kanatAcikliği) {
        super(renk, kilo, cins);
        this.kanatAcikligi=kanatAcikliği;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak dedi");
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "kanatAcikligi=" + kanatAcikligi +
                '}'+super.toString();
    }
}
