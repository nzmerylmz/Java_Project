package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //SETS: HashSet(hızlı), LinkedHashSet(ekleme sırasına göre), TreeSet(her zaman sıralı)

        //Hızlı çalışmak için kendi özel algoritma sırasına göre saklar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        //Eklenme sırasna göre elementleri kendi özel algoritma sırasına göre saklar
        LinkedHashSet <String> lhs=new LinkedHashSet<>();hs.add("bir");
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //Alfabetik olarak sıralı tutar
        TreeSet <String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        ts.add("beş");
        System.out.println("ts = " + ts);

        TreeSet <Integer> ts2=new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(44);
        ts2.add(3);
        ts2.add(48);
        System.out.println("ts2 = " + ts2);
    }
}
