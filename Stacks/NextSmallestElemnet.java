
import java.util.*;
public class NextSmallestElemnet {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 };
        Stack<Integer> stack = new Stack<>();
        int nextSmallest[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()) {
            nextSmallest[i] = -1; // No smaller element found
        } else {
            nextSmallest[i] = arr[stack.peek()]; // Next smallest element is at the top of the stack
        }
            stack.push(i); // Push current index onto the stack
        
    }
    
        for (int i = 0; i < nextSmallest.length; i++) {
            System.out.print(nextSmallest[i] + " ");
        }
    }
}
