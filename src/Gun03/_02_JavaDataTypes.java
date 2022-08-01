package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;
        //default olarak tam sayılarının hepsini INT kabul eder

        byte byteDeger=45;
        short shortDeger=1645;
        int intDeger=25000;
        long longDeger=233333333333333L; //tam sayıları default olarak INT kabul ettiğinden
                                         //sonuna L eklendi, sayıya etkisi yoktur.


        //default olarak ondalıklı sayıların hepsini DOUBLE kabul eder.
        float floatDeger=3.14F; //ondalıklı sayıları default olarak DOUBLE kabul ettiğinden
                                //sonuna F eklendi, sayıya etkisi yoktur.
        double doubleDeger=3.14; // her iki taraf da DOUBLE olduğundan ek bilgiye ihtiyaç olmadı

        char basHarf='A';
        char basHarf2=65; // karakter tablosunda 65 a ya karşılık geldiği için sayısını da atayabiliriz
        boolean evetMi=true;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("basHarf2 = " + basHarf2);
        System.out.println("evetMi = " + evetMi);


    }
}
