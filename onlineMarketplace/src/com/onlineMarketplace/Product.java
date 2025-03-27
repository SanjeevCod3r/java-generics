package com.onlineMarketplace;

//Generic class Product<T> where T represents the category
public class Product<T> {
 private String name;
 private double price;
 private T category;  // Category type (BookCategory, ClothingCategory, etc.)

 public Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public T getCategory() {
     return category;
 }

 @Override
 public String toString() {
     return name + " [" + category + "] - $" + price;
 }
}

