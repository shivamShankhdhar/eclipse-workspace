package jdbc_project_practise;
import java.sql.*;
public class DBOperations {
	DBConnection b;
	Statement s1;
	
	public DBOperations() throws Exception{
		b = new DBConnection();
		s1= b.getStatement();
	}
	
	void insert() throws Exception{
		s1.execute("insert into student values(10,'piyush',23232)");
		System.out.println("inserted");
	}
	
	void delete() throws Exception{
		s1.execute("delete from student where RollNo = 1");
	}
	void update() throws Exception{
		s1.execute("update student set name = 'anybody' where RollNo=2");
	}
	
}
