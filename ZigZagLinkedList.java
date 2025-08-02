public class ZigZagLinkedList {
    Node head;
    Node tail;
    int size;

    static class Node {
        int data;
        Node next;
        Node(int data) {
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
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addAfterHead(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public void AddIndex(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int idx = 0;
        while (temp != null && idx < index - 1) {
            temp = temp.next;
            idx++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    public void ZigZagmerge() {
        if (head == null || head.next == null) return;
        // Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            if (nextL == null) break;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
        // Update tail
        tail = head;
        while (tail.next != null) tail = tail.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZagLinkedList list = new ZigZagLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addAfterHead(15);
        list.AddIndex(25, 2);
        System.out.println("Original List:");
        list.printList();
        list.ZigZagmerge();
        System.out.println("ZigZag Merged List:");
        list.printList();
    }
}