package com.controlStatement.assignment6.Q3;

import java.util.Scanner;

public class PinCheck {
	
void validate() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the pin.");
		int pin  = sc.nextInt();
		
		int predefinedPin = 0000;
		
		if(pin != predefinedPin) {
			System.out.println("Cant accept it.");
		}else {
			System.out.println("Correct Pin");
		}
		
		
	}

}
