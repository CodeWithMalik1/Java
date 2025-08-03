public class factorial {

    public static int printfac(int n){


       if (n==0) {
        return 1;
        
       }
       int fact1=printfac(n-1);
       int fact2=n * printfac(n-1);
       return fact2; 
    } 
    public static void main(String[] args) {
        System.out.println(printfac(5));
        
    }
    
}
