package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz= ");
        int number1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz= ");
        int number2 = scan.nextInt();

        System.out.println("İşlem seçiniz= T-Ç-P-B");
        Scanner read = new Scanner(System.in);
        String işlem = read.next();

        if (işlem.equalsIgnoreCase("T")) {
            System.out.println(number1 + number2);
        } else {
            if (işlem.equalsIgnoreCase("Ç")) {
                System.out.println(number1 - number2);
            } else {
                if (işlem.equalsIgnoreCase("P")) {
                    System.out.println(number1 * number2);
                } else {
                    if (işlem.equalsIgnoreCase("B")) {
                        System.out.println(number1 / number2);
                    } else {
                        System.out.println("Hatalı seçim");
                    }
                }
            }
        }
    }
}