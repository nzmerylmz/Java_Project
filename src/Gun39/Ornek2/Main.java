package Gun39.Ornek2;

public class Main {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen(5,4);

        System.out.println(d);
        System.out.println(d.ciz());

        System.out.println();

        Daire daire=new Daire(4);
        System.out.println(daire);
        System.out.println(daire.ciz());
    }
}
