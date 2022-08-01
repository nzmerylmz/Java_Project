package Gun36.Soru;

public class Main {
    public static void main(String[] args) {
        Kisi ogr=new Ogrenci("Nazım", "Eryılmaz","Ogrenci",11);
        Kisi calisan=new Calisan("Melike","Ozel","Müdür","Muhasebe");

        ogr.kimlikBelgesi(ogr);
        calisan.kimlikBelgesi(calisan);

    }

}
