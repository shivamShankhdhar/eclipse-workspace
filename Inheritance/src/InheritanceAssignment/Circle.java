package InheritanceAssignment;
import java.util.Scanner;
public class Circle {
	int radius;
	int cx;
	int cy;
	int x;
	int y;
	Circle(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		radius = sc.nextInt();
		
		System.out.println("Enter Center cordinate x ");
		cx = sc.nextInt();
		
		System.out.println("Enter Center cordinate y ");
		cy = sc.nextInt();
	}
	
	void area() {
		System.out.println("Calculating Area of circle........");
		double area = 3.14*radius*radius;
		System.out.println("Area: "+area);
	}
	
	void isInsideCircle(int radius){
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter x cordinate");
		x = sc.nextInt();
		
		System.out.println("Enter y cordinate");
		y = sc.nextInt();
		
		System.out.println("Checking for points........");
		int dist = (x - cx) * (x - cx) + (y - cy) * (y - cy);
		   if ( dist <= radius * radius)
		      System.out.println("Inside Circle");
		   else
			   System.out.println("Outside Circle");
	}
}

