import java.util.ArrayList;

public class Intro {
        static class Stack{
            static ArrayList<Integer> list = new ArrayList<>();
            public static boolean isEmpty() {
                return list.size() == 0;
            }
            //add an element to the stack
            public static void push(int data){
                list.add(data);
            }
            //remove an element from the stack
            public static int pop(){
                int top=list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
        }
        //peek at the top element of the stack
            public static int peek(){
                return list.get(list.size()-1);
            }
            //print the stack
            public static void printStack(){
                System.out.println(list);
            }
        }
    
     public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);    
        s1.push(30);
        s1.push(40);
        System.out.println("Stack after pushing elements:");
        s1.printStack();
        s1.pop();
        System.out.println("Stack after popping an element:");
        s1.printStack();
        System.out.println("Top element is: " + s1.peek());
        System.out.println("Is stack empty? " + s1.isEmpty());



        
    }
    
}
