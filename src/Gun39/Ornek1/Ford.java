package Gun39.Ornek1;

public class Ford extends BinekOto {

    @Override
    public int getUretimYili() {
        System.out.print("Üretim yili= ");
        return super.getUretimYili();
    }

    @Override
    public String getMarka() {
        return "FORD";


    }
}
