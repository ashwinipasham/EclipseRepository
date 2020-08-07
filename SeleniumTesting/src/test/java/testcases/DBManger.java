package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManger {
	
	//Class.forName("com.sql.jdbc.driver");
	public static String url = "jdbc:sqlserver://APASHAM-17122;databaseName=SeleniumTestData;integratedSecurity=true";
		//user=<user>;password=<password>\";\r\n";
	
	//String connectionUrl =
     //       "jdbc:sqlserver://192.168.199.221:1433;databaseName=TestDB;integratedSecurity=true";


		public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null; 
		Statement stmt = null;
		
		System.out.println("Connecting to SQL server Database");
		conn = DriverManager.getConnection(url); 
		
		System.out.println("Creating Statement");
		stmt = conn.createStatement();
		String sql; 
		
		sql = "select * from Employee"; 
		
		ResultSet rs = stmt.executeQuery(sql);
		
		rs.close();
		stmt.close();
		conn.close();
		
		System.out.println("Connection closed!");
		
			

	}

}
