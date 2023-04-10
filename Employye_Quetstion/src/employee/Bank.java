package employee;
import java.util.Scanner;
//a.    Data members
//i.      Name of depositor
//ii.    Account number
//iii.    Type of account
//iv.    Balance amount
//b.    Methods
//i.    To assign value  
//ii.    To deposit amount
//iii.    To withdraw amount
//iv.    To display name and balance .

class bankAccount{
	String account_holder_name;
	int account_number;
	String account_type;
	double account_balance = 0; //initially account balance 0
	
	void get() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder Name");
		account_holder_name = sc.nextLine();
		
		System.out.println("Enter Account Number");
		account_number = sc.nextInt();
		
		System.out.println("Enter Account Type");
		account_type = sc.next();	
	}
	void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposite");
		double temp = sc.nextDouble();
		account_balance = account_balance + temp;
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		double temp = sc.nextDouble();
		account_balance = account_balance - temp;
	}
	void display_name_address() {
		System.out.println("Account Holder Name: "+account_holder_name + " " + "Balance: "+account_balance);
	}
	
}
public class Bank {

	public static void main(String[] args) {
		bankAccount ba = new bankAccount();
		System.out.println("---------RUNNING GET METHOD-----------");
		ba.get();
		System.out.println("---------RUNNING DEPOSITE METHOD-----------");
		ba.deposite();
		System.out.println("---------RUNNING WITHDRAW METHOD-----------");
		ba.withdraw();
		System.out.println("---------RUNNING DISPLAY METHOD-----------");
		ba.display_name_address();		
		
	}

}
