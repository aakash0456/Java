package com.java.Assignment1;

import java.util.Scanner;

public class ClaimAmount {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Insured Amount  : ");
		
		int amount = sc.nextInt();
System.out.println("Enter the claim % : ");
		
		int perc = sc.nextInt();
		

		int claimAmount = amount*(perc/100);
		
		System.out.println("total amount "+ claimAmount);
		
		
	}

}
