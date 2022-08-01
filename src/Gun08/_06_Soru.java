package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cümle giriniz= ");
        String cumle=scan.nextLine();

        System.out.println(cumle.substring(0,cumle.indexOf(" ")));
    }
}
