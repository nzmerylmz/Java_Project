package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();

        ozelMerhabaYaz("Melike");
        ozelMerhabaYaz("Nazım");
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }
    public static void ozelMerhabaYaz (String isim){
        System.out.println("Merhaba "+isim+" Hoşgeldiniz");
    }
}
