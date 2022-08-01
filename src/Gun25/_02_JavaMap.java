package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını iki kişi için yapınız

        Map<String, String> sKartvizit = new HashMap<>();
        sKartvizit.put("isim", "Nazmiye");
        sKartvizit.put("email", "nazmiye@gmail.com");
        sKartvizit.put("adres", "Türkiye");
        sKartvizit.put("telefon", "3214568454");

        System.out.println("sKartvizit = " + sKartvizit.get("isim"));
        System.out.println("sKartvizit = " + sKartvizit.get("email"));
        System.out.println("sKartvizit = " + sKartvizit.get("telefon"));


        Map<String, String> kKartvizit = new HashMap<>();
        kKartvizit.put("isim", "Kadir");
        kKartvizit.put("email", "kadir@gmail.com");
        kKartvizit.put("adres", "Almanya");
        kKartvizit.put("telefon", "565656565");

        Map<String, Map<String, String>> kartvizitDefteri = new HashMap<>();
        kartvizitDefteri.put("nazmiye", sKartvizit);
        kartvizitDefteri.put("kadir", kKartvizit);

        System.out.println(kartvizitDefteri.get("kadir").get("telefon"));

        for (Map.Entry<String, Map<String, String>> kartVizit : kartvizitDefteri.entrySet()) {
            System.out.println(kartVizit);
        }

    }
}
