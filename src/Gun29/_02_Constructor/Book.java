package Gun29._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;
    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }
    public Book(String name, int publishYear) {
        this(name, publishYear, "");
    }
    public Book(String name, String author) {
        this(name, 0, author);
    }
    public void Yazdır() {
        if (publishYear == 0) {
            System.out.println(name + " " + author);
        } else {
            System.out.println(name + " " + publishYear + " " + author);
        }
    }
    public String toString() {
        if (publishYear == 0) {
            return name + " " + author;
        } else {
            return name + " " + publishYear + " " + author;
        }
    }
}
