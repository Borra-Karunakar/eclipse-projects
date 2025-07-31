package assignment;

import java.util.ArrayList;

public class GenericLibrary<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T retrieve(int index) {
        return items.get(index);
    }
}
