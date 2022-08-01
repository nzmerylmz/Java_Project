package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // Escape Characters
        // \n -> yeni satır açıyor
        // \t -> tab tuşuna basılmış etkisi yapıyor
        // \b -> BackSpace başılmış gibi etki yapar, yani 1 karakter geri siler
        // \" -> yazılımın haricinde çift tırnak ataması yapıyor
        // \\ -> \ işaretini koyar
        // \r -> satır başına kadar olan karakterlerin hepsini siler

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba \n Dünya");
        System.out.println("Merhaba \t Dünya");
        System.out.println("Merhaba\bDünya\b");
        System.out.println("Merhaba \r Dünya");
        System.out.println("Merhaba\"Dünya");
        System.out.println("Merhaba\\Dünya");

    }
}
