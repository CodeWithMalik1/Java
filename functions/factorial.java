public class factorial {

    public static int fact(int a ){
        int fact1=1;
        while(a>0){
           
            fact1=fact1*a;
            a--;

        }
        return fact1;
    }
    public static void main(String[] args) {
        int f1=fact(5);
        System.out.println(f1);
    }
}
