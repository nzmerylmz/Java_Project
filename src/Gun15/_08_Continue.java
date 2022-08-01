package Gun15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("String ifade giriniz: ");
        String s1=scan.nextLine();

        int length=s1.length();

        for (int i=0; i < length; i++) {

            if (s1.charAt(i)==' ')
                continue;

            System.out.println(s1.charAt(i));


        }


    }
}
