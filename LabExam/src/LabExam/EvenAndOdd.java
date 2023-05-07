package LabExam;
import java.util.Scanner;
public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			if(number >= 2 && number <= 5) {
				System.out.println("Not Weird");
			}
			
			else if(number >= 6 && number <= 20) {
				System.out.println("Weird");
			}
			else if(number > 20) {
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}
	
}
