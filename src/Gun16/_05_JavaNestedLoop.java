package Gun16;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 0; m < 5; m++) {
            for (int n = 4; n >= m; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
