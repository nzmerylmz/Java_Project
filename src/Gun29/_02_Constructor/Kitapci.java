package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {

        Book b1=new Book("Harry Pother",2000,"J.K.Rowling");
        System.out.println(b1.name+"-"+b1.publishYear+"-"+b1.author);

        Book b2=new Book("İçimizdeki Şeytan",1935);
        System.out.println(b2.name+"-"+b2.publishYear);

        Book b3=new Book("Kuyucaklı Yusuf","Sabahattin Ali");
        System.out.println(b3.name+"-"+b3.author);

        System.out.println("------------------");

        b1.Yazdır();
        b2.Yazdır();
        b3.Yazdır();

        System.out.println("------------------");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
