package Gun15;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sınır belirleyiniz");
        int sınır=scan.nextInt();
        int toplam=0;

        for (int i=0; i<=sınır;i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);
    }
}
