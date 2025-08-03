public class product {
    public static void pro1(int a,int b){
        int prod=a*b;
        System.out.println(prod);
    }

    public static int pro2(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        pro1(2,3);
        int prod=pro2(3,4);
        System.out.println(prod);
    }
}
