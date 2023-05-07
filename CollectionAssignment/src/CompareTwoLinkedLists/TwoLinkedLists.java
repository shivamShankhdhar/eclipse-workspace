package CompareTwoLinkedLists;
import java.util.*;
public class TwoLinkedLists {

	public static void main(String[] args) {
		LinkedList<String> first_list = new LinkedList<String>();
		first_list.add("shivam");
		first_list.add("shraddha");
		first_list.add("shiddh");
		first_list.add("kavya");
		
		LinkedList<String> second_list = new LinkedList<String>();
		second_list.add("shivam");
		second_list.add("shraddha");
		second_list.add("shiddh");
		second_list.add("kavya");
		
		boolean has = first_list.containsAll(second_list);
		if(has) System.out.println("Lists are same");	
		else System.out.println("Lists are not same");
	}

}

