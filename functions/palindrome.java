import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter : ");
        int n=sc.nextInt();
        if(isPalin(n)){
            System.out.println("palindrome..");
        }
        else{
            System.out.println("not..");
        }
    }
    public static boolean isPalin(int n){
        int m=n;
        int p1=0;
        while(m>0){
            
           int rem=m%10;
           p1=p1*10+rem;
           m=m/10;


        }
        System.out.println(p1);
        if(p1==n){
            return true;
        }
        else{
            return false;
        }
    }
}
