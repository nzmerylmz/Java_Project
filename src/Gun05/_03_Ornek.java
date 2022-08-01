package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan Adını ve Soyadını alarak ekrana yazdırınız.
        Scanner scan=new Scanner(System.in); //okuyucuyu bir kere tanımlamız gerekiyor
        System.out.print("İsim soyisim giriniz :"); // ekrana gelen veri girişinin ne için
                                                    // olduğunu kullanıcıya belirtmek için zorunda
                                                    // değil. LN yi sildik çünkü cursor yanında olsun
        String isimSoyad=scan.nextLine();           // okuma işi bu noktada yapılıyor. bizde okunan değeri değişkene eşitliyoruz
        System.out.println("isimSoyad = " + isimSoyad); // okunan değer doğru mu diye ekrana yazdırıyoruz
    }
}
