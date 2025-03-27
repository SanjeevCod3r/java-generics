package com.onlineMarketplace;

//Gadget class extending Product with GadgetCategory
public class Gadget extends Product<GadgetCategory> {
 public Gadget(String name, double price, GadgetCategory category) {
     super(name, price, category);
 }
}

