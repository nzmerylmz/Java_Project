package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi küçük harfe çevirir.

        String text="MERHABA";
        System.out.println(text.toLowerCase());
        System.out.println("text buyuk veya kucuk harf de olsa me ile mi başlıyor = " + text.toLowerCase().startsWith("me"));
    }
}
