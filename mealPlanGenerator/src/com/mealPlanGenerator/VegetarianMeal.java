package com.mealPlanGenerator;

//Vegetarian meal implementation
public class VegetarianMeal implements MealPlan {
 private String mealName;
 private int calories;

 public VegetarianMeal(String mealName, int calories) {
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
     return mealName + " [Vegetarian, " + calories + " kcal]";
 }
}
