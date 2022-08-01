package Gun13;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ders ve Notu= ");
        String dersNot = scan.nextLine();

        int ogrNot=Integer.parseInt(dersNot.replaceAll("[^0-9]", ""));
        String dersAdi=dersNot.replaceAll("[0-9]","");

        System.out.println(ogrNot);
        System.out.println(dersAdi);

        if (ogrNot >= 90) {
            System.out.println("A");
        } else if (ogrNot >= 80) {
            System.out.println("B");
        } else if (ogrNot >= 70) {
            System.out.println("C");
        } else if (ogrNot >= 60) {
            System.out.println("D");
        } else if (ogrNot >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
