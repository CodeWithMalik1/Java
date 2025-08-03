import java.util.*;
public class factotial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        for (int i = 1; i <=n; i++) {
            mul=mul*i;
           

            
        }
        System.out.println(mul);
        
    }
}
