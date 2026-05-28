package com.controlStatement.assignment6.Q25;

import java.util.Scanner;

public class BillPaymentSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        
        while (choice != 4) {
          
            System.out.println("=== Bill Payment Options ===");
            System.out.println("1. Pay Electricity Bill");
            System.out.println("2. Pay Water Bill");
            System.out.println("3. Pay Internet Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            
            choice = scanner.nextInt();
           
            switch (choice) {
                case 1:
                    System.out.println("Processing your Electricity Bill payment... Success!");
                    break;
                case 2:
                    System.out.println("Processing your Water Bill payment... Success!");
                    break;
                case 3:
                    System.out.println("Processing your Internet Bill payment... Success!");
                    break;
                case 4:
                    System.out.println("Thank you for using the Bill Payment System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 4.");
                    break;
            }
            
        }

        scanner.close();
    }
}
