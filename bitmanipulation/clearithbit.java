import java.util.Scanner;

public class clearithbit {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        System.out.print("enter ith bit : ");
        int i=sc.nextInt();
        int bitmask=~(1<<i);
        System.out.println(n & bitmask);
    }
    
}
