package bag;

import java.util.ArrayList;
import java.util.Iterator;

class Bag<T> implements Iterable<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
    	Iterator<T> one = items.iterator();
    	while(one.hasNext()) {
    		if(one.next().equals(item)) {
    			one.remove();
    			return;
    		}
    	}
    }
//    public boolean contains(T item) {
//        for(T currentItem : items) {
//        	if (currentItem.equals(item)) {
//        		return true;
//        	}
//        }
//		return false;
//    }
    
    public boolean contains(T item) {
    	Iterator<T> contain = items.iterator();
    	while(contain.hasNext()) {
    		if(contain.next().equals(item)) {
    			return true;
    		}
    	}
    	return false;
    }
    
//    public int count(T item) {
//    	int count = 0;
//    	for (T currentItem : items) {
//    		if (currentItem.equals(item)) {
//    			count++;
//    		}
//    	}
//    	return count;
//    }
    
    public int count(T item) {
    	int count = 0;
    	Iterator<T> counter = items.iterator();
    	while(counter.hasNext()) {
    		if(counter.next().equals(item)) {
    			count++;
    		}
    	}
    	return count;
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}