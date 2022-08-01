package Gun25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_JavaMap {
    public static <E> void main(String[] args) {
        // Sets -> HashSet, LinkedHashSet, TreeSet
        // Maps -> HashMap, LinkedHashMap, TreeMap

        Set<Integer> set = new HashSet<>(); //set ailesinden hashset
        Map<Integer, Integer> m = new HashMap<>();//map ailesinden hashmap
        m.put(2, 11);  //2 key'ine 11 atadık
        m.put(3, 12);  //3 key'ine 12 atadık
        m.put(2, 5);  //2 key'indeki değer değişti ve 5 oldu

        System.out.println(m);
        System.out.println(m.size());
        System.out.println("2.key'de olan değer: " + m.get(2));
        System.out.println("Keyler: " + m.keySet()); //anahtarları verdi
        System.out.println("Değerler: " + m.values()); //value'ları verdi

        for (int s : m.keySet()) {
            System.out.println("Keyler: " + s);
        }
        for (int s : m.values()) {
            System.out.println("Değerler: " + s);
        }
        for (Map.Entry<Integer, Integer> s : m.entrySet()) {
            System.out.println("Key: " + s.getKey());
            System.out.println("Value: " + s.getValue());
        }
        System.out.println("m.containskey (2): " + m.containsKey(2));
        System.out.println("m.containsvalue (12): " + m.containsValue(12));

        m.remove(2);
        System.out.println("Key 2'yi sildikten sonra: " + m.containsKey(2));

        m.clear();

        System.out.println("m :" + m);

    }
}
