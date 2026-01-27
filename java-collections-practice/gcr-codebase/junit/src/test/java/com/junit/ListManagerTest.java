package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListManagerTest {

    ListManager listManager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // ✅ Test adding elements
    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, listManager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    // ✅ Test removing existing element
    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);

        boolean removed = listManager.removeElement(list, 10);

        assertTrue(removed);
        assertEquals(1, listManager.getSize(list));
        assertFalse(list.contains(10));
    }

    // ✅ Test removing non-existing element
    @Test
    void testRemoveElementNotPresent() {
        list.add(10);

        boolean removed = listManager.removeElement(list, 20);

        assertFalse(removed);
        assertEquals(1, listManager.getSize(list));
    }

    // ✅ Test list size
    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 5);
        assertEquals(1, listManager.getSize(list));
    }
}

