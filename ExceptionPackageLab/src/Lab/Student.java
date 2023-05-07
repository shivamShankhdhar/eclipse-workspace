package Lab;
import java.io.*;
class AgeNotWithinTheRangeException extends Exception{
      public AgeNotWithinTheRangeException(String m) {
		super(m);
	}
}
class NameNotValidException extends Exception{
	public NameNotValidException(String m) {
		super(m);
	}
}
 class Student {
	 int roll_no;
	 String name;
	 int age;
	 String course;
	 public Student(int roll_no,String name, int age,String course){
		 this.roll_no = roll_no;
		 this.name = name;
		 this.age = age;
		 this.course = course;
	 }
	 void check_credentials() throws AgeNotWithinTheRangeException, NameNotValidException{
		 if(age <15 || age >21) { throw new AgeNotWithinTheRangeException("age not in the range");}
		 for(int i=0; i<name.length();i++) {
		 if (Character.isDigit(name.charAt(i))&& !Character.isLetter(name.charAt(i))
	                && !Character.isWhitespace(name.charAt(i))) throw new NameNotValidException("name not valid");
	 }}
}
 
//Q 4 Create a class Student with attributes roll no, name, age and
//course. Initialize values through parameterized constructor. If age of
//student is not in between 15 and 21 then generate user-defined exception
//“AgeNotWithinRangeException”. If name contains numbers or special
//symbols raise exception” NameNotValidException ”.
