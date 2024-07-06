package queuePractice;

public class MainQueue {

	public static void main(String[] args) {
		Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Initial Queue: " + q.queue);
        System.out.println("Dequeued Element: " + q.dequeue());
        System.out.println("Queue after Dequeue: " + q.queue);
        System.out.println("Front Element: " + q.peek());
        System.out.println("Queue Size: " + q.size());

	}

}
