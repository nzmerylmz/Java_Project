package Gun37._04_Ornek;

public class Mai {
    public static void main(String[] args) {
        A4 a4=new A4();
        a4.goster();
        a4.yaz();

        IGosterir a=new A4();
        a.goster();
        IYazdirir b=new A4();
        b.yaz();
    }
}
