public class ReverseDoubleLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
        public static Node tail;
        public static int size;
   


// Adding a new node at the start of the list
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null ){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;

    }
    //Printing the list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //reverse the linked list   
    public void reverse() {
        Node current = head;
        Node prev=null;
        Node next;
        
        // Swap next and prev for each node
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        // Update head and tail
        head = prev;
           
       
    }
    public static void main(String[] args) {
        ReverseDoubleLinkedList dll = new ReverseDoubleLinkedList();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        System.out.println("List after adding nodes at the beginning:");
        dll.print();
        
        dll.reverse();
        System.out.println("List after reversing:");
        dll.print();
        
    }
    
}
