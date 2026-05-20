package com.java.Assignment1;

import java.util.Scanner;

public class CurrencyConversion {

	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rupee value : ");
		
		int rupee = sc.nextInt();
		
		int one_usd = 95;
		
		
		
		int totalAmount = rupee*one_usd;
		
		System.out.println("total amount "+ totalAmount);
		
		
	}

}
