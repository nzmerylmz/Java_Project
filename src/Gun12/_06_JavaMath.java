package Gun12;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;
        int c = 5;

        //Math.abs bize mutlak değeri veriyor
        System.out.println("a'nın mutlak değeri: " + Math.abs(a));
        //Math.max bize en büyük sayıyı verir
        System.out.println("a ve b'den en büyük olan: " + Math.max(a,b));
        //Math.min bize en küçük sayıyı verir
        System.out.println("a ve b'den en küçük olan: " + Math.min(a,b));
        //Math.sqrt bize girilen sayının karekökünü verir
        System.out.println("b'nin karekökü: " + Math.abs(b));
        //Math.pow bize sayının kuvvetini verir
        System.out.println("2'nin 3. kuvveti: "+ Math.pow(2,3));
        //Math.round bize sayıyı yuvarlar
        System.out.println("round 3.1: "+Math.round(3.1));
        System.out.println("round 3.5: "+Math.round(3.5));
        //Math.ceil bize girilen rakamdan büyük en küçük tam sayıyı verir
        System.out.println("ceil 3.1 : "+ Math.ceil(3.1));
        //Math.floor bize girilen rakamdan küçük en büyük tam sayıyı verir
        System.out.println("floor 3.1 : "+ Math.floor(3.1));
    }
}
