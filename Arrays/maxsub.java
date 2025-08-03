import java.util.*;
public class maxsub {
    public static void sub(int arr[]){
        int total=0;
        int maxsum=Integer.MIN_VALUE;
       
        for (int  i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int sum=0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    sum=sum+arr[k];
                   
                    
                    
                }
                total++;
                
                System.out.println();
                System.out.println("sum is : "+sum);
               
                if (sum>=maxsum) {
                    maxsum=sum;
                   
                    
                }
               

                
            }
            System.out.println();
            
            
        }
       
        System.out.println("total sub arrays are : "+total);
        System.out.println("Maxsum is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4};
        sub(arr);
        
    }
    
}
