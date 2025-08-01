class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortInLinkedList {

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightMid = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightMid);

        return merge(left, right);
    }

    public Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) temp.next = left;
        if (right != null) temp.next = right;

        return dummy.next;
    }

    // Helper method to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Build custom linked list using Node
        Node head = new Node(4);
        head.next = new Node(1);
        head.next.next = new Node(8);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        MergeSortInLinkedList sorter = new MergeSortInLinkedList();

        System.out.println("Original Linked List:");
        sorter.printList(head);

        head = sorter.mergeSort(head);

        System.out.println("Sorted Linked List:");
        sorter.printList(head);
    }
}
