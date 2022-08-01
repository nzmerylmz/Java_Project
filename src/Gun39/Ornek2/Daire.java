package Gun39.Ornek2;

public class Daire extends Sekil{
    @Override
    public String getName() {
        return "Daire";
    }

    private double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yariCap;
    }

    @Override
    public double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public String ciz() {
        return "Daire çizildi";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
