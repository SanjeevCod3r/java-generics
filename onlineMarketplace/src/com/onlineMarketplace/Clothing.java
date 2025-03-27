package com.onlineMarketplace;

//Clothing class extending Product with ClothingCategory
public class Clothing extends Product<ClothingCategory> {
 public Clothing(String name, double price, ClothingCategory category) {
     super(name, price, category);
 }
}
