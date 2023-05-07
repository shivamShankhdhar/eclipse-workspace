package collectionAssignment;

public class Student {
	String student_name;
	int roll_no;
	float marks;
	public Student(String student_name,int roll_no,float marks) {
		this.student_name = student_name;
		this.roll_no      = roll_no;
		this.marks        = marks;
	}
	public String toString() {
		return "Student Name: "+student_name+" Roll No: "+roll_no+" Marks: "+marks;
		
	}
}
