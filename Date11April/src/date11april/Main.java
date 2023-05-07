package date11april;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice");
		System.out.println("1>>>>>abcProject");
		System.out.println("2>>>>>xyzProject");
		int c = sc.nextInt();
		Project r = null;
		switch(c) {
		case 1:
			r = new AbcProject();
			break;
		case 2:
			r = new xyzProject();
			
			break;
		default:System.out.println("Wrong Input");		
		}
		r.addProjectDetails();
		r.displayProjectDetails();
		
		

	}

}
