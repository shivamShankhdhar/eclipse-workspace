package InheritanceAssignment;
import java.lang.Math;
public class SavingsAccount extends Account{
	final static String ac_type= "Saving Account";
	double ac_balance = 0;
	final double interest_rate = 2.5;
	void show_balance(){
		System.out.println("Account type: "
				+ ac_type+","+" Balance: "+ac_balance);
	}
	double compound_interest(double ac_balance, int time) {
		double compound_interest = ac_balance*(Math.pow((1+interest_rate/100),time))-ac_balance;
		ac_balance = ac_balance + compound_interest;
		return ac_balance;
	}
}

