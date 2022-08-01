package Gun28._01_Ornek;

public class JavaStaticneNonStaticMetodlar {
    public static void main(String[] args) {

        //1.yöntem-Çevirme işlemini Java'nın kendi metodlaryla yaparsak;
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        //2.yöntem-Kendi sınıfımı yazaym ve oradan kulllanayım
        Utility util=new Utility ();
        strRakam =util.getString(sayi);
        intRakam= util.getInt(strRakam);

        //3.yöntem
        strRakam=Utility.getString2(sayi);
        intRakam=Utility.getInt2(strRakam);
    }
}
