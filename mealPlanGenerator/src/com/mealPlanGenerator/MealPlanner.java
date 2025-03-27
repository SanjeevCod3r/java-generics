package com.mealPlanGenerator;

import java.util.List;

//Utility class for meal plan generation
public class MealPlanner {
 public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
     System.out.println("Generating meal plan...");
     for (T meal : meals) {
         System.out.println(meal);
     }
 }
}

