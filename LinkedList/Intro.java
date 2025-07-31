import java.util.*;
class Intro {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addAfterHeas(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;

        }
        else{
            // head.next=newNode;
            newNode.next = head.next;
            head.next = newNode;

        }
    }
    public void AddIndex(int data, int index) {
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int idx=0;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(idx<index-1){
            temp=temp.next;
            idx++;
        }
        
        newNode.next=temp.next;
            temp.next=newNode;



    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        if (head == null) {
            tail = null; // If the list becomes empty
        }
    }
    public void deleteLast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }   
        size--;
        if(head.next == null) {
            head = null; // If there's only one node
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next=null;
        tail = temp; // Update tail to the new last node
        
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        tail = head; // Update tail to the current head
     
        while (current != null) {
            Node nextNode = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = nextNode; // Move to next node
        }
        head = prev; // Update head to the new first node
    }

    public void printList() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Intro list = new Intro();
        list.printList();
        list.addFirst(20);
        list.printList();
        list.addLast(30);
        list.printList();
        list.addFirst(40);
        list.printList();
        list.addAfterHeas(50);
        list.printList();
        list.AddIndex(60, 1);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();  
        list.reverse();
        list.printList(); 
        System.out.println("Size of the list: " + size);
    }
}