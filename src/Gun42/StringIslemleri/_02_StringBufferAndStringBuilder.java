package Gun42.StringIslemleri;

import java.util.Arrays;

public class _02_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";
        cumle = cumle + "Bugün";
        cumle = cumle + " hava";
        cumle = cumle + " güzel";

        cumle = cumle.concat(" oldu"); //concat ATAMA gerekiyor
        System.out.println(cumle);

        StringBuilder s = new StringBuilder();
        s.append("Bugün");
        s.append(" hava");
        s.append(" güzel ");
        System.out.println(s);

        System.out.println(s.length());
        s.append(4);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        s.delete(0, 5);
        System.out.println(s);

        s.deleteCharAt(3);
        System.out.println(s);

        s.insert(4, "kelime");
        System.out.println(s);

        s.insert(3, 5.12);
        System.out.println(s);

        int[] dizi = {1, 2, 43, 56};
        s.insert(6, Arrays.toString(dizi));
        System.out.println(s);

        s = new StringBuilder("Bugun hava sıcak");
        s.replace(3,8,"bu");
        System.out.println(s);

    }
}
