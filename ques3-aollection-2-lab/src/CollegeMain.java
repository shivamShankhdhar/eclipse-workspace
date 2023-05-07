import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

class compareTheElements implements Comparator<College>{
	@Override
	public int compare(College o1, College o2) {
		 return o1.college_name.compareTo(o2.college_name);
		}
 }
public class CollegeMain {
	
	public static void main(String[] args) {
		PriorityQueue<College> pq1 = new PriorityQueue<College>(new compareTheElements());
		pq1.add(new College("future institute","CS",563256));
		pq1.add(new College("jio institute", "IT",565623));
		pq1.add(new College("LPU", "CS",566232));
		pq1.add(new College("GLA","IT",52121));
		pq1.add(new College("GALGOTIA","CS",23233));
//		offer method
		pq1.offer(new College("BDVIC","IT",232323));
		System.out.println();
		System.out.println("------Priority Queue 1--------");
		Iterator<College> i = pq1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
//			count+=1;
		}
		
		PriorityQueue<College> pq2 = new PriorityQueue<College>(new compareTheElements());
		pq2.addAll(pq1);
		System.out.println();
		System.out.println("------Priority Queue 2--------");
		Iterator<College> i1 = pq2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println();
		int size = pq1.size();
		System.out.println("There are "+size+" Elements in the Priority Queue");
		Object top = pq1.peek();
		System.out.println();
		System.out.println("Item at the top: "+top);
		pq1.remove(top);
		System.out.println("Item removed from the top");
		size =pq1.size();		
		System.out.println();
		System.out.println("Item retrieved and removed: "+top);
		System.out.println();
		System.out.println("There are "+size+" Elements in the Priority Queue");
	}
}


/* iterate through all elements in  the priority queue.
c)  add all the elements of a priority queue to another priority queue
d) insert a given element into a priority queue. Hint use offer method
e) count the number of elements in a priority queue
f)  retrieve the first element of  the priority queue
g) retrieve and remove the first element
*/
