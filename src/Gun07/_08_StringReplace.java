package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // bir stringin içindeki istenen karakter(ler)in hepsini verilen yenisiyle değiştirir
        String text="Merhaba Dünya";

        System.out.println("orijinal hali = "+text);
        System.out.println("a ların b olarak değişmiş hali = "+text.replace("a","b"));
        System.out.println("ba -> de = " + text.replace("ba","de"));
        System.out.println("Dünya -> Java = " + text.replace("Dünya", "Java"));
        System.out.println("Dünya -> java = " + text.toLowerCase().replace("dünya", "Java"));
        System.out.println("a ları silelim = " + text.replace("a",""));
    }
}
