package com.objectorientedprogramming;

public class FanRunner {

	public static void main(String[] args) {
		
      Fan fan = new Fan("Manufacturer 1",0.3456, "GREEN");
      
      
      fan.switchOn();
     fan.setspeed((byte)5);
      System.out.println(fan);

      fan.switchOff();
   
      System.out.println(fan);
      
      
	}

}
