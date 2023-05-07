package MyShop;
import java.util.Scanner;
public class AllData {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		int choice;
		System.out.println("Enter choice");
		System.out.println("1----->Flower");
		System.out.println("2----->Customer");
		choice = sc2.nextInt();
		while(choice>0) {
			switch(choice) {
			case 1:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Enter flower name");
				String name = sc3.nextLine(); 
				
				System.out.println("Enter number of petals");
				int no_of_petals= sc2.nextInt(); 
				
				System.out.println("Enter price");
				double price = sc2.nextDouble(); 
				
				System.out.println("Enter number of piece");
				int  no_of_piece = sc2.nextInt(); 
				
				System.out.println("Enter total price");
				double total_price = sc2.nextDouble(); 
				
				Flower o = new Flower(name, no_of_petals, price, no_of_piece, total_price);
				o.display();
				break;
			case 2:
				Customer c = new Customer();
				c.getData();
				c.showData();	
				break;
			default:System.out.println("Wrong Input");
			break;
			}
			System.out.println();
			System.out.println("Enter you choice");
			System.out.println("1----->Flower");
			System.out.println("2----->Customer");
			choice = sc2.nextInt();
		}
		
	}
}
