package com.annotations;

import java.util.ArrayList;

public class SuppressWarningsDemo {

    public static void main(String[] args) {
        // Suppress unchecked warnings for raw ArrayList
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList(); // Raw type, normally gives a warning

        // Adding elements (no generics)
        list.add("Apple");
        list.add("Banana");
        list.add(10); // Adding an Integer too

        // Iterating and printing
        for (Object item : list) {
            System.out.println(item);
        }
    }
}

