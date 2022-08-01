package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir
        // Karakterin sırası 0'dan başlıyor. buna index denir

        String kelime="Merhaba Dünya";
        System.out.println("3.Harf (indexe göre) = " + kelime.charAt(3));
        char ilkHarf=kelime.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);
    }
}
