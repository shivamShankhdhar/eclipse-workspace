package InheritanceAssignment;
import java.util.Scanner;
public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of account");
		System.out.println("1----->SAVINGS ACCOUNT");
		System.out.println("2----->CURRENT ACCOUNT");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
				SavingsAccount sa = new SavingsAccount();
				sa.get_data();
				sa.ac_balance = sa.deposite(sa.ac_balance);
				
				double temp = sa.withdrawl(sa.ac_balance);
				if(temp >0) {
					sa.ac_balance = temp;
				}
				else System.out.println("Balance not sufficient");
				sa.show_balance();
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Do you wants to Calculate Compound interest");
				System.out.println("1----->YES");
				System.out.println("2----->NO");
				int choice_for_compound_interest = sc1.nextInt();
				switch(choice_for_compound_interest) {
				case 1:
					System.out.println("Enter time to calculate Compound Interest");
					int time = sc1.nextInt();
					sa.ac_balance = sa.compound_interest(sa.ac_balance, time);
					System.out.println("Account Balance after adding Interest: "+sa.ac_balance);					
					break;
				case 2:
					break;
				}
				break;
		case 2:
				CurrentAccount ca = new CurrentAccount();
				ca.get_data();
				ca.ac_balance = ca.deposite(ca.ac_balance);
				ca.ac_balance = ca.charges_imposed();
//				System.out.println(ca.ac_balance);
				double temp1 = ca.withdrawl(ca.ac_balance);
				
				ca.show_balance();
				break;
		default:System.out.println("Wrong Choice");
		}
	}
}
