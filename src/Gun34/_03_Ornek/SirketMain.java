package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        GenelMudur gm=new GenelMudur("Nazım",20000,3,50000);
        System.out.println(gm.maasHesapla());
        System.out.println(gm);


        Calisan calisan=new Calisan("Nazım",10000,4);
        System.out.println(calisan.maasHesapla());
        System.out.println(calisan);



    }
}
