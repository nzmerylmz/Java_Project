package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz= ");
        String kelime= scan.nextLine();

        System.out.println(kelime.charAt(0)+","+kelime.charAt(kelime.length()-1));
    }
}
