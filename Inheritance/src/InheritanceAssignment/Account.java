package InheritanceAssignment;
import java.util.Scanner; 
public class Account {
	void get_data() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customer_name = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int ac_number = sc1.nextInt();
	}
 double deposite(double balance) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Amount to Deposite");
	 double deposite_amount = sc.nextDouble();
	 balance = balance + deposite_amount;
	 return balance;
 }
 double withdrawl(double balance) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Amount to Withdrawl");
	 double withdrawl_amount = sc.nextDouble();
	 if(balance>0) {
		 if(balance > withdrawl_amount) {
			 balance = balance - withdrawl_amount;
		 }
		 return balance;
	 }return 0;
 }
}
