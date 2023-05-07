package collection_lab_package;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

class linkedExample{
	String name;
	int roll_no;
	double marks;
	linkedExample(String name,int roll_no,double marks){
		this.name 	 = name;
		this.roll_no = roll_no;
		this.marks   = marks;
	}
	String tostring() {
		String temp = "Name: "+name+" Roll No: "+roll_no+" Marks:"+marks;
		return temp;
	}
}

public class ques1 {

	public static void main(String[] args) {
		
		Queue<linkedExample> l = new PriorityQueue<linkedExample>();
		linkedExample l1 = new linkedExample("shivam",1,100);
		linkedExample l2 = new linkedExample("aman",2,1000);
		linkedExample l3 = new linkedExample("shraddha",3,10000);
		linkedExample l4 = new linkedExample("aadhya",4,100000);
		linkedExample l5 = new linkedExample("kavya",5,10000000);
		l.add(l5);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
//		l.add(l5);
		System.out.println(l);
	}
}
