import java.util.Stack;
class StacksUsingCollectionFrameworks {
    public static void main(String[] args) {
        // Create a stack using the Stack class
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);
        stack.pop();
        System.out.println("Stack after popping an element: " + stack);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}