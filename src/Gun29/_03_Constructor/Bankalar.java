package Gun29._03_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        Banka bnk1=new Banka("Garanti",45,1980);
        Banka bnk2=new Banka("Ziraat",4,1970);
        Banka bnk3=new Banka("Vakifbank",45,1960);

        System.out.println("bnk1 = "+bnk1);
        System.out.println("bnk2 = "+bnk2);
        System.out.println("bnk3 = "+bnk3);
    }
}
