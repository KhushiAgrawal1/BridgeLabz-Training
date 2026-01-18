package com.java_generics.Personalized_Meal_Plan_Generator;

public class MealPlanSystem {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealUtility.generateMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealUtility.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealUtility.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealUtility.generateMealPlan(new HighProteinMeal());

        System.out.println("\n---- Personalized Meal Plans ----");
        vegMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        proteinMeal.displayMeal();
    }
}

