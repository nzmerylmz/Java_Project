package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cümle giriniz= ");
        String cumle=scan.nextLine();

        int birinciBoslukIndexi=cumle.indexOf(" ");
        int ikinciBoslukIndexi=cumle.indexOf(" ",birinciBoslukIndexi+1);

        System.out.println(cumle.substring(0,ikinciBoslukIndexi));
        System.out.println(cumle.substring(0,cumle.indexOf(" ",cumle.indexOf(" ")+1)));
    }
}
