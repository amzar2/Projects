package com.section9;

import java.math.BigDecimal;

public class calculateRunner {

	public static void main(String[] args) {

		simpleInterestCalculator calculator = new simpleInterestCalculator("4500.00", " 7.5");
		BigDecimal totalValue = calculator.calculateTotalvalue(5);
		System.out.println(totalValue);

	}

}
