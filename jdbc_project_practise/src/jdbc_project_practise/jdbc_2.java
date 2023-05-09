package jdbc_project_practise;
import java.sql.*;
public class jdbc_2 {
	public static void main(String[] args) {
		try {
			DBOperations o = new DBOperations();
			o.insert();
			System.out.println("----------INSERTED--------");
//			o.update();
//			System.out.println("----------UPDATED---------");
//			o.delete();
//			System.out.println("----------INSERTED--------");
		} catch (Exception e) {	}
	}
}
