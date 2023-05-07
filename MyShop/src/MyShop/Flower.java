package MyShop;
public class Flower {
   String name;
   int no_of_petals;
   double price;
   int no_of_piece;
   double total_price;
   Flower(){
	   name         = "Rose";
	   no_of_petals = 1;
	   price        = 10;
	   no_of_piece  = 10;
	   total_price  = 100;
   }
   Flower(String name, int no_of_petals, double price, int no_of_piece, double total_price){
	   this.name         = name;
	   this.no_of_petals = no_of_petals;
	   this.price        = price;
	   this.no_of_piece  = no_of_piece;
	   this.total_price  = total_price;
   }
   int calculate_discount(double total_price) {
	   if(total_price > 2000.00) return 200;
	   else return 100;
   }
   void display() {
	   System.out.println("Name: " + name+ " No of Petals: "+no_of_petals+"Price:  "+price + "No of Piece: "
	   		+ " "+no_of_piece + "Total price:  "+ total_price );
	   double temp = calculate_discount(total_price);
	   total_price = total_price - temp;
	   System.out.println("Values after Discount");
	   System.out.println("Name: " + name+ " No of Petals: "+no_of_petals+"Price:  "+price + "No of Piece: "
	   		+ " "+no_of_piece + "Total price:  "+ total_price );
   }
}