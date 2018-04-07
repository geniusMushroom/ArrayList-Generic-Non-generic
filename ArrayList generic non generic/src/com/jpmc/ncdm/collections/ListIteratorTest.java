package com.jpmc.ncdm.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer cust1 = new Customer("Dhruv", 12345, 345.56f);
		customerList.add(cust1);

		Customer cust2 = new Customer("Swaroop", 7890, 678.56f);
		customerList.add(cust2);

		Customer cust3 = new Customer("Anurag", 7891, 678.56f);
		customerList.add(cust3);

		Customer cust4 = new Customer("Niranjan", 7891, 678.56f);
		customerList.add(cust4);

		Customer cust5 = new Customer("Swamy", 7891, 678.56f);
		customerList.add(cust5);

		Customer cust6 = new Customer("Rakesh", 7891, 678.56f);
		customerList.add(cust6);

		/*
		 * Iterator<Customer> custIte = customerList.iterator();
		 * while(custIte.hasNext()) { System.out.println(custIte.next()); }
		 */

		// ListIterator<Customer> custIte =
		// customerList.listIterator(customerList.size());
		// ListIterator<Customer> custIte =
		// customerList.listIterator(customerList.size()-1);
		ListIterator<Customer> custIte = customerList.listIterator(2);
		/*
		 * while(custIte.hasNext()) { System.out.println(custIte.next()); }
		 */
		/*
		 * while(custIte.hasPrevious()) { System.out.println(custIte.previous()); }
		 */

		while (custIte.hasNext()) {
			System.out.println(custIte.next());
		}

	}
}
