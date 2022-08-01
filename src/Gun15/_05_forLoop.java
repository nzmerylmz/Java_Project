package Gun15;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sınır giriniz= ");
        int sınır=scan.nextInt();
        int carpim=1;
        for (int i=1; i<=sınır;i++){
            carpim=carpim*i;
        }
        System.out.println(carpim);
    }
}
