package com.te.assignment.service;

import java.util.Scanner;

import com.te.assignment.dao.HImplementation;
import com.te.assignment.dao.HImplementation;
import com.te.assignment.dao.JDImplementation;
import com.te.assignment.dao.JDImplementation;

public class Implementation {
	static Scanner scn = new Scanner(System.in);

	public static void implement() {
		System.out.println("choose implementation method hibernate/jdbc");
		String implementation = scn.next();
		if (implementation.equalsIgnoreCase("hibernate")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = scn.nextInt();
			switch (inputFromUser) {
			case 1:
				HImplementation hImplementation1 = new HImplementation();
				hImplementation1.findAll();
				break;
			case 2:
				HImplementation hImplementation2 = new HImplementation();
				hImplementation2.getById();
				break;
			case 3:
				HImplementation hImplementation3 = new HImplementation();
				hImplementation3.delete();
				break;
			case 4:
				HImplementation hImplementation4 = new HImplementation();
				hImplementation4.update();
				break;
			case 5:
				HImplementation hImplementation5 = new HImplementation();
				hImplementation5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}
		if (implementation.equalsIgnoreCase("jdbc")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = scn.nextInt();
			switch (inputFromUser) {
			case 1:
				JDImplementation jdbcImplementation1 = new JDImplementation();
				jdbcImplementation1.findAll();
				break;
			case 2:
				JDImplementation jdbcImplementation2 = new JDImplementation();
				jdbcImplementation2.getById();
				break;
			case 3:
				JDImplementation jdbcImplementation3 = new JDImplementation();
				jdbcImplementation3.delete();
				break;
			case 4:
				JDImplementation jdbcImplementation4 = new JDImplementation();
				jdbcImplementation4.update();
				break;
			case 5:
				JDImplementation jdbcImplementation5 = new JDImplementation();
				jdbcImplementation5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}

	}

}
