package employee;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		int leader[] = new int[t];
		int lead[]   = new int[t];
		for(int i=0; i<t; i++){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        if(n1>n2){
	            int temp  = n1-n2;
	            leader[i] = 1;
	            lead[i]   = temp;
	        }else{
	            int temp  = n2-n1;
	            leader[i] = 2;
	            lead[i]   = temp;
		      }
	        }
		    //leader and lead array are ready
		    int count = 0;
		    int greater = lead[0];
		    for(int k=0; k<t; k++){
		        for(int l=k+1;l<t; l++){
		            if(greater < lead[l]){
		                greater = lead[l];		                
		            }		         
		        }
		    }	
		    for(int i=0; i<lead.length;i++) {
		    	if(lead[i] == greater){
		    		count+=i;
		    	}
		    }
		    System.out.println(leader[count] + " "+greater);
//		    
	}

}
