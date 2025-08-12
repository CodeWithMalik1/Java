public class CircleQueue {
    static class Queue {
        int[] arr;
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1; // Queue becomes empty
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.print(); // 10 20 30 40

        q.remove();
        q.remove();
        q.print(); // 30 40

        q.add(50);
        q.add(60);
        q.print(); // 30 40 50 60

        q.add(70); // Queue is full
    }
}
