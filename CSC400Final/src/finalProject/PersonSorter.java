package finalProject;

import java.util.Scanner;

public class PersonSorter {

	public static void main(String[] args) {
		
		/*
		 *Needed to prompt user for input, and put it in the queue.  
		 */
		Scanner scnr = new Scanner(System.in);
		Queue queue = new Queue();

		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the First name: ");
			String firstName = scnr.nextLine();
			System.out.println("Enter the Last name: ");
			String lastName = scnr.nextLine();
			System.out.println("Enter in the age: ");
			int age = Integer.parseInt(scnr.nextLine());
			Person person = new Person(firstName, lastName, age);
			queue.enqueue(person);
		}
		
		System.out.println("\nQueue before sorting: ");
		queue.display();
		
		queue.lastNameDescending();
		System.out.println("\nQueue after sorting by last name descending: ");
		queue.display();
		
		queue.ageDescending();
		System.out.println("\nQueue after sorting by age descending: ");
		queue.display();
		
		scnr.close();
		
	}

}
