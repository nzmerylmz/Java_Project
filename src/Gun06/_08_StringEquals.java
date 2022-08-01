package Gun06;

public class _08_StringEquals {
    public static void main(String[] args) {
        // 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuc boolean döner

        String s1= "Merhaba";
        String s2= "Merhaba";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);
        System.out.println("s1.equals(Merhaba) = " + s2.equals("Merhaba")); //s1 s2'ye eşit Mi
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); //s1 s2'ye eşit Mi
    }
}
