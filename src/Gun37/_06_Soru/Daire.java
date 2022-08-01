package Gun37._06_Soru;

public class Daire implements IFormuller {

    @Override
    public void alan(int... ebatlar) {
        double alan = 0;
        for (int i = 0; i < ebatlar.length; i++) {
            alan=Math.PI*ebatlar[i]*ebatlar[i];
        }
        System.out.println("Daire alanı= "+alan);
    }

    @Override
    public void cevre(int... ebatlar) {
        double cevre = 0;
        for (int i = 0; i < ebatlar.length; i++) {
            cevre=(Math.PI*ebatlar[i]*2);
        }
        System.out.println("Daire çevre= "+cevre);
    }
}
