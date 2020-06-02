package com.java.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

	public int insertEmployee(Employee e, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into employee (empname,emp_add,doj,exp,dob) values(?,?,?,?,?)";
		PreparedStatement p = con.prepareStatement(sql);
		p.setString(1, e.getEmpname());
		p.setString(2, e.getAddress());
		p.setString(3, e.getDoj());
		p.setInt(4, e.getExperience());
		p.setString(5, e.getDob());
		int i = p.executeUpdate();
		return i;

	}

	public int getEmployeeId(Employee e, Connection con) {
		return 0;

	}

}
