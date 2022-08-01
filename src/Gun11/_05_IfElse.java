package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir ifade giriniz= ");
        String ifade = scan.nextLine();

        int ifadeUzunluk = ifade.length();
        boolean iceriyorMu = ifade.contains("study");

        if (ifadeUzunluk > 10 && iceriyorMu) {
            System.out.println("evet");
        } else {
            System.out.println("hayır");
        }
    }
}
