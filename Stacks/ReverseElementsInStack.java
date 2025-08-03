import java.util.Stack;
public class ReverseElementsInStack {
    // Function to reverse the elements in a stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return; // Base case: if the stack is empty, do nothing
        }
        
        // Pop the top element
        int top = stack.pop();
        
        // Recursively reverse the remaining stack
        reverseStack(stack);
        
        // Push the popped element back to the bottom of the stack
        pushAtBottom(stack, top);
    }
    // Helper function to push an element at the bottom of the stack
    private static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        
        // Pop the top element
        int top = stack.pop();
        
        // Recursively call to push the data at the bottom
        pushAtBottom(stack, data);
        
        // Push the popped element back on top
        stack.push(top);
    }
    public static void main(String[] args) {
        // Create a stack and push some elements
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack before reversing: " + stack);

        // Reverse the elements in the stack
        reverseStack(stack);

        // Print the reversed stack
        System.out.println("Stack after reversing: " + stack);
    }
    
}
