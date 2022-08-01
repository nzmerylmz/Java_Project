package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] array=new int[100];

        int enb;
        enb=array[0];
        int dizininIndexi=0;

        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)(Math.random()*100);
        }

        for (int i = 0; i < array.length ; i++) {
            if (array[i]>enb){
                enb=array[i];
                dizininIndexi=i;
            }
        }
        System.out.print("Dizi ["+dizininIndexi+"]= "+enb);
    }
}
