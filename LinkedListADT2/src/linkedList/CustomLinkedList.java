package linkedList;

import java.util.Iterator;

public class CustomLinkedList {
	
	private Node head;
	
	public Iterator<Integer> iterator() {
		return new LinkedListIterator();
	}
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
