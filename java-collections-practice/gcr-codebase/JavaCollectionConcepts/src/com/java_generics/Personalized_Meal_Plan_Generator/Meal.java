package com.java_generics.Personalized_Meal_Plan_Generator;

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType() +
                " | Calories: " + mealPlan.getCalories());
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
