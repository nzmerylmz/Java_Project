package Gun35._01_Ornek;

public class Arac {
    private String renk;
    private double motor;
    private int model;

    public Arac(String renk, double motor, int model) {
        setRenk(renk);
        setMotor(motor);
        setModel(model);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model=" + model +
                '}';
    }
}
