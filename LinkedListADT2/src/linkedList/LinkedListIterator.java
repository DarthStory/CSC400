package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.w3c.dom.Node;

public class LinkedListIterator implements Iterator<Integer> {

	private Node current = head;
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
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
