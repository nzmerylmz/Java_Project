package Mentoring._020622;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        int [] array=new int[5];
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*20));
        }
        System.out.println(list);

        System.out.println(list.get(2));

        list.add (3,20);
        System.out.println(list);

        list.set (5,45);
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.contains(60));

        list.removeAll(list2);
        System.out.println(list);


    }
}
