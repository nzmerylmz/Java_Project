package Gun31.StaticModifier.Ornek2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız
    // Her öğrencinin takip eden bir numarası olmalı
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim
    public static void main(String[] args) {
        Student s1 = new Student("Nazım", "Eryılmaz");
        Student s2 = new Student("Melike", "Eryılmaz");
        Student s3 = new Student("Mehmet", "Gunnar");
        Student s4 = new Student("Goker", "Inel");
        Student s5 = new Student("Ertan", "Eryılmaz");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("Öğrenci sayısı=" + Student.sayac);

        // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
        // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
        // TODO: öğrenci sayısı doğru gözükmeli.
    }
}
