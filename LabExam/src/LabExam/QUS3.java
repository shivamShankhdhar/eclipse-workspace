package LabExam;
import java.util.Scanner;
public class QUS3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int sum = 0;
		int multiply = 1;
		while(number >0) {
			int r = number % 10;
			sum += r;
			multiply *= r;
			number = number / 10;
		}
		if(sum == multiply) {
			System.out.println("Number is Spy number");
		}else {
			System.out.println("Number is not Spy number");
		}
		sc.close();

	}

}
