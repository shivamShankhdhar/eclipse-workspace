package Lab;
import java.util.Scanner;
public class CheckingNumber {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		
		System.out.println("Output "+x/y);
		
		}catch(ArithmeticException d) {
			System.out.println("y should not be 0");
		}catch(Exception d) {
			System.out.println("x or y should be integer");
		}
	}
}

//Q 1 Take two integers and as input, you have to compute x/y . If x and
//y are not integers or if is zero , exception will occur and you have to
//report it. Read sample Input/Output to know what to report in case of
//exceptions.