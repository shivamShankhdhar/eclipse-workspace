package EMS2;
import java.util.Scanner;
public class Employee {
	int emp_no;
	String emp_name;
	double salary;
	int phone;
	public Employee(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Number");
			emp_no = sc.nextInt();
			
			System.out.println("Enter Employee Name");
			emp_name = sc.next();
			
			System.out.println("Enter Employee Salary");
			salary = sc.nextDouble();
			
			System.out.println("Enter Employee Phone");
			phone = sc.nextInt();
	}
	public Employee(int emp_no,String emp_name,double salary,int phone){
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.salary = salary;
		this.phone = phone;
	}
	public String toString() {
		return "Employee Number: "+emp_no+" Employee Name: "+emp_name+" Employee Salary: "+salary+" Employee Phone: "+phone;
	}
}

/*Q 4  1 Define package EMS2 Define a class Employee having fields like empno , ename ,  salary , phone
3 Define parameterized and no argument constructor
4 Also define Display method to display all employee record
5 Create another class MainEmployee having method
6 void sortEmp (Employee e[])
The above method sort the employee data in ascending order and display it
7 create main method that call sort Employee and pass Employee array to it
*/