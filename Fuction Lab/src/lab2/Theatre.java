package lab2;
import lab.TheatreBill;
import java.util.Scanner;

public class Theatre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much Pizza(s)");
		int pizza = sc.nextInt();
		
		System.out.println("How much Puff(s)");
		int puff = sc.nextInt();
		
		System.out.println("How much Coldrink(s)");
		int coldrinks = sc.nextInt();
		TheatreBill b = new TheatreBill(pizza,puff,coldrinks);
		b.generate_theatre_bill();

	}

}
