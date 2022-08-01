package Gun38.Soru1;

public class Bus extends Vehicle implements Diesel{
    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDiesel() {
        return "Mazot yenilendi";
    }

    @Override
    public String drive() {
        return "Auto pilot özelliği var";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
