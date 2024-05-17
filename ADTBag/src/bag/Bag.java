package bag;

import java.util.ArrayList;
import java.util.Iterator;

class Bag<object> implements Iterable<object> {
    private ArrayList<object> items = new ArrayList<>();

    public void add(object item) {
        items.add(item);
    }

    public void remove(object item) {
    	items.remove(item);
    }
    public boolean contanins() {
        return items.contains(items);
    }

    public int size() {
        return items.size();
    }
    
    public void clear() {
    	items.clear();
    }

    @Override
    public Iterator<object> iterator() {
        return items.iterator();
    }
}