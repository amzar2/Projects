package com.forloop;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(4);
		
		boolean isPrime = number.isPrime();
		System.out.println("isPrime" + isPrime);
	
	
	int sum = number.sumUptoN();
	System.out.println("sumUptoN"  + sum);
	
	
	
	
	
	int sumOfDivisors = number.sumOfDivisors();
	System.out.println("sumOfDivisors"  +  sumOfDivisors);
	
	
	
	}

}
 