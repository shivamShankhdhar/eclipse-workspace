package jdbc_work;
import java.sql.*;
public class jdbc_1 {

	public static void main(String[] args) {
		try {
			//load database driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection url           protocol :subprotocol://ipaddress:portno/databasename","username","password"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement w = con.createStatement();
			w.execute("insert into studentrecord values(8,'jayesh',3443545)");
			w.execute("insert into studentrecord values(7,'kamal',4353545)");
			w.close();
			con.close();
		}catch(ClassNotFoundException e) {System.out.println(e);}
		 catch(SQLException a) {System.out.println(a);}
	}
}

