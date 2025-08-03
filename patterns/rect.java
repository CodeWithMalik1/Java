class rect {
    public static void main(String[] args) {
        int n = 5;
        for (int line = 1; line < n; line++) {
            for (int star = 1; star <= n; star++) {
                if (line == 2 && line == 3) {

                    System.out.print("*  *");

                } else {

                    System.out.print("*");

                }
            }

            System.out.println();
        }
    }
}
