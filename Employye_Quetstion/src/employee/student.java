package employee;
//String variable 'sname' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" while creating an object of the class Student.
//and using display method show all values on console.

class studentRecord{
	String student_name;
	int roll_no;
	public studentRecord(String student_name,int roll_no){
		this.student_name = student_name;
		this.roll_no = roll_no;
	}
	void display() {
		System.out.println("Student name: "+" "+student_name+" "+"Student roll no:"+roll_no);
	}	
}
public class student {
	public static void main(String[] args) {
		studentRecord sr = new studentRecord("shivam shankhdhar", 19);
		sr.display();
		
		studentRecord sr1 = new studentRecord("shraddha shankhdhar", 20);
		sr1.display();
		
		studentRecord sr2 = new studentRecord("shiddh shankhdhar", 21);
		sr2.display();
	}
}
