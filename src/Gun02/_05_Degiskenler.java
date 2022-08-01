package Gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        int sayi;   // int : int miktarınca alan kaplayan tam sayı tipi

        sayi=5;    // sayının değeri 5
        sayi=7;   // sayının değeri 7
        System.out.print("sayi=");
        System.out.println(sayi);
        System.out.println("sayi="+sayi);

        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=5+5+7+7;
        System.out.println((2*kisaKenar)+(2*uzunKenar));
        System.out.println("Çevresi="+cevre);

        kisaKenar=sayi; // sayının değeri (7) kısa kenara atandı

        cevre= (kisaKenar+uzunKenar)*2;
        System.out.println(cevre);
        System.out.println("cevre = " + cevre);
    }
}
