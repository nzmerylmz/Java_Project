package Gun40.Ornek4;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Borsh çorbamızın tadı mercimeğe benziyor");
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void boil(){
        System.out.println("Kısık ateşte pişirilsin");
    }
    public void eatTomorrow(){
        System.out.println("Ertesi gün tadı daha çok oturuyor");
    }
}
