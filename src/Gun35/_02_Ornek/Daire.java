package Gun35._02_Ornek;

public class Daire extends Sekil {
    private int yariCap;

    @Override
    public double getAlan() {
        return this.yariCap*this.yariCap*Math.PI;
    }

    @Override
    public double getCevre() {
        return 2*this.yariCap*Math.PI;
    }

    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                '}'+super.toString();
    }
}
