package Gun24;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("String");
        hs.add(5);
        System.out.println("hs = " + hs);

        for (Object s : hs) { // çok sayıda tür olduğunda Object kullanıyoruz
            System.out.println("s = " + s);
        }

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(5);
        hs2.add(7);
        hs2.add(23);
        hs2.add(3);

        System.out.println("hs2 = " + hs2);

        hs2.remove(1);
        System.out.println("hs2 = " + hs2);

        if (hs2.contains(5)){
            System.out.println("5 var");
        }else{
            System.out.println("5 yok");
        }
        
        hs2.clear();
        System.out.println("hs2 = " + hs2);

    }
}
