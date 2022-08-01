package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz= ");
        int number1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz= ");
        int number2 = scan.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("İşlem giriniz:\nToplam için T\nÇıkarma için Ç\nÇarpma için P\nBölme için B");
        String işlem = input.next();

        switch (işlem.toUpperCase()) {
            case "T":
                System.out.println(number1 + number2);
                break;
            case "Ç":
                System.out.println(number1 - number2);
                break;
            case "P":
                System.out.println(number1 * number2);
                break;
            case "B":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Hatalı giriş");
        }
    }


}
