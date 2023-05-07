package InheritanceAssignment;
import InheritanceAssignment2.*;
import java.util.Scanner;
public class VehicleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many no of vehicle details you wants to store");
		int no_of_vehicles = sc.nextInt();
		int count =1;
		while(no_of_vehicles --> 0) {
			System.out.println("Enter choice of vehicle for vehicle: "+count);
			System.out.println("1------> Light Motor Vehicle");
			System.out.println("2------> Heavy Motor Vehicle");			
			Scanner ch = new Scanner(System.in);
			int choice = ch.nextInt();
			switch(choice) {
			case 1:
				LightMotorVehicle lv = new LightMotorVehicle();
				lv.input_details();
				lv.display_details();
				break;
			case 2:
				HeavyMotorVehicle hv = new HeavyMotorVehicle();
				hv.input_details();
				hv.display_details();
				break;
			default:System.out.println("Wrong Choice");
			}			
			count = count + 1;
			
		}
	}
}
