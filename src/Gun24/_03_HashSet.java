package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmez
        renkler.add("RED"); // bu eklendi
        System.out.println("renkler = " + renkler);
        
        //Ekrana tek tek yazdırma 2. yöntem
        for ( String item : renkler ) {
            System.out.println(item);
        }

        //ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim
        //TreeSet ve LinkedSet

        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        for (String s: ts){ //sırayı garanti etmez
            System.out.println("s = " + s);
        }

        Iterator gosterge=ts.iterator();
        while (gosterge.hasNext()){
            System.out.println("gosterge = " + gosterge.next());
        }
    }
}
