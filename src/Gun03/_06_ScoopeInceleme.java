package Gun03;

public class _06_ScoopeInceleme {
    public static void main(String[] args) {
        int a=5; // a değeri aşağıdaki parantez bölgesinde
                // geçerli olur çünkü dışarıdaki içeriye erişebilir

        {   // bu parantez arası kendine özel bölge oluşturur
            // ve buradaki tanımlanan değişkenler sadece burada
            // geçerli olur. Kullanım amacı karışıklığı azaltmak.

            int b = 5;
            b = 77;
            a=b;
        }  //içerde tanımlanan değişkenler sadece içerde kullanılabilir
            //dışardan gelenlerin içeride işlem görme yetkisi var, bu nedenle a=77 oldu. İçerde değişti

        //System.out.println("b = " + b); //b burada geçerli değil. Yukarıdaki iki parantezin arasına yazdık.
        System.out.println("a = " + a);
    }
}
