package jdbc_project_practise;

import java.sql.*;

public class DBConnection {
	Connection con;
	Statement s;
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			System.out.println("Connection Established");
			
		}catch(ClassNotFoundException e) {}
		catch(SQLException a) {}
		}
	
	public Statement getStatement() throws Exception{
		s = con.createStatement();
		return s;		
	}
}
