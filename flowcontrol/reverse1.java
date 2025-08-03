import java.util.*;
public class reverse1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter : ");
        int n=sc.nextInt();
        int rev=0,last;
        for(;n>0;n/=10){
           
            last=n%10;
            rev=(rev*10)+last;
        }
        System.out.println(rev);

    }
    
}
