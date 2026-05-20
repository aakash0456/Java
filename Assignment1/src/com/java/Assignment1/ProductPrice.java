package com.java.Assignment1;

import java.util.Scanner;

public class ProductPrice {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name : ");
		
		String name = sc.nextLine();
		
		sc.nextLine();
System.out.println("Enter the price : ");
		
		int price = sc.nextInt();
		
System.out.println("Enter the quantity : ");
		
		int quantity = sc.nextInt();
		int totalAmount = price*quantity;
		
		System.out.println("total amount "+ totalAmount);
		
		
	}

}
