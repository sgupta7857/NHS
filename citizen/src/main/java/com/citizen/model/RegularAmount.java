package com.citizen.model;

import com.citizen.validetor.ValidRegularAmount;

@ValidRegularAmount
public class RegularAmount {

	public enum Frequency {
		WEEK, TWO_WEEK, FOUR_WEEK, MONTH, QUARTER, YEAR;
	}

	private Frequency frequency;


	private String amount;

	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
