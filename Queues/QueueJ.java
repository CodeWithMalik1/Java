import java.util.*;
class QueueJ{

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        queue.remove(); 
        System.out.println(queue);
        Queue<String> queue2 = new ArrayDeque<>();
        queue2.offer("Hello");
        queue2.offer("World");
        queue2.offer("Java");
        queue2.offer("Queue");
        queue2.offer("Example");
        System.out.println(queue2);
        queue2.poll();
        System.out.println(queue2);
        
       
    }
}