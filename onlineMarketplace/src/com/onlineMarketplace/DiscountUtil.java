package com.onlineMarketplace;

//Utility class to apply discounts dynamically
public class DiscountUtil {
 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
     double discountAmount = (product.getPrice() * percentage) / 100;
     product.setPrice(product.getPrice() - discountAmount);
     System.out.println("Discount applied: " + product.getName() + " is now $" + product.getPrice());
 }
}
