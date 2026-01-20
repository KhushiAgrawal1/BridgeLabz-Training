package Bag_n_Ball_Organizer;

import java.util.*;

class Bag {
    private int bagId;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls = new ArrayList<>();

    Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
    }

    void addBall(Ball b) {
        if (balls.size() < capacity) {
            balls.add(b);
            System.out.println("Ball added successfully.");
        } else {
            System.out.println("Bag is full!");
        }
    }

    void removeBall() {
        if (!balls.isEmpty()) {
            balls.remove(balls.size() - 1);
            System.out.println("Ball removed.");
        } else {
            System.out.println("Bag is empty.");
        }
    }

    void displayBalls() {
        System.out.println("Balls in Bag " + bagId + ":");
        for (Ball b : balls)
            System.out.println(b);
    }

    void displayBagInfo() {
        System.out.println("Bag ID: " + bagId +
                ", Color: " + color +
                ", Ball Count: " + balls.size());
    }
}

