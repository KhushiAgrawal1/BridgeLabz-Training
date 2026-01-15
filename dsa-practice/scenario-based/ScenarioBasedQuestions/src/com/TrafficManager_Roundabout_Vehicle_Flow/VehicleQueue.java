package com.TrafficManager_Roundabout_Vehicle_Flow;

public class VehicleQueue {
    private int front, rear, size, capacity;
    private int[] queue;

    public VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int vehicleId) {
        if (isFull()) {
            System.out.println("Queue Overflow! Vehicle " + vehicleId + " cannot enter.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicleId;
        size++;
        System.out.println("Vehicle " + vehicleId + " added to waiting queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return -1;
        }
        int vehicleId = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicleId;
    }
}
