package com.jpmc.ncdm.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList studentList = new ArrayList();

		studentList.add("Niranjan");
		studentList.add("Swamy");
		studentList.add("Dhruv");
		studentList.add("Rakesh");
		studentList.add("Anurag");
		studentList.add(123);
		studentList.add(456.52f);

		Iterator iterator = studentList.iterator();
		while (iterator.hasNext()) {
			/*
			 * String name = "Invalid Entry"; try { name = (String) iterator.next(); } catch
			 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 * System.out.println(name);
			 */
			// String name = (String) iterator.next();

			Object value = iterator.next();

			if (value instanceof String) {
				String name = (String) value;
				System.out.println(name);
			} else if (value instanceof Integer) {
				Integer intvalue = (Integer) value;
				System.out.println(intvalue);

			} else if (value instanceof Float) {
				Float intvalue = (Float) value;
				System.out.println(intvalue);

			}

		}

	}
}
