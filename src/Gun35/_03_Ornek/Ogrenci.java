package Gun35._03_Ornek;

public class Ogrenci {
    enum Type{
        ILK,LISE
    }
    private int id=0;
    private String isim;
    private Type tip;

    static int sayac=0;

    public Ogrenci(String isim, Type tip) {
        setId(id);
        setIsim(isim);
        setTip(tip);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Type getTip() {
        return tip;
    }

    public void setTip(Type tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Ogrenci"+sayac+" {" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tip=" + tip +
                '}';
    }
}
