package InheritanceAssignment;
import java.util.Scanner;

public class department extends Teacher{
	int dept_id;
	String dept_name;
	
	void getData() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Teacher name");
		tname = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Qualification");
		qualification = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Department Id");
		dept_id = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Department Name");
		dept_name = sc3.nextLine();
//		next line method has problem so that's why i have created seperate scanner objects
	}
	void showData() {
		System.out.println("College: "+ name_of_college);
		System.out.println("Department ID: "+dept_id);
		System.out.println("Department name: "+dept_name);
		System.out.println("Teacher Name: "+tname);
		System.out.println("Qualification: "+qualification);
		
	}
}
