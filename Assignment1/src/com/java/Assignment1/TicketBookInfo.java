package com.java.Assignment1;

import java.util.Scanner;

public class TicketBookInfo {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of tickets : ");
		
		int ticketNo = sc.nextInt();
		System.out.println("Enter the ticket Price : ");
		
		int price = sc.nextInt();
		
		int totalAmount = ticketNo*price;
		
		System.out.println("total amount "+ totalAmount);
		
		
	}

}
