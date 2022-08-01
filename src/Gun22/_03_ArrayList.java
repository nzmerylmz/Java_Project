package Gun22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> rakamlar=new ArrayList<>();

        rakamlar.add(50);
        rakamlar.add(40);
        rakamlar.add(3);
        rakamlar.add(145);
        rakamlar.add(600);

        System.out.println(rakamlar);

        Collections.sort(rakamlar);
        System.out.println(rakamlar);

        Collections.reverse(rakamlar);
        System.out.println(rakamlar);

        System.out.println(Collections.max(rakamlar));
        System.out.println(Collections.min(rakamlar));

        Collections.fill(rakamlar,0);
        System.out.println(rakamlar);

        Collections.replaceAll(rakamlar,0,2);
        System.out.println(rakamlar);
    }
}
