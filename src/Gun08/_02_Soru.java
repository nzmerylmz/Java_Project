package Gun08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("String bir ifade giriniz = ");
        String kelime= scan.nextLine();
        boolean bosMu=kelime.isEmpty();
        System.out.println("bosMu = " +bosMu);

    }
}
