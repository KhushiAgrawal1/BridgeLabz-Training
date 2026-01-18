package com.java_generics.Personalized_Meal_Plan_Generator;

class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return 2000;
    }
}

