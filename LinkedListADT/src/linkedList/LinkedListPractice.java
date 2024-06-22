package linkedList;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//Treated as a stack
		//Adds to the top, pushes down, takes from the top
		//[A], [B, A], [C, B, A], [D, C, B, A], [F, D, C, B, A]
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
//		linkedList.pop(); //takes from the top
		
		
		System.out.println(linkedList);
		linkedList.add(4, "E");
		System.out.println(linkedList);
		linkedList.remove("E");
		System.out.println(linkedList);
		
		System.out.println(linkedList.indexOf("F"));
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		System.out.println(linkedList);
		
		String first = linkedList.removeFirst();
		System.out.println(linkedList);
		String last = linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.clear();
		System.out.println("\n\n");
		
		
		//Treated as a Queue
		//Adds to the top, pushes down, takes form the bottom
		//[A], [A, B], [A, B, C], [A, B, C, D], [A, B, C, D, F]
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
//		linkedList.poll(); //takes from the top
		
		System.out.println(linkedList);
		linkedList.add(4, "E");
		System.out.println(linkedList);
		linkedList.remove("E");
		System.out.println(linkedList);
		
		System.out.println(linkedList.indexOf("F"));
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		System.out.println(linkedList);
		
		String first1 = linkedList.removeFirst();
		System.out.println(linkedList);
		String last1 = linkedList.removeLast();
		System.out.println(linkedList);
		
	}

}
