package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(50);
		MotorBike honda = new MotorBike(0);
		
		System.out.println(ducati.getSpeed());

		honda.start();
		ducati.start();
		
		ducati.setSpeed(100);
		//System.out.println(ducati.getSpeed());
		
		//honda.setSpeed(80);
		//System.out.println(honda.getSpeed());
		
		//ducati.setSpeed(20);
		//System.out.println(ducati.getSpeed());
		
		//honda.setSpeed(0);
		//System.out.println(honda.getSpeed());
	}

}
