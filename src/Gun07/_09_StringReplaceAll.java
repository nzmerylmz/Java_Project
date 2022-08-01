package Gun07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışıyor, farkı kriter(Regex)
        // regex : regular expression / düzenli ifade
        // TODO (yapılacak) : regex olarak neler yazılabiliyor google'da araştırılacak

        String text= "Merhaba Dünya";

        System.out.println("Orijinal hali = "+ text);

        //a,b,n karakterlerini ayrı ayrı bul ve alt çizgi ile değiştir
        System.out.println("Yeni ifade = "+ text.replaceAll("[abn]","_"));

        //buyuk harfleri _ ile değiştir
        System.out.println("Büyük harfler -> _ = "+ text.replaceAll("[A-Z]","_"));
    }
}
