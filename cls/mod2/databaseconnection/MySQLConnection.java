package databaseconnection;
import java.sql.*;
//import com.mysql.jdbc.*;
public class MySQLConnection {
	public static void main(String[] args) {
		
		//database url username and password
		String url="jdbc:mysql://localhost:3306/GLA";
		String user="root";
		String password="SQL121";
		
		try {
			//load the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection 
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("Connected to MYSQL database!");
			//example query
			String query="INSERT INTO MCA VALUES(105,'John Wich'),(106,'Belarina')";
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(query);
			
			stmt.close();
			conn.close();
			
		}catch(ClassNotFoundException e){
			//
			System.out.println("MYSQL JDBC Driver not found");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		
	}
}
