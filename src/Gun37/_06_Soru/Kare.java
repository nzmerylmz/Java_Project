package Gun37._06_Soru;

public class Kare implements IFormuller {

    public void alan(int... ebatlar) {
        int alan=1;
        for (int i = 0; i < ebatlar.length; i++) {
            alan=ebatlar[i]*ebatlar[i];
        }
        System.out.println("Karenin alanı= "+alan);
    }

    @Override
    public void cevre(int... ebatlar) {
        int cevre=0;
        for (int i = 0; i < ebatlar.length; i++) {
            cevre=4*ebatlar[i];
        }
        System.out.println("Karenin çevresi= "+cevre);
    }
}
