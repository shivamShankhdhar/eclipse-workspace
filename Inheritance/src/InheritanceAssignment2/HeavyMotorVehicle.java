package InheritanceAssignment2;
import java.util.Scanner;
public class HeavyMotorVehicle extends Vehicle{
	double capacity_in_tons;
	final static String vehicle_type = "Heavy";
	public void display_details() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Capacity in tons");
		capacity_in_tons = sc2.nextDouble();
		System.out.println("Company Name: "+Vehicle.company);
		System.out.println("Vehicle Type: "+ vehicle_type);
		System.out.println("Capacity In Tons: "+ capacity_in_tons);
	}
}
