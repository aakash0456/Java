package com.ifelse.classStudy;

import java.util.Scanner;

public class EvenOrOdd {

	
	public static void main(String[] args) {
		
		EvenOrOdd c = new EvenOrOdd();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("False");
		}
		
	}
}
