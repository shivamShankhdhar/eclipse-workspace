package lab2;
public class Electricity {
 public void generate_bill(int u) {
	 int bill=0;
	 
	 if(u<100) {
		bill = bill+ (u*10);
	 }else if(u>=100 && u<200){
		 bill = 100*10 + (u-100)*15;
	  }else if(u>=200 && u<300){
		 bill = 100*10 + 100*15 + (u-200)*20;
	  }else {
		  bill = 100*10 + 100*15 +100*20 + (u-300)*25; 
	  }
	 
	 System.out.println("Bill: "+bill);
	 }
}
