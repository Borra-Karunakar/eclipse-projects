package assignment;

import java.util.*;

public class Repository<T, ID> {
    private Map<ID, T> store = new HashMap<>();

    public void save(ID id, T entity) {
        store.put(id, entity);
    }

    public T findById(ID id) {
        return store.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(store.values());
    }

    public void deleteById(ID id) {
        store.remove(id);
    }
}
