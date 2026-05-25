package com.polymorphism.assignment3.Q3;

public class Test {
 
  public static void main(String[] args) {
	  LoanSystem l = new LoanSystem();
	  l.calculateEMI(10000);
	  l.calculateEMI(10000, 10);
	  l.calculateEMI(10000, 10, 11);
}
}
