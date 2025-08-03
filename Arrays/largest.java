import java.util.*;
public class largest {
    public static int largest(int num[]){
        int large=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
           
            if(num[i]>large){
                large=num[i];
               
            }
            
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[]={10,20,55,30,40};
        int largest=largest(arr);
        System.out.println(largest);

        
    }
    
}
