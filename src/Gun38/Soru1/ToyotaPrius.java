package Gun38.Soru1;

public class ToyotaPrius extends Vehicle implements Electric,Gas{

    public ToyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Akü değiştirildi";
    }

    @Override
    public String changeOil() {
        return "Benzin yenilendi";
    }

    @Override
    public String drive() {
        return "Auto pilot özelliği var";
    }

}
