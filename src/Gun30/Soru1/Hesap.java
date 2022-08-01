package Gun30.Soru1;

public class Hesap {
    int yatan;
    int cekilen;
    private int bakiye;

    public void paraYatirma(int i) {
        this.bakiye+=i;
        this.yatan+=i;
    }
    public void paraCekme(int i) {
        if (this.bakiye<i){
            System.out.println("Bakiye yetersiz");
        }else {
            this.bakiye-=i;
            this.cekilen+=i;
        }
    }

    @Override
    public String toString() {
        return "Hesabınıza Yatan: "+this.yatan+"\n"+"Hesabınızdan Cekilen: "+this.cekilen+"\n"+"Bakiye: "+this.bakiye;
    }
}
