package com.mealPlanGenerator;

//Keto meal implementation
public class KetoMeal implements MealPlan {
 private String mealName;
 private int calories;

 public KetoMeal(String mealName, int calories) {
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
     return mealName + " [Keto, " + calories + " kcal]";
 }
}
