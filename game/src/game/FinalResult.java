package game;
import java.util.Scanner;
public class FinalResult {
	static String compareScore(Player1 p1,Player2 p2){
		if(p1.play() > p2.play()) return "Player 1 winner";
		
		else if(p1.play()<p2.play()) return "Player 2 winner";
		return "";
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter details for player 1");
			System.out.println("Enter player name");
			String name1 = sc.next();
			System.out.println("Enter mobile");
			int mobile1 = sc.nextInt();
			System.out.println("Enter score");
			float score1 = sc.nextFloat();
			System.out.println("Enter details for player 2");
			System.out.println("Enter player name");
			String name2 = sc.next();
			System.out.println("Enter mobile");
			int mobile2 = sc.nextInt();
			System.out.println("Enter score");
			float score2 = sc.nextFloat();
			Player1 p1 = new Player1(name1,mobile1,score1);
			Player2 p2 = new Player2(name2,mobile2,score2);
			String result = compareScore(p1,p2);
			System.out.println(result);		
			}
	}




