package Gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _05_HashSet {
    public static void main(String[] args) {
        Integer [] array= new Integer[]{1,2,3,4,5,5,6,6,7};

        System.out.println("array = " + Arrays.toString(array));
        HashSet <Integer> hs=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }
        System.out.println("hs = " + hs);
        
        //2.yöntem direkt atış
        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(array));
        System.out.println("hs2 = " + hs2);
    }
}
