package com.in28minutes.oops;

public class MotorBike {
	//state
	private int speed; //member var
	
	MotorBike( int speed){
		this.speed = speed;
	}
		
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(this.speed>0)
		this.speed = speed;
	}
	
	void increaseSpeed(int howmuch ) {
		//this.speed = this.speed + howmuch;
		setSpeed(this.speed + howmuch);
	}
	
	void decreaseSpeed(int howmuch ) {
		//if(this.speed - howmuch > 0)
		//this.speed = this.speed - howmuch;
		setSpeed(this.speed - howmuch);
	}
	
	void start() {
		System.out.println("Bike Started");
	}

		
	
}
