package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni kullanıcı ve şifre giriniz");
        System.out.print("Kullanıcı= ");
        String userName = scanner.nextLine();

        System.out.print("Şifre= ");
        String password = scanner.nextLine();

        try {
            if (password.length() < 8) {
                throw new Exception("Şifre 8 karakterden az olamaz");
            }
            if (password.length() < 15) {
                throw new Exception("Şifre 15 karakterden az olamaz");
            }
        } catch (Exception ex) {
            System.out.println("Lütfen dikkat!");
            System.out.println("Uyarı= " + ex.getMessage());
            // log tutuluyor.
            // kimler bu hatalı girişleri yapmış
            // ....
            // bir çok kontrol tek yerde toplanıyor.
        }
        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
        // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
        // break gibi programın devamının çalışmasını engelliyoruz.
    }
}
