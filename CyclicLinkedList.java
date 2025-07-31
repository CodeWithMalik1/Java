public class CyclicLinkedList {
    static Node head;
    static Node tail;
    static int size;

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public boolean isCyclic(){
        Node slow = head;
        Node fast = head;   
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

      
        if(slow==fast) {
            return true;
        }
    }
    return false;

    }






    public static void main(String[] args) {
        CyclicLinkedList list = new CyclicLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        
        // Creating a cycle for testing
        tail.next = head; // Making the last node point to the head
        
        System.out.println("Is the linked list cyclic? " + list.isCyclic());    
        
    }
}
