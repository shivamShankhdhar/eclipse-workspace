package PracticeAssignment;
import java.util.Scanner;
public class NumberhAPPY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum=0;
		if(n>0) {
			while(n-->1) {
				int temp = n%10;
				sum =sum + temp * temp;
				n = n/10;
			}
		}
		if(sum != 1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
//Q 1  Write an algorithm to determine if a number n is happy.
//A  is a number defined by the following process:
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it  which does not include 1.
//Those numbers for which this process  are happy.
//Return true  n  false .
