import java.util.*;
public class kedans {
    public static void kedanns(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
           
            max=Math.max(max,curr);
            
        }
        System.out.println("max sum of sub array is : "+max);
    }
    public static void main(String[] args) {
        
        int arr[]={-1,-2,-3,-3};
        kedanns(arr);
    }
    
}
