package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        String str = "";
        int a = 5;
        int b = 0;
        int c = 0;

        try {
            char ilkHarf = str.charAt(0);
            c = a / b;
        } catch (StringIndexOutOfBoundsException hata) {
            System.out.println("Kelime boş olduğu için harf alınamadı");
        } catch (ArithmeticException hata) {
            System.out.println("Sayi sıfıra bölünmez");
        } catch (Exception hata) {
            System.out.println("Program sonu");
        }
    }
}
