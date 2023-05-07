package InheritanceAssignment;
import java.util.Scanner;
class fruit{
	String fruit_name;
	String fruit_choice;	
	double price;
	fruit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fruit name");
		fruit_name = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter fruit choice");
		System.out.println("1---->Single Fruit");
		System.out.println("2---->Bunch Fruit");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				fruit_choice = "Single Fruit";
				break;
			case 2:
				fruit_choice = "Bunch Fruit";
				break;
			default:
				fruit_choice = "Wrong Choice";
		}
		
		System.out.println("Enter price");
		price = sc.nextInt();
		
	}
	void displayFruit(){
		System.out.println("Fruit Name: "+fruit_name+", Fruit Choice: "+fruit_choice+", Price: "+price);
	}
}
public class fruitMain {
	public static void main(String[] args) {
		fruit f = new fruit();
		f.displayFruit();
	}
}
