package lab;
public class TheatreBill {
	int pizza, puff,coldrinks;
	public TheatreBill(int pizza, int puff, int coldrinks){
		this.pizza = pizza;
		this.puff = puff;
		this.coldrinks = coldrinks;		
	}
public void generate_theatre_bill() {
	int bill = ((pizza*100) + (puff*20) + (coldrinks*10));
	System.out.println("Bill: "+ bill);	
}
}
