package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        //1 tane double ve 1 tane short değişken tanımlayınız.
        //değer atayınız sonra double değişkeni short değişkene çevirerek
        //bütün değerleri ekrana yazdırınız

        short sayi=10;
        double oran=5.2;

        sayi=(short)oran;

        System.out.println("oran = " + oran);
        System.out.println("sayi = " + sayi);

    }
}
