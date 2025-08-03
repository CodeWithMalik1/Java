import java.util.*;
public class set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0,odd=0;
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                even=even+i;

            }
            else{
                odd=odd+i;
            }
            
        }
        System.out.println("sum of even numbers is :"+even);
        System.out.println("sum of odd numbers is :"+odd);
        
    }
}
