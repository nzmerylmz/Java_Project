package Gun24;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);
        System.out.println("birlesikHali = " + birlesikHali);

        setB.retainAll(setA);
        System.out.println("setA = " + setB);

        setA.removeAll(setB);
        System.out.println("setA = " + setA);



    }
}
