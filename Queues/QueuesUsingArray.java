class QueuesUsingArray {
    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return rear == size - 1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                rear++;
                arr[rear] = data;
            }
        }

        // Remove an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        @Override
        public String toString() {
            if (isEmpty()) return "[]";
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i <= rear; i++) {
                sb.append(arr[i]);
                if (i < rear) sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println(q.remove()); // 10
        System.out.println(q.remove()); // 20
        System.out.println(q.remove()); // 30
        System.out.println(q.remove()); // Queue is empty
    }
}