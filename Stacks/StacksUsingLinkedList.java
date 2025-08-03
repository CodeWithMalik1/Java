public class StacksUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
  static Node head=null;
  public static boolean isEmpty(){
    return head == null;
  }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

        
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop.");
            return;
        }
        int poppedData = head.data;
        head = head.next;
        System.out.println("Popped element: " + poppedData);

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot peek.");
            return -1; // or throw an exception
        }
        return head.data;
    }
    public void printStack(){
        Node current = head;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StacksUsingLinkedList stack = new StacksUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements:");
        stack.printStack();
        stack.pop();
        System.out.println("Stack after popping an element:");
        stack.printStack();
        
    }
    
}
