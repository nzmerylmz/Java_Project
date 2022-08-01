package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        //verilen karakterlerin string içindeki INDEX'ini verir
        //Merhaba kelimesindeki r'nin indexini bulmak istersek kelime.IndexOf("r") diyeceğiz. Bu bize
        // r'nin indexini verir -> 2.verir
        //Merhaba kelimesindeki ha'nın indexini bulmak için kelime.IndexOf("ha") diyeceğiz. -> 3. verir
        //Merhaba kelimesindeki a'nın indexini bulmak için kelime.IndexOf("a") diyeceğiz. İlk bulduğu a'yi verir
        // eğer bulamazsa yok manasında bir bilgi verir -> -1

        String kelime="Merhaba Dünya";
        System.out.println("kelime.indexOf(r) = " + kelime.indexOf("r"));
        System.out.println("kelime.indexOf(ha) = " + kelime.indexOf("ha"));
        System.out.println("kelime.indexOf(a) = " + kelime.indexOf("a"));
        System.out.println("kelime.indexOf(ny) = " + kelime.indexOf("ny"));
        System.out.println("kelime.indexOf( ) = " + kelime.indexOf(" "));
        System.out.println("kelime.indexOf(A) = " + kelime.indexOf("A"));
        System.out.println("kelime.indexOf(ikinci a indexi) = " + kelime.indexOf("a", 5));

    }
}
