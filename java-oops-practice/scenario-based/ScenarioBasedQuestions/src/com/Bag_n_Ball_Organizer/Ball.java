package Bag_n_Ball_Organizer;

class Ball {
    private int id;
    private String color;
    private String size;

    Ball(int id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Ball ID: " + id + ", Color: " + color + ", Size: " + size;
    }
}

