package com.in28minutes.switchex;

public class WeekDay {

	public static void main(String[] args) {
	isWeekDay();

	}
	
	public static void isWeekDay() {
		
		int d = 7;
		
		switch (d) {
		
		case 0 : System.out.println(d + " is Sunday"); break;
		case 1 : System.out.println(d + " is Monday"); break;
		case 2 : System.out.println(d + " is Tuesday"); break;
		case 3 : System.out.println(d + " is Wednesday"); break;
		default : System.out.println("invalid"); break;
		}
		
	}

}
