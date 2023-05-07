import java.util.Scanner;

public class College {
	String college_name;
	String branch;
	double fees;
	public College(String college_name, String branch,double fees){
		this.college_name = college_name;
		this.branch = branch;
		this.fees = fees;
	}
	public String toString() {
		return college_name + " "+branch+" "+fees;
	}
}



