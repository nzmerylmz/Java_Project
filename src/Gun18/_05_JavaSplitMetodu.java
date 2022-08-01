package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //split: bir stringi parçalara ayırmak demek

        // kullanıcdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle yazınız: ");
        String cumle = scan.nextLine();

        String[] kelimeler = cumle.split(" ");

        System.out.println("kelimeler= " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayısı= " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler= " + kelimeler[i]);
        }
    }
}
