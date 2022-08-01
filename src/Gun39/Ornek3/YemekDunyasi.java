package Gun39.Ornek3;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava baklava=new Baklava();
        System.out.println(baklava.getClass().getSimpleName());
        baklava.taste();
        baklava.madeIn();

        CheeseCake cheeseCake=new CheeseCake();
        System.out.println(cheeseCake.getClass().getSimpleName());
        cheeseCake.taste();
        cheeseCake.madeIn();

        GreekSalad greekSalad=new GreekSalad();
        System.out.println(greekSalad.getClass().getSimpleName());
        greekSalad.taste();
        greekSalad.madeIn();

        SezarSalad sezarSalad=new SezarSalad();
        System.out.println(sezarSalad.getClass().getSimpleName());
        sezarSalad.taste();
        sezarSalad.madeIn();
    }
}
