package com.java_generics.Personalized_Meal_Plan_Generator;

class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 1800;
    }
}

