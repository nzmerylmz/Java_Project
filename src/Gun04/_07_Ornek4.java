package Gun04;

public class _07_Ornek4 {
    public static void main(String[] args) {
        //short olarak atadığınız bir değeri Stringe çevirerek ekrana yazdırın

        short sayi=10;

        String sayininKelimeHali=Short.toString(sayi); //herhangi bir işlemde sayı olarakl kullanılamaz
        System.out.println(sayininKelimeHali);
        //ekranda sayi gibi gözükse bile aslında o bir yazı
    }
}
