package Gun40.Ornek4;

public class AdanaKebap implements IFood {
    @Override
    public void taste() {
        System.out.println("Adana Kebap az acılı olsun");
    }

    @Override
    public double ucret() {
        return 55;
    }
    public void marinade(){
        System.out.println("Et marine edilsin");
    }
    public void grill(){
        System.out.println("Izgara yapılsın");
    }


}
