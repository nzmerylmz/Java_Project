package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ifade giriniz = ");
        String ifade=scan.nextLine();

        String buyukIfade=ifade.toLowerCase().replace("a","");
        System.out.println(ifade.length()-buyukIfade.length());
    }
}
