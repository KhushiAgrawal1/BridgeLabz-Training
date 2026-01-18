package com.java_generics.Personalized_Meal_Plan_Generator;

class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return 1600;
    }
}
