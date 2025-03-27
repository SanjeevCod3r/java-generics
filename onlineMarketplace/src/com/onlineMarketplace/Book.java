package com.onlineMarketplace;

//Book class extending Product with BookCategory
public class Book extends Product<BookCategory> {
 public Book(String name, double price, BookCategory category) {
     super(name, price, category);
 }
}

