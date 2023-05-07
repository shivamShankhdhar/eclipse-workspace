package tesf;
//import java.util.Scanner;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(2*x > 5*y ){
		        System.out.print("Chocolate");
		    }else if (2*x == 5*y){
		        System.out.print("Either");
		    }else{
		        System.out.print("Candy");
		    }
		    
		}
		sc.close();
	}

}
