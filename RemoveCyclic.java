public class RemoveCyclic {
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
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        // Detect cycle using Floyd's Tortoise and Hare algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected, now find the start of the cycle
                hasCycle = true;
                break;
                }
               
            
        }
        if(!hasCycle) {
            System.out.println("No cycle detected.");
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null; // Remove the cycle by breaking the link
        System.out.println("Cycle removed.");

    }
    public static void main(String[] args) {
        RemoveCyclic list = new RemoveCyclic();
         list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        // Creating a cycle for testing
        tail.next = head.next; // Making the last node point to the second node to create
        // a cycle
        System.out.println("Before removing cycle:");
        list.removeCycle(); // This will remove the cycle if it exists
        System.out.println("After removing cycle:");
        list.removeCycle(); // This will confirm that the cycle has been removed
    }
    
}
