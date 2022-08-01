package Gun40.Ornek4;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("Lahmacun çıtır çıtır olsun");
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void dough(){
        System.out.println("İnce hamur lahmacun kullanalım");
    }
    public void addMeat(){
        System.out.println("Ekstra malzemeli olsun");
    }
    public void bake(){
        System.out.println("Odun ateşinde pişsin");
    }
}
