package com.java.Assignment1;

import java.util.Scanner;

public class StudentPassOrFail {
  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		
		int marks  = sc.nextInt();
		
		if (marks >= 40) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
