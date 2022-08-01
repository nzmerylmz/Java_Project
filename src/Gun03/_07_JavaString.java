package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;
        String ad="Nazım";  // String ifadelerin sayı gibi bir
                            // sınırı olmadığından "" ile sınırı belli edilir
        String soyad="Eryılmaz";  // Eryılmaz \0 özel karakter koyarak sınırını belirliyor

        System.out.println("ad"); // ad
        System.out.println(ad); // Nazım

        System.out.println("ad"+"soyad"); // ad soyad
        System.out.println(ad+soyad); //NazımEryılmaz

        System.out.println(ad+" "+soyad); //Nazım Eryılmaz

        String tamIsim= ad+soyad; // NazımEryılmaz
        String tamIsim2= ad+" "+soyad; // Nazım Eryılmaz

        System.out.println("tamIsim = " + tamIsim);
        System.out.println("tamIsim2 = " + tamIsim2);

        int yas=45;
        int kilo= 72;

        String bilgi= ad+soyad+yas+kilo; //sayılar Stringler ie toplanırsa kelime gibi işlem görür

        System.out.println(bilgi);
        System.out.println(ad+" "+soyad+" "+yas+" "+kilo);

    }
}
