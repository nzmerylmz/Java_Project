package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // Girilen bir stringde boşluk olup olmadığını bulunuz

        Scanner oku=new Scanner (System.in);
        System.out.print("Bir string giriniz= ");
        String kelime= oku.nextLine();
        System.out.println("bosluk var MI= " + kelime.contains(" "));
    }
}
