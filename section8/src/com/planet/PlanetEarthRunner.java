package com.planet;

public class PlanetEarthRunner {

	public static void main(String[] args) {
		PlanetEarth mars = new PlanetEarth();
		PlanetEarth jupiter = new PlanetEarth();
		
		mars.setMovement(100);
		jupiter.setMovement(120);
		
		mars.setMovement(50);
		jupiter.setMovement(60);

	}

}
