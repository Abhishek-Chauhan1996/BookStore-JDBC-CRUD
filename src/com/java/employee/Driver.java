package com.java.employee;

import java.sql.Connection;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Jdbc_Connection jd = new Jdbc_Connection();
		Connection con = jd.connect();
		Employee e = new Employee();
		EmployeeDAO ed = new EmployeeDAO();
		Scanner sc = new Scanner(System.in);

		System.out.println("What you want to do");
		System.out.println("Press 1 For insert employee data");
		System.out.println("Press 2 For Fetch the employee and Delete the employee");
		System.out.println("Press 3 For Update the Employee Deatils");
		int t = sc.nextInt();
		switch (t) {
		case 1:
			System.out.println("NAME");
			e.setEmpname(sc.next());
			System.out.println("ADDRESS");
			e.setAddress(sc.next());
			System.out.println("DATE OF BIRTH(YYYY-MM-DD");
			e.setDob(sc.next());
			System.out.println("DATE OF JOINNING(YYYY-MM-DD");
			e.setDoj(sc.next());
			System.out.println("EXPERIENCE");
			e.setExperience(sc.nextInt());
			System.out.println(e);

			int i = ed.insertEmployee(e, con);
			if (i != 0) {
				System.out.println("Data Inserted Succesfully");
				int eid = ed.getEmployeeId(e, con);
			}
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

}
