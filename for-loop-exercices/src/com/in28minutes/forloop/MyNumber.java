package com.in28minutes.forloop;

public class MyNumber {
	
	private int i;

	public MyNumber(int i) {
		this.i = i;
	}
	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}



	public boolean isPrime(int i) {
		if( i >= 1 && i<= 9 && (i%2 != 0) && (i%3 !=0))
			return true;
		return false;
	}

}
