import java.util.Stack;
public class QueuesUsingTwoStacks {
    static class Queue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
    public  boolean isEmpty(){
        return stack1.isEmpty();
    }
    public  void add(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }
    public int remove(){
        if(stack1.isEmpty()) return -1;
       return  stack1.pop();
    }
    public void printQueue(){
        for(int i = stack1.size() - 1; i >= 0; i--){
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
}
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.printQueue(); 
        System.out.println(queue.remove()); // 10
        System.out.println(queue.remove()); // 20
        System.out.println(queue.remove()); // 30
        System.out.println(queue.isEmpty()); // true
        

        
    }
}
