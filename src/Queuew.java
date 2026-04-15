public class Queuew {
    int size = 5;
    int[] item = new int[size];
    int front, rear;

    Queuew() {
        front = 0;
        rear = -1;
    }

    void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        item[rear] = val;
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        front++;
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(item[i]);
            }
        }
    }
}
