package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList {
	
	private Node head;
	
	public void insert(int data) {
		// new node
		Node newNode = new Node(data);
		// if no node, create new node
		// if a node, create next node
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void delete(int data) {
		//if no node, return null
		//if data matches, delete node, and make
		//next node head node
		if (head == null) {
			return;
		}
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null && current.next.data != data) {
			current = current.next;
		}
		
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
	
	public Iterator<Integer> iterator() {
		return new LinkedListIterator();
	}
	
	@Override
	public String toString() {
		StringBuilder testString = new StringBuilder();
		Node current = head;
		while(current != null) {
			testString.append(current.data).append(" ");
			current = current.next;
		}
		return testString.toString();
	}
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//This has to be an inner class so it can access the data in CustomLinkedList
	//Extending did not work. 
	public class LinkedListIterator implements Iterator<Integer> {

		private Node current = head;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			int data = current.data;
			current = current.next;
			return data;
		}
	}
}
