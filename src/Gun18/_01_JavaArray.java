package Gun18;

public class _01_JavaArray {
    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int j = 0; j <array.length; j++) {
            if (array[j] % 2 == 1) {
                array[j]=1;
            }else {
                array[j]=2;
            }
            System.out.println("Dizi["+j+"]= "+array[j]);
        }
    }
}

