package lab;
import java.util.Scanner;
//°C = (°F – 32) / (9/5)

public class Main{
	
	    static void fahrenhite_to_celcius(int temperature_in_fahrenhite) {
		int Celcius = ((temperature_in_fahrenhite - 32)*5)/9;
		System.out.println("Temperature in Celcius "+Celcius);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenhite");
		int temperature_fahrenhite = sc.nextInt();
		fahrenhite_to_celcius(temperature_fahrenhite);
		sc.close();
	}
}
