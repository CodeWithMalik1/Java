class DoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

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



// Adding a new node at the end of the list
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null ){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
        size++;


    }


//deleting the first node of the list
    public void deleteFirst(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
//deleting the last node of the list
public void deletelast(){
    if(head==tail){
        head=null;
        tail=null;
        return;
        
    }
    tail=tail.prev;
    tail.next=null;
    size--;
}



//printing the list
    public void print(){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
     


    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(23);
        dll.addFirst(45);
        dll.addFirst(67);
        dll.addLast(89);
        dll.addLast(12);
        dll.addLast(34);
        System.out.println("\nBefore  deleting nodes:");
        dll.print();
        // dll.size();
        // System.out.println("\nSize of the list: " + size);
        dll.deleteFirst();
        System.out.println("\nAfter deleting the first node:");
        dll.print();
        dll.deletelast();
        System.out.println("\nAfter deleting the last node:");
        dll.print();
        
    }
}