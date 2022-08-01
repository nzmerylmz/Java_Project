package Gun06;

public class _01_StringLength {
    public static void main(String[] args) {
        String cumle="Bugünlerde havalar ısınmadı."; //boşluklar ve noktalar da karakterdir.

        int uzunluk=cumle.length(); // stringin uzunluğunu verir

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk = " + cumle.length()); //bu şekilde de yazılabilir, int uzunluk'a gerek yok
    }
}
