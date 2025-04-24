package jdbc;

import java.sql.*;

public class MySQLConnect {
	public static void main(String[] args) throws SQLException {
		//database URL, username and password
		String url="jdbc:mysql://localhost:3306/GLA";
		String user="root";
		String password="SQL121";
		try {
			//load the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("connected to MySQL");
			
			//example query
			String query="INSERT INTO MCA VALUES(3,'luv'),(4,'kush')";
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(query);
			
			stmt.close();
			conn.close();
		}
		catch(ClassNotFoundException e){
			System.out.println("class not found");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}
		
	}
}
