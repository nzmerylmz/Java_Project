package Gun40.Ornek4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TechnoKitchen {
    public static ArrayList<IFood> yemekListesi = new ArrayList<>();
    public static ArrayList<IFood> siparisAl(int secim) {

        switch (secim) {
            case 1:
                yemekListesi.add(new AdanaKebap());
                break;
            case 2:
                yemekListesi.add(new Lahmacun());
                break;
            case 3:
                yemekListesi.add(new Borsh());
                break;
            case 4:
                yemekListesi.add(new Palov());
                break;
        }
        return yemekListesi;
    }
    public static void siparisHazirlaniyor() throws InterruptedException {
        double toplam = 0;
        int adanaKebapSayac = 0;
        int lahmacunSayac = 0;
        int borshSayac = 0;
        int palovSayac = 0;
        LocalTime saat = LocalTime.now();
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("********Sipariş Hazırlanıyor******");
        System.out.println("Siparişinizin hazırlanma saati: "+saat.format(ozelFormat1));
        System.out.println("Siparişler: ");
        for (IFood yemekler : yemekListesi) {
            if (yemekler instanceof AdanaKebap) {
                adanaKebapSayac++;
            }
            if (yemekler instanceof Lahmacun) {
                lahmacunSayac++;
            }
            if (yemekler instanceof Borsh) {
                borshSayac++;
            }
            if (yemekler instanceof Palov) {
                palovSayac++;
            }
        }
        if (adanaKebapSayac > 0) {
            System.out.println(adanaKebapSayac + " adet Adana Kebap");
            adanaKebapSayac = 1;
        }
        if (lahmacunSayac > 0) {
            System.out.println(lahmacunSayac + " adet Lahmacun");
            lahmacunSayac = 1;
        }
        if (borshSayac > 0) {
            System.out.println(borshSayac + " adet Borsh");
            borshSayac = 1;
        }
        if (palovSayac > 0) {
            System.out.println(palovSayac + " adet Palov");
            palovSayac = 1;
        }
        System.out.println();
        for (IFood food : yemekListesi) {
            if (food instanceof AdanaKebap) {
                if (adanaKebapSayac == 1) {
                    food.taste();
                    ((AdanaKebap) food).marinade();
                    ((AdanaKebap) food).grill();
                    System.out.println();
                }
                adanaKebapSayac++;
                toplam += food.ucret();
            }
            if (food instanceof Lahmacun) {
                if (lahmacunSayac == 1) {
                    food.taste();
                    ((Lahmacun) food).dough();
                    ((Lahmacun) food).addMeat();
                    ((Lahmacun) food).bake();
                    System.out.println();
                }
                lahmacunSayac++;
                toplam += food.ucret();
            }
            if (food instanceof Borsh) {
                if (borshSayac == 1) {
                    food.taste();
                    ((Borsh) food).boil();
                    ((Borsh) food).eatTomorrow();
                    System.out.println();
                }
                borshSayac++;
                toplam += food.ucret();
            }
            if (food instanceof Palov) {
                if (palovSayac == 1) {
                    food.taste();
                    ((Palov) food).fry();
                    ((Palov) food).boil();
                    System.out.println();
                }
                palovSayac++;
                toplam += food.ucret();
            }
        }
        System.out.println("Toplam tutar=" + toplam);
        for (int i = 30; i >=0 ; i--) {
            System.out.print("\rSipariş için kalan süre = "+i+" dakika");
            Thread.sleep(60000);
        }
    }
}

