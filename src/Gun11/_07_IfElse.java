package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir şifre giriniz= ");
        String password = scan.nextLine();

        boolean passVarMi=password.contains("pass");
        int uzunluk=password.length();

        if (uzunluk>=8 && uzunluk<=12 && passVarMi==false) {
            System.out.println("Girilen şifre kurallara uygundur");
        } else {
            System.out.println("Girilen şifre kurallara uygun değildir");
        }
    }
}
