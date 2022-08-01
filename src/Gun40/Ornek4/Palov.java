package Gun40.Ornek4;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("Palov iri taneli olsun");
    }

    @Override
    public double ucret() {
        return 44;
    }
    public void fry(){
        System.out.println("Şehriye ve pirinç kavrulsun");
    }
    public void boil(){
        System.out.println("1 e 2 oranında su katılsın");
    }
}
