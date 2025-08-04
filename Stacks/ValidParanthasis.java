import java.util.Stack;
public class ValidParanthasis {
    public static boolean valid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening brackets
            if(ch=='{'|| ch=='['||ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && ch==')'||
                stack.peek()=='{' && ch=='}'||
                stack.peek()=='[' && ch==']'){
                    stack.pop();

                }
                else return false;
            }
            
        }
        if(stack.isEmpty()){
                return true;
            }
            else{
                return false;
            }

    }
    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println(valid(str));
        String str2="{[(])}";
        System.out.println(valid(str2));
        
    }
    
}
