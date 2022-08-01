package Gun05;

import java.util.Scanner;

public class _0_JavaScanner {
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);
        //oku isminde bir okuyucu tanımlandı, (System.in) klavyeden giriş yapmak üzere
        System.out.print("Sayi Giriniz= ");
        int sayi= okuyucu.nextInt();
        //oku.nextInt() ekrandan sayıyı aldı ve biz de sayıyı değişkenine attık

        System.out.println("sayi = " + sayi);
    }
}
