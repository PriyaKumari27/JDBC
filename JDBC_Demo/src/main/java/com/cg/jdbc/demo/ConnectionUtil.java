package com.cg.jdbc.demo;
import com.cg.jdbc.ems.exception.MyException;


import java.sql.*;
//import java.sql.Drivcom.cg.jdbc.demor
import java.sql.SQLException;


	public class ConnectionUtil {
		private static Connection connection;
		public static Connection getConnection() throws MyException {
			String url="jdbc:mysql://localhost:3306/testdb";
			String user="root";
			String password="toor";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				throw new MyException("Error while obatining Connection ");
			} catch (ClassNotFoundException e) {
				throw new MyException("Error while obatining Connection ");
			}
			return connection;
		}
		public static void main(String[] args) throws MyException {
			connection=ConnectionUtil.getConnection();
			if(connection!=null) System.out.println("Connection Obtained!!");
			else System.out.println("Connection NOT Obtained!!");
		}

	


}
