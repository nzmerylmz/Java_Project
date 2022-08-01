package Gun19;

public class _05_Tablo {
    public static void main(String[] args) {
        int [][] array={{1,2,3}, {2,3,1} , {5,5,5,21} , {2,10,19}};
        int enb;
        enb=array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                if (array[i][j]>enb){
                    enb=array[i][j];
                }
            }
        }
        System.out.println(enb);
    }
}
