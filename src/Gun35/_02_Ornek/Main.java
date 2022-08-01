package Gun35._02_Ornek;

public class Main {
    public static void main(String[] args) {
        Daire daire=new Daire(3);
        System.out.println(daire.getAlan());
        System.out.println(daire.getCevre());

        Dikdörtgen dikdörtgen=new Dikdörtgen(5,4);
        System.out.println(dikdörtgen.getAlan());
        System.out.println(dikdörtgen.getCevre());

        Kare kare=new Kare(3);
        System.out.println(kare.getAlan());
        System.out.println(kare.getCevre());
    }
}
