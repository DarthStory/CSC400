package queuePractice;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
    LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    // Enqueue operation
    public void enqueue(int item) {
        queue.addLast(item);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.getFirst();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }
}