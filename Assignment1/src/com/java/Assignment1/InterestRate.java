package com.java.Assignment1;

import java.util.Scanner;

public class InterestRate {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deposit Amount  : ");
		
		int amount = sc.nextInt();
System.out.println("Enter the Interest rate  : ");
		
		int rate = sc.nextInt();
		

		int Amount = amount*(rate/100);
		
		System.out.println("total 1 year deposit interest amount "+ Amount);
		
		
	}
}
