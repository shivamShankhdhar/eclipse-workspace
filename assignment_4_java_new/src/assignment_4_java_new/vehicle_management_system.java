package assignment_4_java_new;
import java.util.Scanner;
public class vehicle_management_system {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1>>>>car");
		System.out.println("2>>>>bike");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			 System.out.println("Car Class Invoked");
			 car c = new car();
			 c.input();
			 c.show();
			 break;
		case 2:
			 System.out.println("Bike Class Invoked");
			 bike b = new bike();
			 b.get();
			 b.display();
			 break;
		default:System.out.println("Wrong Choice");
		}
	}
}
