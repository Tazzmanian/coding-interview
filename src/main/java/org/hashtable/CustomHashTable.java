package org.hashtable;

public class CustomHashTable<K, V> {

    private static final int SIZE = 121;
    private Entry[] entries = new Entry[SIZE];



    private static class Entry<K,V>  {
        K key;
        V value;
        Entry<K,V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashTheKey(K key) {
        int product = 1;
        for (char c : ((String)key).toCharArray()) {
            if (c == 'A') {
                product *=1;
            } else if (c == 'B') {
                product *=2;
            } else if (c == 'C') {
                product *=3;
            } else if (c == 'D') {
                product *=4;
            } else if (c == 'E') {
                product *=5;
            }
        }
        return product;
    }

    public void put(K key, V value) {
        int hash = hashTheKey(key);
        Entry newEntry = new Entry(key, value);

        if (entries[hash] == null) {
            entries[hash] = newEntry;
        } else {
            Entry currentEntry = entries[hash];
            while (currentEntry.next != null) {
                currentEntry = currentEntry.next;
            }
            currentEntry.next = newEntry;
        }
    }

    public V get(K key) {
        int hash = hashTheKey(key);
        if (entries[hash] != null) {
            Entry currentEntry = entries[hash];
            while (currentEntry != null) {
                if (currentEntry.key.equals(key)) {
                    return (V)currentEntry.value;
                }
                currentEntry = currentEntry.next;
            }

        }
        return null;
    }
}
