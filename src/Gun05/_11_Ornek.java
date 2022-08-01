package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Cadde girin: ");
        String cadde= scan.nextLine();

        System.out.print("Sokak girin: ");
        String sokak= scan.nextLine();

        Scanner scan2=new Scanner(System.in);
        System.out.print("Posta Kodu: ");
        int postaKodu= scan2.nextInt();

        System.out.print("Ülke girin: ");
        String ulke= scan.nextLine();

        System.out.print("Adres: "+ cadde +" "+ sokak +" "+ postaKodu +" "+ ulke);
    }
}
