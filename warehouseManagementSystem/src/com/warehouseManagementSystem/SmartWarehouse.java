package com.warehouseManagementSystem;

public class SmartWarehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Storage<Electronics> electronicsStorage = new Storage<>();
	        electronicsStorage.addItem(new Electronics("Laptop", 1200.00));
	        electronicsStorage.addItem(new Electronics("Smartphone", 800.00));

	        Storage<Groceries> groceriesStorage = new Storage<>();
	        groceriesStorage.addItem(new Groceries("Milk", 2.50));
	        groceriesStorage.addItem(new Groceries("Apple", 1.20));

	        Storage<Furniture> furnitureStorage = new Storage<>();
	        furnitureStorage.addItem(new Furniture("Chair", 50.00));
	        furnitureStorage.addItem(new Furniture("Table", 150.00));

	        // Displaying items using wildcard method
	        System.out.println("Electronics:");
	        WarehouseUtil.displayItems(electronicsStorage.getItems());

	        System.out.println("\nGroceries:");
	        WarehouseUtil.displayItems(groceriesStorage.getItems());

	        System.out.println("\nFurniture:");
	        WarehouseUtil.displayItems(furnitureStorage.getItems());
	}

}
