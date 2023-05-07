package lab;
import java.util.Scanner;
public class checkArmstrong {
    static void check_for_armstrong(int n) {
    	int sum=0;
    	int number = n;
    	while(n>0)    
    	{    
	    	int r=n%10;
	    	sum=sum+(r*r*r);    
	    	n=n/10;    
    	}  
    	if(sum == number) {
    		System.out.println("Number is Armstrong");
    	}else {
    		System.out.println("Number is not Armstrong");
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		check_for_armstrong(n);
		sc.close();
	}
}
