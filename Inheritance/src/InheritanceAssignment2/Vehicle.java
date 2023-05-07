package InheritanceAssignment2;
import java.util.Scanner;
public class Vehicle {
	static String company;
	double price;	
	public void input_details() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter company Name");
		company = sc1.next();
		
		System.out.println("Enter Price");
		price = sc1.nextDouble();
//		sc.close();
	}
}
