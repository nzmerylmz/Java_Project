package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("Kenar uzunluk giriniz: ");
        int kenarUzunluk= scan.nextInt();
        int cevre=kenarUzunluk*4;
        int alan=kenarUzunluk*kenarUzunluk;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
