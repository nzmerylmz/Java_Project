package Gun37._04_Ornek;

import Gun37._03_Ornek.ICizdirir;

public class A4 implements IYazdirir,IGosterir {

    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yaz() {
        System.out.println("Yazdırdı");
    }
}
