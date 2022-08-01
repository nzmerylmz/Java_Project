package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //girilen bir stringdeki nokta sayısını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz = ");
        String s1= scan.nextLine();

        String noktasızHali=s1.replace(".","");

        System.out.println(s1.length()-noktasızHali.length());

    }
}
