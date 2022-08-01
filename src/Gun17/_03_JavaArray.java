package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] dizi1 = new int[5];
        int[] dizi2 = {5, 77, 67, 8, 99, 0, 4, 555};

        String[] kelimeler = new String[5];
        boolean[] dizi3 = new boolean[5];
        double[] oranlar = new double[5];

        for (int i = 0; i < dizi1.length; i++) {
            System.out.println("dizi1 = " + dizi1[i]);
        }
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi1 = " + dizi2[i]);
        }
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("dizi1 = " + kelimeler[i]);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi1 = " + dizi3[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("dizi1 = " + oranlar[i]);
        }
    }
}
