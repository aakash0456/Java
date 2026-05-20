package com.java.Assignment1;

import java.util.Scanner;

public class TicketInfo {
	
	 String trainName;
	    String Name;
	    int seatNo;
	    
	    
	    
	    void displayTrainName() {
	    	System.out.println("Train Name :" +trainName);
	    }
	    void displayName() {
	    	System.out.println("Name :" +Name);
	    }
	    void displaySeatNo() {
	    	System.out.println("Seat No :" +seatNo);
	    }
	    
	    
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	TicketInfo ac = new TicketInfo();

	    	
	    	System.out.println("Enter the train Name : ");
	    	 ac.trainName = sc.nextLine();
	    	 
	    	 sc.nextLine(); 
	    	 System.out.println("Enter the Name : ");
	    	 ac.Name = sc.nextLine();
	    	 
	    	 System.out.println("Enter the Balance : ");
	    	 ac.seatNo = sc.nextInt();
	    	
			ac.displayTrainName();
			ac.displaySeatNo();
			ac.displayName();
		}

}
