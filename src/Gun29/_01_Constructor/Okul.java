package Gun29._01_Constructor;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id=1;
        st1.name="Nazım";
        st1.surName="Eryılmaz";
        st1.classroom=10;

        Student st2 = new Student();
        st2.id=2;
        st2.name="Melike";
        st2.surName="Eryılmaz";
        st2.classroom=10;

        Student st3 = new Student(3,"Mehmet", "Gunnar",11);
        System.out.println("st3.name = " + st3.name);

        Student st4 = new Student(4,"Yasin", "Gunnar",11);
        Student st5 = new Student(5,"Murat", "Gunnar");
        Student st6 = new Student(6,"Murat");
        Student st7 = new Student(7);

    }
}
