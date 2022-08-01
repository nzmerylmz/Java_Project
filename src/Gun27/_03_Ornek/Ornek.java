package Gun27._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
        //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, birimFiyat(double), fatura)
        //3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
        //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
        //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
        //6.Adım  :Ödenecek rakamı  toplam tüketimi  birimFiyat(0.7) ile çarparak hesaplatınız yazdırınız.

        //ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
        //        ondan sonra toplam alarak çıkartınız

        Musteri musteri1=new Musteri();
        musteri1.name="Nazım";
        musteri1.elektrikHesabi= new ElektrikHesabi();

        musteri1.elektrikHesabi.tuketimEkle(100);
        musteri1.elektrikHesabi.tuketimEkle(200);
        musteri1.elektrikHesabi.tuketimEkle(200);

        musteri1.elektrikHesabi.toplamTuketimYaz();
        musteri1.elektrikHesabi.odenecekToplamTutar();


    }
}
