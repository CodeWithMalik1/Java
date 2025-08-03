public class swap {

    public static int s1(int a, int b) {

        int temp1 = a;
        a = b;
        b = temp1;

        return a;
    }

    public static void main(String[] args) {
        int s = s1(10, 20);
        System.out.print(s);


    }
}
