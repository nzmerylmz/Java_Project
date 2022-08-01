package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("cumle giriniz: ");
        String cumle = scan.nextLine();
        int bosluk = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                bosluk++;
            }
        }
        System.out.print("Kelime sayisi =" + (bosluk + 1));
    }
}
