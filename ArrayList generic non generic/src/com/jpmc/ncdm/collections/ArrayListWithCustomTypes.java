package com.jpmc.ncdm.collections;

import java.util.ArrayList; 
import java.util.Iterator;

public class ArrayListWithCustomTypes {

	public static void main(String[] args) {

		// Dhruv,12345,345.56f
		// Anurag,7890,678.56f

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer cust1 = new Customer("Dhruv", 12345, 345.56f);
		customerList.add(cust1);

		Customer cust2 = new Customer("Swaroop", 7890, 678.56f);
		customerList.add(cust2);

		Customer cust3 = new Customer("Anurag", 7891, 678.56f);
		customerList.add(cust3);
		/*
		 * for(Customer cust:customerList) { System.out.println(cust); }
		 */

		// customerList.remove(1);

		Iterator<Customer> custIte = customerList.iterator();
		while (custIte.hasNext()) {
			Customer cust = custIte.next();
			// System.out.println(cust);
			/*
			 * if(cust.acctNumber == 7890) { custIte.remove(); }
			 */
			if (cust.acctNumber == 7890) {
				customerList.remove(cust);
			}
		}

		for (Customer cust : customerList) {
			System.out.println(cust);
		}

	}
}
