package Gun31.FinalModifier.Ornek1;

public class NufusMudurlugu {
    // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    public static void main(String[] args) {
        Vatandas v1= new Vatandas("ismet");
        Vatandas v2= new Vatandas("Nazmiye");
        Vatandas v3= new Vatandas("Mehmet");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}
