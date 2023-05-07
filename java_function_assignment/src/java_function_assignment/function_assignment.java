package java_function_assignment;
import java.util.Scanner;
class Greater {
	void greater() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		System.out.println("Enter Third Number");
		int c = sc.nextInt();
		
		int r = (a>b?(a>c?a:c):(b>c?b:c));
		System.out.println("Greater Number is "+r);
		
	}
	void greater(int a, int b) {
		int r = (a>b?a:b);
		System.out.println("Greater Number is "+r);
		
	}
	void greater(int a, int b, int c) {
		int r = (a>b?(a>c?a:c):(b>c?b:c));
		System.out.println("Greater number is "+ r);
	}
	
}

public class function_assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Greater g1 = new Greater();
		
		System.out.println("------------RUNNING FIRST FUNCTION---------------");
		g1.greater();
		
		System.out.println("------------RUNNING SECOND FUNCTION---------------");
		System.out.println("Enter first number");
		int fn = sc.nextInt();
		
		System.out.println("Enter Second number");
		int sn = sc.nextInt();
		g1.greater(fn, sn);
		
		System.out.println("------------RUNNING THIRD FUNCTION---------------");
		System.out.println("Enter First number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number");
		int c = sc.nextInt();
		g1.greater(a, b, c);
		sc.close();
	}

}
