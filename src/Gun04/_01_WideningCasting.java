package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {

        int sayi=9;
        long toplam=678;
        double oran=3.2;

        oran=sayi;
        toplam=sayi;

        System.out.println("oran = " + oran);
        System.out.println("toplam = " + toplam);

    }
}
