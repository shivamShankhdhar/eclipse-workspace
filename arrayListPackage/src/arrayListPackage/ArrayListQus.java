package arrayListPackage;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListQus {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("dgfs");
		al.add("dgfs");
		al.add("dgfs");
		al.add("poygs");
		al.add("rtgff");
		al.add("potyhg");
		al.add("452kjgb");
		al.add("dgfs");
		System.out.println("-----------List items before-------");
		System.out.println(al);
		al.add(5, "CDAC");
		String e = al.get(3);
		al.add(e);
		System.out.println();
		System.out.println("-----------List items After-------");
		
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
