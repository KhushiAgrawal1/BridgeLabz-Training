package com.java_generics.Personalized_Meal_Plan_Generator;

class MealUtility {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        System.out.println("Validating meal plan...");
        System.out.println("Meal plan approved ✔");

        return new Meal<>(mealPlan);
    }
}

