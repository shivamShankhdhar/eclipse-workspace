package lab;
import lab2.Electricity;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units");
		int u = sc.nextInt();
		Electricity e = new Electricity();
		e.generate_bill(u);
		sc.close();
	}

}
