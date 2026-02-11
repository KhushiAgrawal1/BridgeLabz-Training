package com.FeedbackGuru;

public class Feedback<T> {
    private T type;
    private String message;
    private int rating;

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }

    public T getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public int getRating() {
        return rating;
    }
}
