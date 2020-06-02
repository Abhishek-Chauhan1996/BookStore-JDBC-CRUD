package com.java.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Connection {
	Connection con= null;
	public Connection connect() throws SQLException
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","abhishek","Abhishek@1996");
		System.out.println(con);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	}

}
