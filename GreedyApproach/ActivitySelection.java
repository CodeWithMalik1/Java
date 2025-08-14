class ActivitySelection {
    public static void Selection(int start[], int finish[]) {
        int n = start.length;
        int i = 0, c = 0;
        for (int j = 1; j < n; j++) {
            if (start[j] >= finish[i]) {
                if (c != 0)
                    System.out.print(" -> ");
                c++;
                System.out.print(j);

                i = j;
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int finish[] = { 2, 4, 6, 7, 9, 9 };
        Selection(start, finish);
    }
}