package InheritanceAssignment2;
import java.util.Scanner;
public class LightMotorVehicle extends Vehicle{
	int mileage;
	final static String vehicle_type = "Light";
	public void display_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mileage");
		mileage = sc.nextInt();
		System.out.println("Company Name: "+ Vehicle.company);
		System.out.println("Vehicle Type: "+ vehicle_type);
		System.out.println("Mileage: "+ mileage);
	}
}
