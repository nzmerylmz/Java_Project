package Gun40.Ornek1;

public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi("Mavis", false, "2010");
        System.out.println(kedi.getClass().getSimpleName());
        System.out.println("----------------");
        System.out.println(kedi);

        System.out.println();

        Kartal kartal = new Kartal("Benfica Kartalı", true, "2015");
        System.out.println(kartal.getClass().getSimpleName());
        System.out.println("----------------");
        System.out.println(kartal);

    }
}
