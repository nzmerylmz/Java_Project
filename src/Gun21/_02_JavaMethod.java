package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        int sayi2=scan.nextInt();

        int enb1=enbYaz(sayi1, sayi2);
        System.out.println("enb = "+enb1);
    }
    public static int enbYaz(int s1, int s2){
        int enb=s1;
        if (s2>s1){
            enb=s2;
        }
        return enb;
    }
}
