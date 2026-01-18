package com.java_generics.Personalized_Meal_Plan_Generator;

class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getCalories() {
        return 2200;
    }
}

