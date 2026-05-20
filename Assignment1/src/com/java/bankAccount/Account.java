package com.java.bankAccount;

import java.util.Scanner;

public class Account {
    int accountNo;
    String Name;
    int balance;
    
    
    
    void displayAccountNo() {
    	System.out.println("AccountNo :" +accountNo);
    }
    void displayName() {
    	System.out.println("Name :" +Name);
    }
    void displayBalance() {
    	System.out.println("AccountNo :" +balance);
    }
    
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Account ac = new Account();

    	
    	System.out.println("Enter the Account No : ");
    	 ac.accountNo = sc.nextInt();
    	 sc.nextLine(); 
    	 System.out.println("Enter the Name : ");
    	 ac.Name = sc.nextLine();
    	 
    	 System.out.println("Enter the Balance : ");
    	 ac.balance = sc.nextInt();

    	 
    	 
    	 
    	
    	
		ac.displayAccountNo();
		ac.displayBalance();
		ac.displayName();
	}
}
