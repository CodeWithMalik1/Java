import java.util.Stack;
public class DuplicateParanthasis {
    public static boolean checkDuplicate(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;

                }
                if(count<1){
                    return true; // Duplicate parentheses found
                }
                else{
                    stack.pop(); // Pop the '('
                }
            }
            else{
                stack.push(ch); // Push other characters onto the stack
            }  
        }
        return false; // No duplicate parentheses found
    }
    public static void main(String[] args) {
       String str="((a+b))";
         System.out.println(checkDuplicate(str)); // Output: true


}
}