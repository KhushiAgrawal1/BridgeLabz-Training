package com.junit;

import java.util.List;

public class ListManager {

    // Add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Remove an element from the list
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }

    // Get size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}

