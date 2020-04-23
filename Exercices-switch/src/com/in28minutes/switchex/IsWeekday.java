package com.in28minutes.switchex;

public class IsWeekday {

	public static void main(String[] args) {
		System.out.println(isWeekday(8));

	}
	
	public static boolean isWeekday(int d) {
		if( d >= 0 && d <= 6)
			return true;
		return false;
		
	}

}
