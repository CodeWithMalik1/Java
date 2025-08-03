class patterns2 {
    public static void Hallow(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public static void Invert(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void Invert1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
           
            System.out.println();

        }
    }
    public static void floyd(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+i+" ");
                
            }
           
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Hallow(4, 6);
        Invert(7);
        Invert1(5);
        floyd(5);
    }
}