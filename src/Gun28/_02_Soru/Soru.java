package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int [] dizi={2,34,6,1,7};
        int sayi1=2;
        int sayi2=3;

        System.out.println(MyMath.max(dizi));
        System.out.println(MyMath.min(dizi));
        System.out.println(MyMath.getPow(sayi1,sayi2));
        System.out.println(MyMath.dizileriTopla(dizi));



    }
}
