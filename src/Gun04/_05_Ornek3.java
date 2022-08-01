package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklind eyazrınız.
        // vücut kitle indeksini de bularak yazdırınız(kg/boy*boy)

        double agirlik=92.3;
        int boy=182;

        double kitleIndexi1 = agirlik/(boy*boy);
        int kitleIndexi2 = (int) agirlik/(boy*boy);

        System.out.println("Boyunuz = " +boy+" "+ "Kilonuz = " + agirlik);
        System.out.println("kitleIndexi1 = " + kitleIndexi1);
        System.out.println("kitleIndexi2 = " + kitleIndexi2);
    }

}
