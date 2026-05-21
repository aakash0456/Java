package com.inheritance.assignment2.Q5;

public class ElectronicProduct extends Product{
  int warrentyPeriod= 2;
  String brandName = "Zara";
  
  void displayInfo() {
	  System.out.println("Product Name "+name);
	  System.out.println("Product Price "+price);
	  System.out.println("Product warrenty Period "+warrentyPeriod);
	  System.out.println("Product Brand Name "+brandName);
  }
}
