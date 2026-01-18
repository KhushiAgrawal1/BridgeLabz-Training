package com.java_generics.AI_Driven_Resume_Screening_System;

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating leadership and product strategy skills");
    }
}
