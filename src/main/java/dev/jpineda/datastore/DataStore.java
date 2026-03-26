package dev.jpineda.datastore;

import java.util.*;

public class DataStore<K, T> {
    private final List<T> dataList;
    private final Map<K, T> dataMap;

    public DataStore() {
        this.dataList = new ArrayList<>();
        this.dataMap = new HashMap<>();
    }

    public boolean add(K key, T value) {
        Objects.requireNonNull(key, "Key cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");

        if (dataMap.containsKey(key)) {
            return false;
        }
        dataList.add(value);
        dataMap.put(key, value);
        return true;
    }

    public T remove(K key) {
        Objects.requireNonNull(key, "Key cannot be null");
        T item = dataMap.remove(key);
        if (item != null) {
            dataList.remove(item);
        }
        return item;
    }

    public T find(K key) {
        Objects.requireNonNull(key, "Key cannot be null");
        return dataMap.get(key);
    }

    public List<T> getAll() {
        return Collections.unmodifiableList(dataList);
    }
}
