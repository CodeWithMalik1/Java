import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        // Push all characters of the string onto the stack
        int idx=0;
        while(idx<str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder reversed = new StringBuilder("");
        while(!stack.isEmpty()){
            // Pop characters from the stack and append to the result
            char character = stack.pop();
            reversed.append(character);
            
        }
        return reversed.toString();

    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
    
}
