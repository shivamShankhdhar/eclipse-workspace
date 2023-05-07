package collectionAssignment;
import java.util.*;
public class MainStudent {

	public static void main(String[] args) {
		Student[] s = new Student[5];
		try(Scanner sc =new Scanner(System.in)){
			for(int i=0;i<5;i++) {
				System.out.println("Enter Student Detail "+(i+1));
				System.out.println();
				System.out.println("Enter Student Name");
				String name = sc.next();
				System.out.println("Enter Roll No");
				int roll_no = sc.nextInt();
				System.out.println("Enter Student Marks");
				float marks = sc.nextFloat();
				s[i]=new Student(name,roll_no,marks);	
			}
		}
		LinkedList<Student> li = new LinkedList<Student>(); 
		li.add(s[0]);
		li.add(s[1]);
		li.add(s[2]);
		li.add(s[3]);
		li.add(s[4]);
		Iterator<Student> i =li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}


/*Q 1 Write a program that ask student name ,rollno and marks from user .
Initilaize value of class using constructor.
define to string method in class
create Studentmain class to call all class function
Ask 5 record from user and store then in LinkedList and display all data

*/