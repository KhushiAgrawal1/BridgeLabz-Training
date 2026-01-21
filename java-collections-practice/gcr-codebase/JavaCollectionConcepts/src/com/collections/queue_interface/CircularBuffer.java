package com.collections.queue_interface;

public class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0;
    int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void insert(int value) {
        buffer[(front + count) % size] = value;

        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size; // overwrite
        }
    }

    void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();
    }
}

