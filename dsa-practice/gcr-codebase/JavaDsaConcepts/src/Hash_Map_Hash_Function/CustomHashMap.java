package Hash_Map_Hash_Function;

import java.util.LinkedList;

public class CustomHashMap {

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity = 10;

    public CustomHashMap() {
        table = new LinkedList[capacity];
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, int value) {
        int index = hash(key);

        if (table[index] == null)
            table[index] = new LinkedList<>();

        for (Entry e : table[index]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public Integer get(int key) {
        int index = hash(key);

        if (table[index] == null)
            return null;

        for (Entry e : table[index]) {
            if (e.key == key)
                return e.value;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);

        if (table[index] == null)
            return;

        table[index].removeIf(e -> e.key == key);
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(11, 200); // collision
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}

