import java.util.Scanner;

public class updateithbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        System.out.print("enter ith bit : ");
        int i=sc.nextInt();
        int bitmask=~(1<<i);
        int newbit=2;
        System.out.println("clear "+ (n & bitmask));
        int updatebit=(n &bitmask) | newbit<<i;
        System.out.println("update "+updatebit);
    }
    
}
