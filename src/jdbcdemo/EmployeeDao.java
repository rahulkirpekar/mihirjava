package jdbcdemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao 
{
	public int insert(EmployeeBean bean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES('"+bean.getName()+"','"+bean.getSalary()+"','"+bean.getDsgn()+"','"+bean.getOrgName()+"')";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Db not Connected : " + conn);
		}
		return rowAffected;
	}
	public void update() 
	{

	}
	public void delete() 
	{

	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		EmployeeBean bean = new EmployeeBean(0, "perni", "213245", "SE", "royal");
		
		EmployeeDao dao = new EmployeeDao();
		
		int rowsAffected = dao.insert(bean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Employee records successfully inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Employee records not inserted : " + rowsAffected);
		}

	}

}
