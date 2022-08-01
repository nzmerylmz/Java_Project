package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int num2 = scan.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        int num3 = scan.nextInt();

        //1.yöntem
        int enb=Math.max(num1,num2);
        enb=Math.max(enb,num3);
        System.out.println("En büyük sayı: "+enb);

        //2.yöntem
        int enb2=Math.max(num1, Math.max(num2, num3));
        System.out.println("En büyük sayı: "+enb2);

        //3.yöntem
        System.out.println("En büyük sayı: " + Math.max(num1, Math.max(num2, num3)));
    }
}
