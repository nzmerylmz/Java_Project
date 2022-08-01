package Gun31.StaticModifier.Ornek3;

public class Soru {
    int a;

    static int b = 0;

    void artır() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Soru s1 = new Soru();
        s1.a = 5;

        Soru s2 = new Soru();
        s2.a = 7;

        // a nın değeri kaç oldu şu anda: Cevap-> hangi a :)

        System.out.println("s1.a = " + s1.a);
        System.out.println("s2.a = " + s2.a);

        Soru.b = 6;
        Soru.b = 8;

        //b nin değeri kaçtır : tek bir değeri vardır en son değerdir
        System.out.println("Soru.b" + Soru.b);

        s1.artır();
        s2.artır();

        //a ve b nin en son değerleri nedir: s1.a 6, b=9

        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(Soru.b);
    }
}
