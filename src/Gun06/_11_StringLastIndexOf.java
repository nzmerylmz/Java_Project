package Gun06;

public class _11_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf gibi çalışır ama sondan itibaren indexi verir

        String s1="Merhaba";
        System.out.println("Baştan a nın indexi = " + s1.indexOf("a"));
        System.out.println("Sondan a nın indexi = " + s1.lastIndexOf("a"));
        //index her zaman soldan sayılarak 0 dan itibarendir.

    }
}
