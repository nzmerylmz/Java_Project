package Gun16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 2lerin çarpım tablosunu sormuştuk
        // 2 x 1 = 2
        // 2 x 2 = 4
        // ....

        for (int j = 1; j < 5; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }
            System.out.println();
        }
    }
}
