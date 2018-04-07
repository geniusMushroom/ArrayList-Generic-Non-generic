package com.jpmc.ncdm.collections;

public class Customer {

	String name;
	int acctNumber;
	float balance;

	public Customer(String name, int acctNumber, float balance) {
		this.name = name;
		this.acctNumber = acctNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", acctNumber=" + acctNumber + ", balance=" + balance + "]";
	}

}
