import java.util.*;

public class MyMap<K, V> implements Map<K, V> {
    private int size;
    LinkedList<Entry<K, V>>[] entries = new LinkedList[10];

    private class Entry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;

            return key.equals(entry.key);
        }

        @Override
        public int hashCode() {
            int result = key != null ? key.hashCode() : 0;
            return result;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (LinkedList<Entry<K, V>> o : entries) {
            if (o != null) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean containsKey(Object key) {
        return (get(key) == null) ? false : true;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkedList<Entry<K, V>> o : entries) {
            if (o != null) {
                for (Entry<K, V> p : o) {
                    if (p.getValue().equals(value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int hash = Math.abs(key.hashCode()) % 7;
        if (entries[hash] == null) return null;
        LinkedList<Entry<K, V>> temp = entries[hash];
        for (Entry<K, V> o : temp) {
            if (o.getKey() == key) {
                return o.getValue();
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry<K, V> temp = new Entry<>(key, value);
        int hash = Math.abs(key.hashCode()) % 7;
        if (entries[hash] == null) {
            LinkedList<Entry<K, V>> addition = new LinkedList<>();
            addition.add(temp);
            entries[hash] = addition;
            size++;
        } else {
            if (!entries[hash].contains(temp)) {
                entries[hash].add(temp);
                size++;
            }
        }
        return value;
    }

    @Override
    public V remove(Object key) {
        if (this.containsKey(key)) {
            int hash = Math.abs(key.hashCode()) % 7;
            Entry<K, V> toRemove = new Entry<>((K) key, this.get(key));
            entries[hash].remove(toRemove);
            return this.get(key);
        } else {
            return null;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        entries = new LinkedList[10];
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> val = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < entries[i].size(); j++) {
                val.add(entries[i].get(j).getKey());
            }
        }
        return val;
    }

    @Override
    public Collection<V> values() {
        Collection<V> val = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < entries[i].size(); j++) {
                val.add(entries[i].get(j).getValue());
            }
        }
        return val;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new TreeSet<>();
        for (LinkedList<Entry<K, V>> o : this.entries) {
            set.addAll(o);
        }
        return set;
    }
}
