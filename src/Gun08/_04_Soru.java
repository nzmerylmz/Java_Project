package Gun08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Şifre giriniz= ");
        String input=scan.nextLine();
        String password="bayrak";
        boolean esitMi=password.equals(input);
        boolean esitMi2=password.equalsIgnoreCase(input);
        System.out.println(esitMi);
        System.out.println(esitMi2);
    }
}
