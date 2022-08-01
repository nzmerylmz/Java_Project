package Gun42.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1 = "bugün hava çok güzel";
        String cumle2 = "bugün hava çok güzel";
        String cumle3 = new String("bugün hava çok güzel");
        String cumle4 = new String("bugün hava çok güzel");

        if (cumle3 == cumle4) {
            System.out.println("cumle 1 cumle 2'ye eşit");
        } else {
            System.out.println("cumle 1 cumle 2'ye eşit DEĞİL");
        }
    }
}
