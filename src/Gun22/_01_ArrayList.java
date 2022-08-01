package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array : Boyut sayısının belli olduğu durumlardaki veriler için kullanılır.


        ArrayList <Integer> integerList=new ArrayList<>();
        ArrayList <Boolean> booleanList=new ArrayList<>();
        ArrayList <String> stringList=new ArrayList<>();

        //String ArrayList tanımlayalım
        ArrayList <String> isimler=new ArrayList<>();

        //Eleman ekleme
        isimler.add("Ahmet");  //uzunluk 1 oldu
        isimler.add ("Ayşe");
        isimler.add ("Kaya");
        isimler.add("Kaya"); // uzunluk 4 oldu

        System.out.println("isimler = " + isimler); // hızlı yazdırma yöntemi
        System.out.println("isimler.size() = " + isimler.size()); // dizilerdeki length e karşılık geliyor

        isimler.add (1,"Zeynep");//araya ekleme
        System.out.println("araya ekleme sonrası isimler = " + isimler);

        isimler.set(1,"Fatih"); //belli bir indexteki elemanı değiştir
        System.out.println("belli bir indexteki elemanı değiştir = " + isimler);
        
        int elemanSayisi=isimler.size();
        System.out.println("elemanSayisi = " + elemanSayisi);

        isimler.remove("Fatih");
        System.out.println("Fatih silindikten sonra isimler = " + elemanSayisi);

        isimler.remove(1);
        System.out.println("isimler = " + isimler);
        
        int indexOfKaya=isimler.indexOf("Kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);

        for (int i = 0; i <isimler.size() ; i++) {
            System.out.println("isimler.get(i) = " + isimler.get(i));
        }
        isimler.clear();//tum list boşaltıldı ilk hale geldi

        System.out.println("isimler = " + isimler.size());
        
        isimler.isEmpty();
        System.out.println("isimler.isEmpty() = " + isimler.isEmpty());

    }
}
