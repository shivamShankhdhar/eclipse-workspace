package TreeSetQuestion;
import java.util.*;
public class TreeSetQuestion {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("blue");
		ts.add("pink");
		ts.add("green");
		ts.add("red");
		ts.add("yellow");
		ts.add("cyan");
		ts.add("black");
		System.out.println("-------Tree Set------");
		Iterator<String> i =ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
//Q 4 Write a Java program to create a new tree set, add some colors (string) and print out the tree set.