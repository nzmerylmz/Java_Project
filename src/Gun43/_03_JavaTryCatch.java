package Gun43;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        try {//dene, hatanın başladığı yerin üstüne konur
            System.out.println("Program başladı");
            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);
            System.out.println("İşlem tamam");
        } catch (Exception hata) {// hata olduğunda programı kırma
            System.out.println("Şu hata oldu = " + hata.getMessage());
        }
        System.out.println("Program çalışmaya devam etti");

        try {
            //java çalışmaya devam
        } // anlamadığın yer mi oldu? kırılmadan devam
        catch (Exception hata) {
            // hatanın sebebini anla
            // gereken videoları
            // arkadaşlarından sonra mentöre sonra hocaya mutlaka sor
            // öğren ve kırılmadan devam et
        }
        // sonunda seni güzel bir meslek bekliyor
        for (int i = 0; i <10 ; i++) {
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("Birinci sayıyı giriniz= ");
                int sayi1 = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz= ");
                int sayi2 = scanner.nextInt();
                System.out.println("Bölüm= " + (sayi1 / sayi2));
            }catch (Exception hata){
                System.out.println(hata.getMessage());
                i--;
            }
        }
    }
}
