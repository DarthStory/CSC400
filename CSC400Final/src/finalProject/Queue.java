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
	
	public static void quickSort(List<Person> list, int left, int right,
			java.util.Comparator<Person> comparator) {
        if (left < right) {
            int pivotIndex = partition(list, left, right, comparator);

            quickSort(list, left, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, right, comparator);
        }
    }

    public static int partition(List<Person> list, int left, int right,
    		java.util.Comparator<Person> comparator) {
        Person pivot = list.get(right);
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (comparator.compare(list.get(j), pivot) > 0) {
                i++;
                Person temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        Person temp = list.get(i + 1);
        list.set(i + 1, list.get(right));
        list.set(right,  temp);
        return i + 1;
    }
    
    public void lastNameDescending() {
    	quickSort(queue, 0, queue.size() -1, (p1, p2) -> p2.lastName.compareTo(p1.lastName));
    }
	
    public void 
    
}
