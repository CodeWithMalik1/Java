public class Main{
    public static void butterflyPattern(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // second half
        for (int i = n-1; i >= 1; i--) {
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // stars *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        butterflyPattern(7);

    }
}
