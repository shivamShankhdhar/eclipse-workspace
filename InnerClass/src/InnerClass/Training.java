package InnerClass;
import java.util.Scanner;
public class Training {
	int student_id;
	String name;
	String address;
	int phone;
	class onlineTraining{
		int duration;
		double onlineMarks;
		
		void getData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student Name");
			name = sc.nextLine();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter student address");
			address = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter student phone");
			phone = sc2.nextInt();
			
			System.out.println("Enter Course Duration");
			duration = sc2.nextInt();
			
			System.out.println("Enter Online Marks");
			onlineMarks = sc2.nextDouble();
			
		}
		void showData() {
			System.out.println("Student Name: "+name);
			System.out.println("Student Address: "+address);
			System.out.println("Student Phone: "+phone);
			System.out.println("Course Duration: "+duration);
			System.out.println("Online Marks: "+onlineMarks);
		}
	}
	class offlineTraining{
		boolean system_allocation;
		double offlineMarks;
		
		void getData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student Name");
			name = sc.nextLine();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter student address");
			address = sc1.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter student phone");
			phone = sc2.nextInt();
			
			System.out.println("System allocated");
			system_allocation = sc2.nextBoolean();
			
			System.out.println("Enter Offline Marks");
			offlineMarks = sc2.nextDouble();
			
		}
		void showData() {
			System.out.println("Student Name: "+name);
			System.out.println("Student Address: "+address);
			System.out.println("Student Phone: "+phone);
			System.out.println("Course Duration: "+system_allocation);
			System.out.println("Online Marks: "+offlineMarks);
		}
	}
	public static void main(String[] args) {
		Scanner scmain = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1----->Online Class");
		System.out.println("2----->Offline Class");
		int choice = scmain.nextInt();
		switch(choice) {
		case 1:
			Training t = new Training();
			Training.onlineTraining of = t.new onlineTraining();
			of.getData();
			of.showData();
			break;
		case 2:
			Training t1 = new Training();
			Training.offlineTraining on = t1.new offlineTraining();
			on.getData();
			on.showData();
			break;
		default:System.out.println("Wrong Input");
		}
	}
}
 