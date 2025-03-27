package com.mealPlanGenerator;

//High-protein meal implementation
public class HighProteinMeal implements MealPlan {
 private String mealName;
 private int calories;

 public HighProteinMeal(String mealName, int calories) {
     this.mealName = mealName;
     this.calories = calories;
 }

 @Override
 public String getMealName() {
     return mealName;
 }

 @Override
 public int getCalories() {
     return calories;
 }

 @Override
 public String toString() {
     return mealName + " [High-Protein, " + calories + " kcal]";
 }
}

