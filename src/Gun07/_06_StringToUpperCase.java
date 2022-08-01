package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : stringi büyük harfe çevirir

        String text= "Merhaba Dünya";

        System.out.println("Orijinal hali = " + text); //Merhaba Dünya
        System.out.println("Büyük hali = " + text.toUpperCase()); // MERHABA DÜNYA
        System.out.println("Büyük ya da küçük farketmeksizin ya ile bitiyor mu = " + text.toLowerCase().endsWith("ya"));
    }
}
