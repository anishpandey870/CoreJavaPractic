package codePractics.collections.collections;

class Queue {
    Node rear, front;

    public void enqueue(int data) {
        Node n = new Node(data);
        if (front == null) {
            front = rear = n;
        }
        rear.next = n;
        rear = n;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("the queue is empty");
        } else {
            int res = front.data;
            front = front.next;

        }

    }
}

public class QueueMain {
    public static void main(String[] args) {
        Queue my=new Queue();
        my.enqueue(10);
        my.dequeue();
    }

}

