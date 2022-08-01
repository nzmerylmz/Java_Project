package Gun11;

import java.util.Locale;
import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade giriniz= ");
        String ifade = scan.nextLine();

        int ifadeUzunluk = ifade.length();
        boolean iceriyorMu = ifade.toLowerCase().contains("study");

        if (ifadeUzunluk > 10 && iceriyorMu) {
            System.out.println("evet");
        } else {
            System.out.println("hayır");
        }
    }
}
