package collectionAssignment;
import java.util.*;
public class VectorQuestion {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("shivam");
		v.add("shraddha");
		v.add("aadhya");
		v.add("kavya");
		v.add("rohit");
		v.add("virat");
		
		System.out.println("--------Vector Elements----");
		for(var i:v) {
			System.out.println(i);
		}
		System.out.println("--------Vector Elements Has Code----");
		for(var i:v) {
			System.out.println(i.hashCode());
		}
		System.out.println("----Particular Element Value-----");
		System.out.println(v.get(3));
		
		System.out.println("----Size-----");
		System.out.println(v.size());
		
		System.out.println("----Capacity-----");
		System.out.println(v.capacity());
		
		System.out.println("----Adding Null Data-----");
		v.add(null);
		
		System.out.println("----Printing index of Null Data-----");
		System.out.println(v.indexOf(null));
		
		System.out.println("----Adding element at Particular Position-----");
		v.add(4,"added From Index Value");
		
		System.out.println("----Adding element at 5th Position-----");
		v.add(5,"added at 5th Position");
		
		System.out.println("----Removing Particular Element-----");
		v.remove(2);
		
		System.out.println("----Vector after all the operations-----");
		System.out.println(v);
	}
}


/*Q 2 write a program to create vector of string and add elements to vector
check vector class main functions like
1)adding elements in vector
2)traversing all vector elements
3)print vector object hashcode
4)get particular element value usin get function
5)print size and capacity of vector
6)add null data in vector
7)print index valueof null elements
hint v.indexOf(null)
8)add element at particular postition
hint
v.insertElementAt("",5);
9)remove particular element from vector
*/
