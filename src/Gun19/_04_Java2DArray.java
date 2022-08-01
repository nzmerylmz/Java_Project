package Gun19;

public class _04_Java2DArray {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        for (int satır = 0; satır < 3; satır++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                array[satır][sutun] = (int) (((Math.random()*9)+1));
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
