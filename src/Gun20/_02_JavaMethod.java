package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) { // ANA KISIM BURADA BAŞLIYOR -> BAŞLA
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(4,5); //daha önce yazılmış biz çağırıp kullanıyoruz
                       // aynı bunun gibi biz de böyle metodlar yazabiliriz
                       // mesela ekrana merhaba dünya yazan bir metod yazalım
                        // ve sürekli çağıralım
        System.out.println("---------------------");
        merhabaYaz(); //fonksiyonu çağırma şekli
        merhabaYaz();
        merhabaYaz();
    }// ANA KISIM BURADA BİTİYOR -> DUR
    public static void merhabaYaz() { //fonksiyon, metod da denebilir.
        System.out.println("Merhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
