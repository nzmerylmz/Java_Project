package Gun37._06_Soru;

public class Dikdortgen implements IFormuller {

    @Override
    public void alan(int... ebatlar) {
        int alan=1;
        for (int i = 0; i < ebatlar.length; i++) {
            alan*=ebatlar[i];
        }
        System.out.println("Diktörtgenin alanı= "+alan);
    }

    @Override
    public void cevre(int... ebatlar) {
        int cevre=0;
        for (int i = 0; i < ebatlar.length; i++) {
            cevre+=(2*ebatlar[i]);
        }
        System.out.println("Diktörtgenin çevresi= "+cevre);
    }
}
