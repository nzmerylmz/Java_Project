package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst : replace ile aynı sadece ilk bulunanı değiştirir

        String text="Merhaba Dünya";

        System.out.println("Orijinal hali = "+ text);
        System.out.println("Butun a lar değişmiş hali = " + text.replace("a","_"));
        System.out.println("İlk a nın değişmiş hali = " + text.replaceFirst("a","_"));
    }
}
