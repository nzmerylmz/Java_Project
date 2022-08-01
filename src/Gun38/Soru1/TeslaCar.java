package Gun38.Soru1;

public class TeslaCar extends Vehicle implements Electric{

    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Akü Değiştirildi";
    }

    @Override
    public String drive() {
        return "Auto pilot özelliği var";
    }
}
