package Gun26._05_Soru;
public class Kampus {
    public static void main(String[] args) {
        //bir kampüs programı için aşağıdaki özellikte bilgilerin
        //kaydedileceği classları yazınız.
        //Okul : adı,müdürAdı,ucreti (double)
        //Ogrenci : okulNo, tamAd, okulu (Okul)
        //bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp yazdrınız.

        Okul okulBilgileri=new Okul();
        okulBilgileri.ad="Yesilyuva";
        okulBilgileri.mudurAd="Melike";
        okulBilgileri.ucret=5.500;

        Ogrenci ogrenciBilgiler=new Ogrenci();
        ogrenciBilgiler.okulNo=5;
        ogrenciBilgiler.tamAd="Nazım";

        ogrenciBilgiler.okulu.ad="Yeşilyuva";



    }
}
