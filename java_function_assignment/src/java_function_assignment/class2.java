package java_function_assignment;
import java.util.Scanner;
public class class2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class1 o = new class1();
		System.out.println("Enter your Choice");
		System.out.println("1 ---->>> Cube");
		System.out.println("2 ---->>> Square");
		System.out.println("3 ---->>> greater");
		int choice = sc.nextInt();
		while(choice != 0) {
		switch(choice) {
		
			case 1:	System.out.println("Enter number");
					int n =sc.nextInt();
					o.cube(n);
					break;
			case 2:	System.out.println("Enter number");
					int p =sc.nextInt();
					o.square(p);
					break;
			case 3:	System.out.println("Enter first number");
					int q =sc.nextInt();
					System.out.println("Enter second number");
					int r =sc.nextInt();
					System.out.println("Enter third number");
					int s =sc.nextInt();
					o.greater(q,r,s);
					break;
			default:System.out.println("Wrong Choice");
			}
		System.out.println("Enter your Choice");
		System.out.println("1 ---->>> Cube");
		System.out.println("2 ---->>> Square");
		System.out.println("3 ---->>> greater");
		choice = sc.nextInt();
		}
		sc.close();
	}

}
