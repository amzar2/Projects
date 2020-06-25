package com.Class.Array;

public class Array {
	
	private int number;

	public Array(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
	@Override
	public String toString() {
		return "Array [number=" + number + ", getNumber()=" + getNumber() + "]";
	}

	

}
