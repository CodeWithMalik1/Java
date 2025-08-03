public class Fibbonci {

    public static int printfib(int n){
        if(n==1){
           return 0;
        }
        if(n==2){
            return 1;
        }
       int presentNumber= printfib(n-1);
       int beforeNumber=printfib(n-2);
       int nextNumber=presentNumber+beforeNumber;
       return nextNumber;

    }

    public static void main(String[] args) {


        System.out.print(printfib(5));

        
    }
    
}
