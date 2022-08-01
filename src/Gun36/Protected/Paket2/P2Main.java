package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Main  {
    public static void main(String[] args) {
        P1Hayvan h2=new P1Hayvan();
        h2.ad="Kopek";

        P2Kedi kedi1=new P2Kedi("kopük","scottish");
        System.out.println(kedi1);
    }

}
