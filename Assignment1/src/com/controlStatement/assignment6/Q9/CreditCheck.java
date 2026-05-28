package com.controlStatement.assignment6.Q9;

import java.util.Scanner;

public class CreditCheck {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your credit limit: ");
        double creditLimit = scanner.nextDouble();

 
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

      
        if (purchaseAmount <= creditLimit) {
            System.out.println("Success: Transaction Approved!");
            double remainingCredit = creditLimit - purchaseAmount;
            System.out.println("Remaining Credit Limit: " + remainingCredit);
        } else {
            System.out.println("Declined: Transaction exceeds credit limit!");
            System.out.println("Available Credit: " + creditLimit);
        }

        scanner.close();
    }
}
