package com.warehouseManagementSystem;

import java.util.List;

//Utility class with a wildcard method
public class WarehouseUtil {
 public static void displayItems(List<? extends WarehouseItem> items) {
     for (WarehouseItem item : items) {
         System.out.println(item);
     }
 }
}
