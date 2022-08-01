package Gun39.Ornek2;

public abstract class Sekil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double cevre();
    public abstract double alan();

    public abstract String ciz();

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + getName() + '\'' +
                "alan='" + alan() + '\'' +
                "cevre='" + cevre() + '\'' +
                '}';
    }
}
