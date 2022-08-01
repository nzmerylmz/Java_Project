package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir stringin içinde karakterlerin var olup olmadığını söyler
        // boolean cinsinden true ya da false döndürür

        String kelime= "Merhaba Dünya";
        boolean varMı=kelime.contains("a");
        System.out.println("varMı = " + varMı);

        System.out.println("varMı = " + kelime.contains("ba"));

    }
}
