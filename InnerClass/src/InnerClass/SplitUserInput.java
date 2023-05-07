package InnerClass;
import java.util.Scanner;
public class SplitUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String full_name = sc.nextLine();
		String split_name[] = full_name.split(" ");
		System.out.println("-----------------output-------------");
		for(int i=0; i<split_name.length;i++) {
			if(i ==0 )System.out.println("First name: "+split_name[i]);
			if(i ==1 )System.out.println("Middle name: "+split_name[i]);
			if(i ==2 )System.out.println("Last name: "+split_name[i]);
			}
	 }
}
	

	
