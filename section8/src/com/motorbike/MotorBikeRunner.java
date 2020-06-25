package com.motorbike;

public class MotorBikeRunner {
	
	public static void main (String[] args) {

	MotorBike honda = new MotorBike();
			
		MotorBike ducati= new MotorBike();
		
		ducati.start();
		honda.start();
	
		ducati.setSpeed(100);
		honda.setSpeed(80);
		
		int ducatiSpeed = ducati.getspeed();
		ducatiSpeed = ducatiSpeed + 100;
		ducati.setSpeed(ducatiSpeed);		
		System.out.println(ducati.getspeed());
		
		ducati.setSpeed(20);
		honda.setSpeed(0);
		
		
	}
	
}
