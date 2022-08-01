package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {

        int [] dizi=new int [10];
        int [] tekler=new int[10];
        System.out.println("önce tekler = "+Arrays.toString(tekler));
        for (int i = 0; i < dizi.length; i++) {
            dizi [i]=(int)(Math.random()*100);
        }
        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j]%2==1){
                tekler[j]=dizi[j];
            }
        }
        System.out.println("dizi = "+Arrays.toString(dizi));
        System.out.println("tekler = "+Arrays.toString(tekler));
    }
}
