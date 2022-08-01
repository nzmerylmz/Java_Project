package Gun33._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul=new Okul("Kabatas Ilkokul",3);
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        do {
            System.out.print("Ogrenci Adı: ");
            String ad= oku.nextLine();

            System.out.print("Ogrenci Soyadı: ");
            String soyad= oku.nextLine();

            System.out.print("Ogrenci Yas: ");
            int yas= okuInt.nextInt();

            if (yas<=15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                okul.ogrenciler.add(ogr);
            }else {
                System.out.println("Yaş sebebiyle kayıt yapılamadı");
            }
            System.out.println("ogrler= "+okul.ogrenciler);
        }while (okul.ogrenciler.size()<okul.getMaxOgrenciSayisi());



    }
}
