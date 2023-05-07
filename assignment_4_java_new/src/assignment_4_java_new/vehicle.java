package assignment_4_java_new;
import java.util.Scanner;

public class vehicle {
	String fuel_type;
	int r_no;
	int chesis_no;
}
class car extends vehicle{
	void input() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter fuel type");
		fuel_type = sc.next();
		
		System.out.println("Enter r_no type");
		r_no = sc.nextInt();
		
		System.out.println("Enter chesis type");
		chesis_no = sc.nextInt();
		
	}
	void show() {
		System.out.println("Fuel Type: "+fuel_type+ " Registration Number: "+r_no+" Chesis No: "+chesis_no);
	}
}

class bike extends vehicle{
	void get() {
		Scanner sc = new Scanner(System.in); 
//		System.out.println("Enter fuel type");
//		fuel_type = sc.next();
		
		System.out.println("Enter r_no type");
		r_no = sc.nextInt();
		
		System.out.println("Enter chesis type");
		chesis_no = sc.nextInt();
		
	}
	
	void display() {
		System.out.println(" Registration Number: "+r_no+" Chesis No: "+chesis_no);
	}
}
