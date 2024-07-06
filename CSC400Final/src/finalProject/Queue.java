package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	List<Person> queue;
	
	public Queue() {
		this.queue = new ArrayList<>();
	}
	
	public void enqueue(Person person) {
		queue.add(person);
	}
	
	public void display() {
		for (Person person : queue) {
			System.out.println(person);
		}
	}
	
	
	
}
