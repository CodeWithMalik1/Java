import java.util.*;
public class rainwater {
    public static int trap(int arr[]){
        int len=arr.length;
        int width=1;


        //for left max value
        int leftmax[]=new int[len];
        leftmax[0]=arr[0];
        for (int i = 1; i < len; i++) {
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
            
        }

        //for right max value
        int rightmax[]=new int[len];
        rightmax[len-1]=arr[len-1];//because leneight is +1
        for (int i = len-2; i >=0; i--) {
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
            
        }


        //loop
        int trappedwater=0;
        for (int i = 0; i < len; i++) {

            //water level
            int waterlevel=Math.min(leftmax[i],rightmax[i]) *width;

            //trappedwater
            trappedwater+=waterlevel-arr[i];

            
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println("trappedWater : "+trap(arr));
        
    }
    
}
