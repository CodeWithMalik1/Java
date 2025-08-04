import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 10, 8 };
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreater[i] = -1; // No greater element found
            } else {
                nextGreater[i] = arr[stack.peek()]; // Next greater element is at the top of the stack

            }
            stack.push(i); // Push current index onto the stack
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
