package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	
	/*
	 * We had the quick sort before and I was able to copy paste. This is one of the
	 * things I like about sorting algorithms and what seems to be coding in general.
	 * If used/written correctly, a lot can be "copy/pasted" from one program to another.
	 * However, I had the algorithm for Ascending order.. I actually got lucky and swapped the 
	 * ">" with "<". It makes sense because you are putting it back in a certain order because
	 * one is greater than the other. It would make sense that comparing if it is lesser would take
	 * it an put it in the reverse. 
	 */

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
            if (comparator.compare(list.get(j), pivot) <= 0) {
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
    	// compareTo as you are comparing strings
    	// using the queue, start at 0 then progress through the size -1, being you start at 0 not 1
    	// then compareTo p2 to p1, quickSort
    	quickSort(queue, 0, queue.size() -1, (p1, p2) -> p2.getLastName().compareTo(p1.getLastName()));
    }
	
    public void ageDescending() {
    	// You have to use the full name of Integer, and compare not compareTo, more
    	//simple to compare Integers
    	quickSort(queue, 0, queue.size() -1, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
    }
    
}
