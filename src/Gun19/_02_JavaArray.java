package Gun19;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {
        int [] array= new int[10];
        int adet=0;

        for (int i = 0; i < array.length ; i++) {
            array[i]=(int)(Math.random()*100);
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j]%2==1){
                adet=adet+1;
            }
        }
        int[] yeniArray=new int[adet];
        int yeniArrayIndex=0;
        for (int k = 0; k < array.length ; k++) {
            if (array[k]%2==1){
                yeniArray[yeniArrayIndex]=array[k];
                yeniArrayIndex++;
           }
       }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(yeniArray));
    }
}
