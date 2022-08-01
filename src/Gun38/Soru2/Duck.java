package Gun38.Soru2;

public class Duck extends Hayvanlar implements ISailing,IFlying{
    @Override
    public String food() {
        return "ördek yem yer";
    }
}
