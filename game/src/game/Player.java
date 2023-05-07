package game;
import java.util.Scanner;
public abstract class Player {
	String name;
	int  mobile_no;
	float score;
	abstract float play();
	Player(){
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter player name");
		name = sc.next();
		System.out.println("Enter Mobile");
		mobile_no = sc.nextInt();
		System.out.println("Enter score");
		score = sc.nextFloat();
		 
		}
	}
	Player(String name,int mobile_no,float score){
		this.name 		= name;
		this.mobile_no  = mobile_no;
		this.score      = score;
	}
}

