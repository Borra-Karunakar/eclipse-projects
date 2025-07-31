package assignment;

import java.util.ArrayList;

public class NonGenericLibrary {
    private ArrayList items = new ArrayList(); // raw type

    public void add(Object item) {
        items.add(item);
    }

    public Object retrieve(int index) {
        return items.get(index);
    }
}
