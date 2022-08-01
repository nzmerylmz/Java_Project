package Gun34._02_Ornek;

import com.sun.org.apache.xpath.internal.operations.Or;

public class HayvanatBahcesi {
    public static void main(String[] args) {
//        Ordek ordek1=new Ordek();
//        ordek1.renk="Beyaz";
//        ordek1.cins="Pekin";
//        ordek1.hayvanId=1;
//        ordek1.kilo=10;
//        ordek1.kanatAcikligi=1;
//
//        ordek1.konustu();
//
//        Kaz kaz = new Kaz();
//        kaz.kanatAcikligi=2;
//
//        kaz.konustu();

        Ordek o1=new Ordek("beyaz",2,"pekin",1);

        o1.konustu();
        System.out.println(o1);

//        Kopekler k1=new Kopekler("siyah",3,"kurt");
//
//        k1.konustu();
//
//        Yılanlar y1=new Yılanlar("yesil", 2,"kobra",2);
//
//        y1.konustu();
    }
}
