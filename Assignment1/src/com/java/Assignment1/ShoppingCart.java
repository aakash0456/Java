package com.java.Assignment1;

import java.util.Scanner;

public class ShoppingCart {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st item : ");
		
		int item1 = sc.nextInt();
System.out.println("Enter the 2nd item : ");
		
		int item2 = sc.nextInt();
		
System.out.println("Enter the 3rd item : ");
		
		int item3 = sc.nextInt();
		int totalAmount = item1+item2+item3;
		
		System.out.println("total amount "+ totalAmount);
		
		
	}

}
