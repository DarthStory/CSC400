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
    public boolean contains(T item) {
        return items.contains(item);
    }

    public int size() {
        return items.size();
    }
    
    public void clear() {
    	items.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}