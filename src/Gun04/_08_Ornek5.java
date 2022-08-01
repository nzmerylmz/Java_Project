package Gun04;

public class _08_Ornek5 {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bağış parasının toplamını yazdırınız

        String bagis1="500";
        String bagis2="1500";

        System.out.println(bagis1+bagis2);

        int bagis1yeni = Integer.parseInt(bagis1);
        int bagis2yeni = Integer.parseInt(bagis2);

        int toplamBagis = bagis1yeni+bagis2yeni;
        System.out.println("toplamBagis = " + toplamBagis);
    }
}
