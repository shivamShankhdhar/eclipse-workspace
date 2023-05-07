package InheritanceAssignment;
import java.util.Scanner;
public class CurrentAccount extends Account{
	final static String ac_type= "Current Account";
	Scanner sc = new Scanner(System.in);
	double ac_balance = 0;
	
	int service_charge_imposed = 0;	
	void show_balance(){
		System.out.println("Account type: "
				+ ac_type+" Balance: "+ac_balance);
	}
	double charges_imposed() {
		if(ac_balance < 2000) {
			ac_balance = ac_balance - 2000;
			return ac_balance;
		}else {
			ac_balance = ac_balance - 0;
			return ac_balance;
		}
	}
}
