package Lab;
import java.util.Scanner;
public class AddmissionStudent {
	void AddStudent() {
		class Mtech implements Admission{
			@Override
			public void registeration() {
				System.out.println("------Inside Mtech Class");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter student name");
				String name = sc.nextLine();
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter roll no");
				int roll_no = sc1.nextInt();
				System.out.println("Name: "+name+" "+"ROLL NO: "+roll_no);
			}	
		}
		 new  Admission() {
			@Override
			public void registeration() {
				System.out.println("------Inside Anonymous Class");
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter roll no");
				int roll_no = sc1.nextInt();
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter address");
				String address = sc2.nextLine();
				System.out.println("------Output from Anonymous class");
				System.out.println("ROLL NO: "+roll_no+" "+"Address: "+address);
			}			
		 }.registeration(); 
		 Mtech o = new Mtech();
		 o.registeration();
	} public static void main(String[] args) {
		AddmissionStudent o = new AddmissionStudent();
		o.AddStudent();
	}
}