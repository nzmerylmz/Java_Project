package Gun34._02_Ornek;

public class Kopekler extends Hayvan {


    public Kopekler(String renk, int kilo, String cins) {
        super(renk, kilo, cins);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Hav hav dedi");
    }
}
