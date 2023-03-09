package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	// 1) make credential
	private static final String urlName="jdbc:mysql://localhost:3306/test";
	private static final String driverClass="com.mysql.cj.jdbc.Driver";
	private static final String userName="root";
	private static final String password="root";
	
	// 2) create getConnection method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3) load DriverClass
			Class.forName(driverClass);

			// 4) pass credential in DriverManager's getConnection method
			conn = DriverManager.getConnection(urlName, userName, password);
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
