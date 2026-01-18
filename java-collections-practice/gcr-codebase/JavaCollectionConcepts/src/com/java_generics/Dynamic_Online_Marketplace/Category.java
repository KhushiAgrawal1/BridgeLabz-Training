package com.java_generics.Dynamic_Online_Marketplace;

abstract class Category {
    protected String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

