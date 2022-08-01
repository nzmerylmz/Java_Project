package Gun24;

import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        // bana artık elemanları gelişigüzel miktarınca tutan değil, aynı elemanları tutmayan,
        //yani 1 elemandan sadece 1 tane olan diziler lazım. hangi sırada olduğunun bir önemi yok
        // bunlara set denir: LİNKEDHASHSET(eklenme sırasına göre), TREESET(ordered- sıralı),
        // HASHSET(hızlı)

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi= hs1.add(5);

        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("hs1 = " + hs1);

        HashSet<String> hs2=new HashSet<>();
        hs2.add("Nazım");
        hs2.add("Melike");

        System.out.println("hs1 = " + hs2);
    }
}
