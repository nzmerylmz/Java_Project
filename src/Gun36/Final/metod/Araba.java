package Gun36.Final.metod;

public class Araba extends Tasit {
    private String renk;
    public Araba(String model) {
        super(model);
    }

    public  void arabaYazdir(){
        System.out.println(renk);
    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
