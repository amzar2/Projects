package com.section9;

import java.math.BigDecimal;

public class simpleInterestCalculator {

	BigDecimal principal;

	BigDecimal interest;

	public simpleInterestCalculator(String principal, String interest) {

		this.principal = new BigDecimal(principal);

		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalvalue(int noOfYears) {
		// total value = principal + principal* no of years
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.multiply(interest)).multiply(noOfYearsBigDecimal);
		return totalValue;
	}

}
