package Gun38.Soru2;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        Swallow swallow=new Swallow();
        Cat cat=new Cat();
        Shark shark=new Shark();
        Duck duck=new Duck();

        ArrayList<Hayvanlar> hayvanlar=new ArrayList<>();
        hayvanlar.add(cat);
        hayvanlar.add(swallow);
        hayvanlar.add(shark);
        hayvanlar.add(duck);


        for (Hayvanlar hayvan: hayvanlar){
            System.out.println(hayvan.getClass().getSimpleName());
            System.out.println("-------------");
            if (hayvan instanceof  Cat){
                System.out.println(((Cat) hayvan).food());
                System.out.println();
            }
            if (hayvan instanceof Swallow){
                System.out.println(((Swallow) hayvan).food());
                System.out.println();
            }
            if (hayvan instanceof Shark){
                System.out.println(((Shark) hayvan).food());
                System.out.println();
            }
            if (hayvan instanceof Duck){
                System.out.println(((Duck) hayvan).food());
                System.out.println();
            }
        }
    }
}
