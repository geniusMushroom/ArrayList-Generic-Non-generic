package com.jpmc.ncdm.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenerivArrayList {

	public static void main(String[] args) {

		ArrayList<String> employeeList = new ArrayList<String>();
		employeeList.add("Dhruv");
		employeeList.add("Swamy");
		employeeList.add("Anurag");
		// employeeList.add(125);
		employeeList.add("Rakesh");
		employeeList.add("Niranjan");

		/*
		 * Iterator<String> empIt = employeeList.iterator(); while(empIt.hasNext()) {
		 * //String name = (String)empIt.next(); String name = empIt.next();
		 * System.out.println(name); }
		 */

		for (String name : employeeList) { // name=Niranjan
			System.out.println(name);
		}

	}

}
