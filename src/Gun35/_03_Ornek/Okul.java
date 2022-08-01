package Gun35._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        IlkOgrencisi ilk=new IlkOgrencisi("Nazım", Ogrenci.Type.ILK);
        System.out.println(ilk);

        LiseOgrencisi lise=new LiseOgrencisi("Melike", Ogrenci.Type.LISE);
        System.out.println(lise);
    }
}
