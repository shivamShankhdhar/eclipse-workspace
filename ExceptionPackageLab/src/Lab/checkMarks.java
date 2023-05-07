package Lab;
import java.util.Scanner;
class UserDefinedException extends Exception{
	public UserDefinedException(String m) {
		super(m);
	}
	static void check(int internal, int external) throws UserDefinedException{
		if(internal>40) throw new UserDefinedException("internal mark is exceed");
		if(external>60) throw new UserDefinedException("external marks is exceed");
	}
}
	
	 
public class checkMarks{
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Internal Marks");
			
			int internal = sc.nextInt();
			System.out.println("Enter External Marks");
			
			int external = sc.nextInt();
			UserDefinedException.check(internal, external);
			System.out.println("Executed Succesfully");
		}catch(UserDefinedException d) {
			System.out.println(d.getMessage());
		}
	}
}


/*Q 3 Write a program for user defined Exception that checks the external
and internal marks if the internal marks is greater than 40 it raise the
exception internal mark is exceed, if the external mark is greater than 60
exception is raised and display the message the external marks is exceed,
create the above exception and use it in your program.
*/