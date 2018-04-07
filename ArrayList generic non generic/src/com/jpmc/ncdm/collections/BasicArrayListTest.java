package com.jpmc.ncdm.collections;

import java.util.ArrayList;

public class BasicArrayListTest {

	public static void main(String[] args) {

		ArrayList studentList = new ArrayList();
		studentList.add("Niranjan");
		studentList.add("Swamy");
		studentList.add("Dhruv");
		studentList.add("Rakesh");
		studentList.add("Anurag");

		//studentList.add(1, "Swaroop");

		for (int index = 0; index < studentList.size(); index++) {
			System.out.println(studentList.get(index));
		}

		ArrayList javaStudentList = new ArrayList();
		javaStudentList.add("Kundana");
		javaStudentList.add("Bhagya");
		studentList.addAll(javaStudentList);

		studentList.remove(1);
		System.out.println(studentList);

		if (studentList.contains("Rakesh1")) {
			System.out.println("Element is exists");
		} else {
			System.out.println("Element not exists");
		}

	}

}
