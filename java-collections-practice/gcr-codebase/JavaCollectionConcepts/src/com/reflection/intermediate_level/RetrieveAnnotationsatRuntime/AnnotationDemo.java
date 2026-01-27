package com.reflection.intermediate_level.RetrieveAnnotationsatRuntime;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

    public static void main(String[] args) {
        try {
            // Get Class object
            Class<Book> clazz = Book.class;

            // Check if @Author is present
            if (clazz.isAnnotationPresent(Author.class)) {
                // Get the annotation
                Author authorAnnotation = clazz.getAnnotation(Author.class);

                // Display annotation value
                System.out.println("Author: " + authorAnnotation.name());
            } else {
                System.out.println("@Author annotation is not present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
