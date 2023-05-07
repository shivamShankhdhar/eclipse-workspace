package MyShop;
import java.util.Scanner;
public class Customer {
    String cname;
    String address;
    int pincode;
    void getData() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Customer Name");
    	cname = sc.nextLine();
    	
    	Scanner sc1 = new Scanner(System.in);
    	System.out.println("Enter address");
    	address = sc1.nextLine();
    }
    void showData() {
    	System.out.println("Customer Name: "+cname + " "+ "Address: "+address);
    }
}
