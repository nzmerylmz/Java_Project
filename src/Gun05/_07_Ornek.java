package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ağırlık girin: ");
        double agirlik= scan.nextDouble();

        System.out.print("Boy girin: ");
        int boy= scan.nextInt();
        double kitleIndex=agirlik/(boy*boy);

        System.out.println("boy = " + boy);
        System.out.println("kilo = " + agirlik);
        System.out.println("kitleIndex = " + kitleIndex);
    }
}
