package Gun34._02_Ornek;

public class Hayvan {
    String renk;
    int kilo;
    String cins;

    public Hayvan(String renk, int kilo, String cins) {
        this.renk = renk;
        this.kilo = kilo;
        this.cins = cins;
    }

    public void konustu() {
        System.out.println("hayvan konustu");
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cins='" + cins + '\'' +
                '}';
    }
}
