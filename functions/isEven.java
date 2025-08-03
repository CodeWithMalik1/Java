import java.util.*;
public class isEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter : ");
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println("even..");
        }
        else{
            System.out.println("odd..");
        }

    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
           return false;
        }
    }
}
