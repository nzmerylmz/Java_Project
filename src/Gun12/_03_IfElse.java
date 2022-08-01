package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç saat otoparkta kalındı: ");
        int saat= scan.nextInt();

        if (saat<=3) {
            System.out.println("Ücret 10 TL");
        }else {
            if (saat<=5) {
                System.out.println("Ücret 15 TL");
            } else {
                System.out.println("Ücret 20 TL");
            }
        }
    }
}
