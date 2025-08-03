import java.util.Scanner;

public class ithbit {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        System.out.print("enter ith bit : ");
        int i=sc.nextInt();
        if((n & (1<<i))==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    
}
