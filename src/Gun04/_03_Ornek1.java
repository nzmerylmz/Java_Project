package Gun04;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farklı (char, int, boolean) tipte deişken tanımlayınız.
        //değer atayınız ve ekrana yazdırınız

        char subeAdi= 'B';
        int sinifNo=5;
        boolean gectiMi= true;
        String subeAdi2="C";

        System.out.println("sinifNo = " + sinifNo);
        System.out.println("subeAdi = " + subeAdi);
        System.out.println("gectiMi = " + gectiMi);

        System.out.println(sinifNo+"-"+subeAdi+":"+gectiMi); //toplamda içlerinde bir tane
        // string ifade varsa toplama işlemi yan yana birleştirme işlemine dönüşür
        System.out.println(sinifNo+subeAdi2+":"+gectiMi);
    }
}
