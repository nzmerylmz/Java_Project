package Gun33._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.setRenk("Kırmızı");
        araba1.setModel("Sedan");
        araba1.setMotorHacmi(1800);
        araba1.setKapiSayisi(5);

//        System.out.println(araba1.getKapiSayisi());
    }

    // Kural: genel yazılım kuralıdır. Bütün
    // değişkenler private yapılır ve kapsülleme
    // ile kullanılır. Eğer gerekiyorsa private
    // kaldırılır
}
