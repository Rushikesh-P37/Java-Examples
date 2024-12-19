package com.test;

interface BankName {
	float rateOfInterest();
}

class SBI implements BankName {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements BankName {
	public float rateOfInterest() {
		return 9.7f;
	}
}

public interface Bank {
	public static void main(String[] args) {
		BankName b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
