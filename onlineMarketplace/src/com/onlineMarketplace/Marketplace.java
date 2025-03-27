package com.onlineMarketplace;

public class Marketplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating product catalog for books, clothing, and gadgets
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(new Book("The Hobbit", 20.00, BookCategory.FICTION));
        bookCatalog.addProduct(new Book("Brief History of Time", 25.00, BookCategory.SCIENCE));

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 15.00, ClothingCategory.MEN));
        clothingCatalog.addProduct(new Clothing("Dress", 40.00, ClothingCategory.WOMEN));

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 800.00, GadgetCategory.SMARTPHONE));
        gadgetCatalog.addProduct(new Gadget("Laptop", 1200.00, GadgetCategory.LAPTOP));

        // Apply discounts dynamically
        System.out.println("\nApplying discounts...");
        DiscountUtil.applyDiscount(bookCatalog.getProducts().get(0), 10);  // 10% discount on first book
        DiscountUtil.applyDiscount(clothingCatalog.getProducts().get(1), 15); // 15% discount on Dress
        DiscountUtil.applyDiscount(gadgetCatalog.getProducts().get(0), 5);  // 5% discount on Smartphone

        // Display updated catalog
        System.out.println("\nUpdated Catalog:");
        System.out.println("Books:");
        for (Book book : bookCatalog.getProducts()) {
            System.out.println(book);
        }

        System.out.println("\nClothing:");
        for (Clothing clothing : clothingCatalog.getProducts()) {
            System.out.println(clothing);
        }

        System.out.println("\nGadgets:");
        for (Gadget gadget : gadgetCatalog.getProducts()) {
            System.out.println(gadget);
        }


	}

}
