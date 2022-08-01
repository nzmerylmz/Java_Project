package Gun19;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int [] array= new int[3];
        int [] array1={34,56,77};

        int [][] tablo1=new int[2][3];
        int [][] tablo2={{23,44,55},{45,66,77}};

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println(satir+","+sutun+"= "+tablo2[satir][sutun]);
            }
        }
        int toplam=0;
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                toplam=toplam+tablo2[satir][sutun];
            }
        }
        System.out.println("toplam= "+toplam);
    }
}
