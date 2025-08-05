import java.util.Stack;
public class MAxRectAreaInHisto {
    public static int maxArea(int height[]){
        int n=height.length;
        int maxArea=0;
        int left[]=new int[n];
        int right[]=new int[n];
        Stack<Integer> stack=new Stack<>();
       
        //fill next smaller right array
        for (int i = n-1; i>=0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
                
            }
            if(stack.isEmpty()) right[i]=height.length;
            else right[i]=stack.peek();
            stack.push(i);

            
        }

         // Fillnext smaller left array
         stack=new Stack<>(); //clear the stack for reuse
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&& height[stack.peek()]>=height[i]){
                stack.pop();
            }
            if(stack.isEmpty()) left[i]=-1;
            else left[i]=height[stack.peek()];
            stack.push(i);

        }
        //current area:width=j-i-1=right[i]-left[i]-1
        for(int i=0;i<n;i++){
            int currentArea=(right[i]-left[i]-1)*height[i];
            maxArea=Math.max(maxArea, currentArea);
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int[]arr={2,1,5,6,2,3};
         // Example histogram heights
        System.out.println(maxArea(arr)); // Output: 12
    }
    
}
