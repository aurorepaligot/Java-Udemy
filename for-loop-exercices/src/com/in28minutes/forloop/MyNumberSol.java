package com.in28minutes.forloop;

public class MyNumberSol {

	private int number; 
	
	
	public MyNumberSol(int number) {
		this.number = number;
		
	}

	public boolean isPrimeSol() {
		
		if (number < 2) {
		return false;
		}
		
		for(int i = 2; i<=number-1; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
		
	
	}

}
