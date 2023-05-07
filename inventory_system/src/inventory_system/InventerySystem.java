package inventory_system;
import java.util.Scanner;
class Inventery{
	
	int product_id;
	String product_name;
	double product_price;
	
	void store(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product id");
		product_id = sc.nextInt();
		
		System.out.println("Enter product name");
		product_name = sc.nextLine();
		
		System.out.println("Enter product price");
		product_price = sc.nextDouble();
		
		sc.close();
	}	
	void show(){
		System.out.println(product_id + " " + product_name + " "+ product_price);
	}
	void search(Inventery[] ref){
		Scanner sc = new Scanner(System.in);
		System.out.println("Product Name to search");
		String pr_nm = sc.nextLine();
		for(int i=0; i<ref.length;i++){
			if(ref[i].product_name.equals(pr_nm)) {
			 System.out.println("Item Found");
			}			
		}
	}
}
public class InventerySystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items you eants to add");
		int n = sc.nextInt();
		Inventery invt[] = new Inventery[n];
		for(int i=0; i<n; i++) {
			invt[i]=new Inventery();
		}
		Inventery s = new Inventery();
		s.search(invt);

	}

}
