package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        //StartsWith : Bir stringin verilen string ile başlayıp başlamadığının
        // sonucunu boolean olarak döner

        String text="HCL Teknoloji";

        System.out.println("HC ile başlıyor mu = " + text.startsWith("HC"));
        System.out.println("h ile başlıyor mu = " + text.startsWith("h"));
        System.out.println("hc ile başlıyor mu = " + text.startsWith("hc"));

    }
}
